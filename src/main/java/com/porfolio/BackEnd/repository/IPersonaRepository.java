package com.porfolio.BackEnd.repository;

import com.porfolio.BackEnd.entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer> {

    public Optional<Persona> findByNombre(String nombre);

    public boolean existsByNombre(String nombre);
}
