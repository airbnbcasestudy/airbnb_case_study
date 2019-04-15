//package vn.codegym.airbnb.service;
//
//import vn.codegym.airbnb.mapper.UserMapper;
//import vn.codegym.airbnb.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.Arrays;
//import java.util.HashSet;
//
//
//@Service
//@Transactional
//public class UserService {
//    @Autowired
//    private UserMapper userMapper;
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
////    @Autowired
////    public UserService(UserRepository userRepository,
////                       RoleRepository roleRepository,
////                       BCryptPasswordEncoder bCryptPasswordEncoder) {
////        this.userRepository = userRepository;
////        this.roleRepository = roleRepository;
////        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
////    }
//
//    public User findUserByEmail(String email) {
//        return userMapper.findUserByEmail(email);
//    }
//
//    public User saveUser(User user) {
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        user.setActive(1);
//        return userMapper.save(user);
//    }
//
//}