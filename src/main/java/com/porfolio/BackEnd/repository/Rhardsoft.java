package com.porfolio.BackEnd.repository;


import com.porfolio.BackEnd.entity.Hardsoft;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Rhardsoft extends JpaRepository<Hardsoft, Integer>{
    Optional<Hardsoft> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}