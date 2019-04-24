package vn.codegym.airbnb.common;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Version;

@Component
public class RestFb {
//    @Autowired
//    private Environment env;
//    public String getToken(final String code) throws ClientProtocolException, IOException {
//        String link = String.format(env.getProperty("facebook.link.get.token"), env.getProperty("facebook.app.id"),
//                env.getProperty("facebook.app.secret"), env.getProperty("facebook.redirect.uri"), code);
//        String response = Request.Get(link).execute().returnContent().asString();
//        ObjectMapper mapper = new ObjectMapper();
//        JsonNode node = mapper.readTree(response).get("access_token");
//        return node.textValue();
//    }
//    public com.restfb.types.User getUserInfo(final String accessToken) {
//        FacebookClient facebookClient = new DefaultFacebookClient(accessToken, env.getProperty("facebook.app.secret"),
//                Version.LATEST);
//        return facebookClient.fetchObject("me", com.restfb.types.User.class);
//    }
//
//    public UserDetails buildUser(com.restfb.types.User user) {
//        boolean enabled = true;
//        boolean accountNonExpired = true;
//        boolean credentialsNonExpired = true;
//        boolean accountNonLocked = true;
//        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
//        UserDetails userDetail = new User(user.getId() + user.getName(), "", enabled, accountNonExpired, credentialsNonExpired,
//                accountNonLocked, authorities);
//        return userDetail;
//    }
}

