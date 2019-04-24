package vn.codegym.airbnb.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import vn.codegym.airbnb.dto.UserDTO;
import vn.codegym.airbnb.mapper.UserMapper;
import vn.codegym.airbnb.model.User;


@Controller
@SessionAttributes("myUser")
public class LoginController {
    @Autowired
    public UserMapper userMapper;

    @ModelAttribute("myUser")
    private User myUser(){
        return new User();
    }

    private static final String BASE_DIR = "/login";

//    @RequestMapping(value = "/login/signin")
//    public String loginWithUser(@ModelAttribute("userDTO") UserDTO myUser, Model model){
//        String email = myUser.getEmail();
//        String password = myUser.getPassword();
//
//        User user = userMapper.findByEmail(email);
//        if(user != null && password.equals(user.getPassword())){
//            return "redirect:/";
//        }else {
//            model.addAttribute("message", "Not Email");
//            return "/";
//        }
//    }

//    @Autowired
//    private RestFb restFb;
//
//    @RequestMapping(value = "/login")
//    public String login() {
//        return BASE_DIR + "/login";
//    }

//    @RequestMapping("/login-facebook")
//    public String loginFacebook(HttpServletRequest request) throws ClientProtocolException, IOException {
//        String code = request.getParameter("code");
//
//        if (code == null || code.isEmpty()) {
//            return "redirect:/login?facebook=error";
//        }
//        String accessToken = restFb.getToken(code);
//
//        com.restfb.types.User user = restFb.getUserInfo(accessToken);
//        UserDetails userDetail = restFb.buildUser(user);
//        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetail, null,
//                userDetail.getAuthorities());
//        authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        return "redirect:/home";
//    }


}
