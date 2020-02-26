package com.example.Twtheek.Repositry;

import com.example.Twtheek.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repositry_user extends JpaRepository<User,Integer> {
    public List<User> findAll();
}
