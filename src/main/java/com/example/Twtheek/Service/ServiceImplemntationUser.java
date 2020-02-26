package com.example.Twtheek.Service;

import com.example.Twtheek.Model.Organization;
import com.example.Twtheek.Model.User;
import com.example.Twtheek.Repositry.Repositry_Organization;
import com.example.Twtheek.Repositry.Repositry_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImplemntationUser implements ServiceUser {
    @Autowired
    private Repositry_user reUser;
    @Autowired
    private Repositry_Organization repositry_organization;

    @Override
    public User addUser(User user) {

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


}

