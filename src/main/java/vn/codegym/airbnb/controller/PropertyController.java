package vn.codegym.airbnb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import vn.codegym.airbnb.common.RestFb;
import vn.codegym.airbnb.dto.PropertyImageDTO;
import vn.codegym.airbnb.dto.UserDTO;
import vn.codegym.airbnb.form.PropertiesForm;
import vn.codegym.airbnb.mapper.PropertiesImgMapper;
import vn.codegym.airbnb.mapper.PropertiesMapper;
import vn.codegym.airbnb.mapper.PropertyImageDTOMapper;
import vn.codegym.airbnb.model.Properties;
import vn.codegym.airbnb.model.PropertiesImg;

import java.util.List;

@Controller
public class PropertyController {
    //private static final String BASE_DIR = "/";

    @Autowired
    private PropertyImageDTOMapper propertyImageDTOMapper;
    @Autowired
    private PropertiesImgMapper propertiesImgMapper;
    @Autowired
    private PropertiesMapper propertiesMapper;

    @RequestMapping(value ="/")
    public String login(Model model) {
        UserDTO userDTO = new UserDTO();
        model.addAttribute("userDTO", userDTO);

        return "/index";
    }
    @RequestMapping(value = "/forlease")
    public String forLeasePage(){

        return "/rooms/create";
    }




//    @RequestMapping("/rooms/detail/{id}")
//    public String detailProperty(@PathVariable("id") int id, Model model){
//        Properties properties = propertiesMapper.findById(id);
//       // List<PropertiesImg> propertiesImgList = propertiesImgMapper.findById(id);
//        model.addAttribute("properties", properties);
//        return "/rooms/detail";
//    }

//    @RequestMapping("/rooms/create")
//    @ResponseBody
//    public void create(Model model,@RequestBody PropertiesForm form, List<MultipartFile> imgs){
//        PropertiesForm dto = new PropertiesForm();
//        dto.setName(form.getName());
//    }
}
