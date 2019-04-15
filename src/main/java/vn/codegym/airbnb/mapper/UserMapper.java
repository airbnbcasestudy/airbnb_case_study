package vn.codegym.airbnb.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import vn.codegym.airbnb.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;



@Mapper
public interface UserMapper extends JpaRepository<User, Long> {

    User findUserByEmail(String email);

}
