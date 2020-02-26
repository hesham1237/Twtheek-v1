package com.example.Twtheek.Repositry;

import com.example.Twtheek.Model.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repositry_Certificate extends JpaRepository<Certificate,Integer> {
    List<Certificate> findAll();
}
