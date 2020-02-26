package com.example.Twtheek.Controllar;

import com.example.Twtheek.Model.Organization;
import com.example.Twtheek.Model.User;
import com.example.Twtheek.Service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Users")
public class UserControllar {

    @RequestMapping(value = "/w", method = RequestMethod.GET)
    public String s(){
    return "ts";
}
    @Autowired
    private ServiceUser serviceUser;


    @PostMapping(value = "/addUser")
    public User addCourse(@RequestBody User user) {

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
    @DeleteMapping(value = "/{national_Id}")
    public String deleteUserint(@PathVariable("national_Id") int id) {
        serviceUser.deleteUserint(id);
        return "Is Deleted Successfully!!";
    }

}
