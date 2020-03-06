package com.example.Twtheek.Service;

import com.example.Twtheek.DTO.UserDTO;
import com.example.Twtheek.Model.Organization;
import com.example.Twtheek.Model.User;
import com.example.Twtheek.DTO.ObjectMapperUtils;
import com.example.Twtheek.Repositry.Repositry_Organization;
import com.example.Twtheek.Repositry.Repositry_user;
//import org.modelmapper.ModelMapper;
import com.example.Twtheek.WebSecurity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImplemntationUser implements ServiceUser {
    @Autowired
    private Repositry_user reUser;
    @Autowired
    private Repositry_Organization repositry_organization;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public User addUser(User user) {
//        WebSecurity webSecurity = new WebSecurity();
        user.setPasswordField(new BCryptPasswordEncoder().encode(user.getPasswordField()));
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        user.setPasswordField(passwordEncoder.encode(user.getPasswordField()));
//        final String encryptedPassword = new BCryptPasswordEncoder().encode(user.getPasswordField());
//
//        user.setPasswordField(encryptedPassword);



        return reUser.save(user);
    }

    @Override
    public Organization addOrg(Organization organization) {

        return repositry_organization.save(organization);
    }

    @Override
    public List<User> getUser() {

        return reUser.findAll();
    }
    @Override
    public void deleteUserint(int id) {
        reUser.deleteById(id);

    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = reUser.findAll();
        List<UserDTO> userDTOS = ObjectMapperUtils.mapAll(users, UserDTO.class);
        return userDTOS;
    }

    @Override
    public UserDTO getUser(int userId) {
        User user = reUser.findById(userId).get();
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        return userDTO;
    }


}

