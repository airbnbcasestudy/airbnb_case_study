package vn.codegym.airbnb.controller;


import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.codegym.airbnb.common.RestFb;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class LoginController {
    private static final String BASE_DIR = "/login";

    @Autowired
    private RestFb restFb;
    @RequestMapping(value = "/login")
    public String login() {
        return BASE_DIR + "/login";
    }
    @RequestMapping("/login-facebook")
    public String loginFacebook(HttpServletRequest request) throws ClientProtocolException, IOException {
        String code = request.getParameter("code");

        if (code == null || code.isEmpty()) {
            return "redirect:/login?facebook=error";
        }
        String accessToken = restFb.getToken(code);

        com.restfb.types.User user = restFb.getUserInfo(accessToken);
        UserDetails userDetail = restFb.buildUser(user);
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetail, null,
                userDetail.getAuthorities());
        authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return "redirect:/user";
    }
    @RequestMapping("/user")
    public String user() {
        return BASE_DIR + "/user";
    }
    @RequestMapping("/admin")
    public String admin() {
        return BASE_DIR + "/admin";
    }
    @RequestMapping("/403")
    public String accessDenied() {
        return "/error/403";
    }
}
