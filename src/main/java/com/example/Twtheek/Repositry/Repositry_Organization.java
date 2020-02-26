package com.example.Twtheek.Repositry;

import com.example.Twtheek.Model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface Repositry_Organization extends JpaRepository<Organization,Integer> {
    public List<Organization> findAll();
}
