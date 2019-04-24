package vn.codegym.airbnb.serviceAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import vn.codegym.airbnb.controller.UploadForm;
import vn.codegym.airbnb.dto.PropertyImageDTO;
import vn.codegym.airbnb.dto.UserDTO;
import vn.codegym.airbnb.form.PropertiesForm;
import vn.codegym.airbnb.mapper.PropertiesImgMapper;
import vn.codegym.airbnb.mapper.PropertiesMapper;
import vn.codegym.airbnb.mapper.PropertyImageDTOMapper;
import vn.codegym.airbnb.mapper.UserMapper;
import vn.codegym.airbnb.model.Limit;
import vn.codegym.airbnb.model.Properties;
import vn.codegym.airbnb.model.PropertiesImg;
import vn.codegym.airbnb.model.User;


import javax.print.attribute.standard.Media;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
public class APIController {

    @Autowired
    private PropertiesImgMapper propertiesImgMapper;
    @Autowired
    private PropertiesMapper propertiesMapper;
    @Autowired
    private UserMapper userMapper;

    private PropertyImageDTOMapper propertyImageDTOMapper;

    public APIController(PropertyImageDTOMapper propertyImageDTOMapper) {
        this.propertyImageDTOMapper = propertyImageDTOMapper;
    }

    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public User signInUser(@RequestBody UserDTO userDTO){
        User verifyUser = userMapper.findByEmail(userDTO.getEmail());

        return verifyUser;
    }


    @RequestMapping(value = "/properties", method = RequestMethod.GET)
    public @ResponseBody List<Properties> propertyImageDTOList(HttpServletRequest request){
        String limit = request.getParameter("limit");
        int lim = Integer.parseInt(limit);
        return propertiesMapper.selectPaging(lim);
    }


//    @RequestMapping("/rooms/detail/{id}")
//    public List<PropertyImageDTO> detailProperty(@PathVariable("id") int id){
////        PropertyImageDTO propertyImageDTO = propertyImageDTOMapper.findById(id);
//        List<PropertyImageDTO> propertyImageDTO = propertyImageDTOMapper.findByIdPropertyImg(id);
////        Properties properties = propertiesMapper.findById(id);
//        return propertyImageDTO;
//    }

    private static String UPLOAD_DIR = "E:/CodeGym Viet Nam/Spring MVC Project/airbnb_case_study_springboot/src/main/resources/static/image";

    @PostMapping("/rooms/upload")
    public ResponseEntity<?> multiUploadFileModel(@ModelAttribute PropertiesForm prf) {
        Properties properties = new Properties(prf.getNameHouse(), prf.getEditorDescription(),1,
                prf.getHouseType(), prf.getAddress(), prf.getBedRooms(), prf.getBathRooms(), prf.getPrice(),true, "");
        propertiesMapper.insert(properties);

        Properties maxId = propertiesMapper.findByMaxId();
        int id = maxId.getId();

        String[] pathImage = new String[10];
        try {
            MultipartFile[] files = prf.getImages();

            File uploadDir = new File(UPLOAD_DIR);
            uploadDir.mkdirs();
            StringBuilder sb = new StringBuilder();

            for (MultipartFile file : files) {
                int index = 0;
                if (file.isEmpty()) {
                    continue;
                }
                String uploadFilePath = UPLOAD_DIR + "/" + file.getOriginalFilename();
                pathImage[index] = "/resources/image/" + file.getOriginalFilename();
                PropertiesImg propertiesImg = new PropertiesImg(id, pathImage[index]);
                propertiesImgMapper.insert(propertiesImg);
                index++;
                byte[] bytes = file.getBytes();
                Path path = Paths.get(uploadFilePath);
                Files.write(path, bytes);
            }

            maxId.setImageDefault(pathImage[0]);
            propertiesMapper.updateImagePath(maxId);
        }
        catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity<>("Error: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>("Success", HttpStatus.OK);
    }
}
