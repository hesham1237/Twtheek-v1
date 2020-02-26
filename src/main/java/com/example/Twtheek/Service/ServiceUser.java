package com.example.Twtheek.Service;

import com.example.Twtheek.Model.Organization;
import com.example.Twtheek.Model.User;

import java.util.List;

public interface ServiceUser {
    public User addUser(User user);
    public Organization addOrg(Organization organization);
    public List<User> getUser();
    public void deleteUserint (int id);
}
