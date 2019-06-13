package vn.codegym.airbnb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import vn.codegym.airbnb.common.RestFb;
import vn.codegym.airbnb.dto.PropertyImageDTO;
import vn.codegym.airbnb.dto.ReviewsDTO;
import vn.codegym.airbnb.dto.UserDTO;
import vn.codegym.airbnb.form.PropertiesForm;
import vn.codegym.airbnb.mapper.*;
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
    @Autowired
    private ReviewsMapper reviewsMapper;
    @Autowired
    private BookingDetail bookingDetail;


    @RequestMapping(value ="/")
    public String login(Model model) {
        UserDTO userDTO = new UserDTO();
        model.addAttribute("userDTO", userDTO);

        return "/index";
    }


    @RequestMapping(value = "/forlease", method = RequestMethod.GET)
    public String forLeasePage(){

        return "rooms/create";
    }


    @RequestMapping(value = "/rooms/detail/{id}", method = RequestMethod.GET)
    public String detailProperty(@PathVariable("id") int id, Model model){
        Properties properties = propertiesMapper.findById(id);
        List<ReviewsDTO> reviewsDTOs = reviewsMapper.selectAllById(properties.getId());
        List<PropertiesImg> propertiesImgList = propertiesImgMapper.findByPropertiesId(id);
        model.addAttribute("properties", properties);
        model.addAttribute("propertiesImgs", propertiesImgList);
        model.addAttribute("reviewsList", reviewsDTOs);

        return "rooms/detail";
    }

    @RequestMapping(value = "/booking/{id}", method = RequestMethod.GET)
    public String bookingDetail(@PathVariable("id") int id,  Model model) {
        List<BookingDetail> bookingDetailList = bookingDetail.selectAllBooking(id);
        model.addAttribute("bookingDetailList", bookingDetailList);

        return "rooms/booking";
    }


}
