package vn.codegym.airbnb.serviceAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.codegym.airbnb.dto.PropertyImageDTO;
import vn.codegym.airbnb.mapper.PropertiesImgMapper;
import vn.codegym.airbnb.mapper.PropertiesMapper;
import vn.codegym.airbnb.mapper.PropertyImageDTOMapper;
import vn.codegym.airbnb.model.Properties;
import vn.codegym.airbnb.model.PropertiesImg;


import java.util.List;

@RestController
public class APIController {

    @Autowired
    private PropertiesImgMapper propertiesImgMapper;
    @Autowired
    private PropertiesMapper propertiesMapper;

    private PropertyImageDTOMapper propertyImageDTOMapper;

    public APIController(PropertyImageDTOMapper propertyImageDTOMapper) {
        this.propertyImageDTOMapper = propertyImageDTOMapper;
    }

    @RequestMapping("/properties")
    public List<PropertyImageDTO> propertyImageDTOList(){
        return propertyImageDTOMapper.selectAll();
    }


//    @RequestMapping("/rooms/detail/{id}")
//    public Properties detailProperty(@PathVariable("id") int id){
//        //PropertyImageDTO propertyImageDTO = propertyImageDTOMapper.findById(id);
//        //List<PropertiesImg> propertiesImgList = propertiesImgMapper.findById(id);
//        //Properties properties = propertiesMapper.findById(id);
//        return properties;
//    }
}
