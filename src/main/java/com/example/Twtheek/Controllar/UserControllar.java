package com.example.Twtheek.Controllar;

import com.example.Twtheek.DTO.UserDTO;
import com.example.Twtheek.Model.Organization;
import com.example.Twtheek.Model.User;
import com.example.Twtheek.Service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Users")
public class UserControllar {

    @Autowired
    private ServiceUser serviceUser;


    @PostMapping(value = "/addUser")
    public User addUser(@RequestBody User user) {

        return serviceUser.addUser(user);
    }
    @PostMapping(value = "/addorg")
    public Organization addorg(@RequestBody Organization organization) {

        return serviceUser.addOrg(organization);
    }


    @GetMapping(value = "/getUser")
    public List<User> getUser() {
        return serviceUser.getUser();
    }

    @GetMapping(value = "/GetAllUsers")
    public List<UserDTO> getAllUsers() {
        return serviceUser.getAllUsers();}

    @GetMapping(value = "/GetAllUsers/{userID}")
    public UserDTO getUser(@PathVariable("userID") int userID) {
        return serviceUser.getUser(userID);
    }




    @DeleteMapping(value = "/{national_Id}")
    public String deleteUserint(@RequestBody @PathVariable("national_Id") int id) {
        serviceUser.deleteUserint(id);
        return "Is Deleted Successfully!!";
    }


}
