package com.example.Twtheek.Repositry;

import com.example.Twtheek.Model.Authority;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repositry_Authority extends JpaRepository<Authority,Integer> {
    List<Authority> findAll();
}
