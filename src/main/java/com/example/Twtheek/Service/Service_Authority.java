package com.example.Twtheek.Service;

import com.example.Twtheek.Model.Authority;
import com.example.Twtheek.Model.Organization;
import com.example.Twtheek.Model.User;

import java.util.List;

public interface Service_Authority {
    public Authority addAuthority(Authority authority);
    public List<Authority> getAuthority();
    public void deleteAuthority (int id);
}
