package com.example.Twtheek.Controllar;

import com.example.Twtheek.Model.Authority;
import com.example.Twtheek.Service.Service_Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Authority")
public class AuthorityControllar {
    @Autowired
    private Service_Authority service_authority;


    @PostMapping(value = "addAuth")
    public Authority addAuth(@RequestBody Authority authority){
        return service_authority.addAuthority(authority);

    }
    @GetMapping(value = "getAuth")
    public List<Authority> getAuth(){
        return service_authority.getAuthority();
    }
}
