package com.example.Twtheek.Service;

import com.example.Twtheek.Model.Authority;
import com.example.Twtheek.Repositry.Repositry_Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_Implementation_Authority implements Service_Authority{
    @Autowired
    private Repositry_Authority repositry_authority;

    @Override
    public Authority addAuthority(Authority authority) {
        return repositry_authority.save(authority);
    }

    @Override
    public List<Authority> getAuthority() {
        return repositry_authority.findAll();
    }

    @Override
    public void deleteAuthority(int id) {
        repositry_authority.deleteById(id);

    }
}
