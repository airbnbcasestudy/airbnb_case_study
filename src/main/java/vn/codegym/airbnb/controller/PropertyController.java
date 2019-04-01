package vn.codegym.airbnb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.codegym.airbnb.common.RestFb;
import vn.codegym.airbnb.dto.PropertyImageDTO;
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
    public String login() {
        return  "index";
    }

    @RequestMapping("/rooms/detail/{id}")
    public String detailProperty(@PathVariable("id") int id, Model model){
        Properties properties = propertiesMapper.findById(id);
       // List<PropertiesImg> propertiesImgList = propertiesImgMapper.findById(id);
        model.addAttribute("properties", properties);
        return "/rooms/detail";
    }
}
