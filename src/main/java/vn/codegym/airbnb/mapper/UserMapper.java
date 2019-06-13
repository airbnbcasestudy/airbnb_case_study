package vn.codegym.airbnb.mapper;

import org.apache.ibatis.annotations.Mapper;
import vn.codegym.airbnb.dto.UserSignUp;
import vn.codegym.airbnb.model.User;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> sellectAll();

    User findByEmail(String email);

    void insert(UserSignUp userSignUp);
}
