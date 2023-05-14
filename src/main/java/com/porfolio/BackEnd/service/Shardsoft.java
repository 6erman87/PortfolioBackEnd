package com.porfolio.BackEnd.service;

import com.porfolio.BackEnd.entity.Hardsoft;
import com.porfolio.BackEnd.repository.Rhardsoft;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class Shardsoft {

    @Autowired
    Rhardsoft rhardsoft;

    public List<Hardsoft> list() {
        return rhardsoft.findAll();
    }

    public Optional<Hardsoft> getOne(int id) {
        return rhardsoft.findById(id);
    }

    public Optional<Hardsoft> getByNombre(String nombre) {
        return rhardsoft.findByNombre(nombre);
    }

    public void save(Hardsoft skill) {
        rhardsoft.save(skill);
    }

    public void delete(int id) {
        rhardsoft.deleteById(id);
    }

    public boolean existsById(int id) {
        return rhardsoft.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return rhardsoft.existsByNombre(nombre);
    }
}
