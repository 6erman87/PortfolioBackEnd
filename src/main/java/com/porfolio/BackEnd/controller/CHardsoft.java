package com.porfolio.BackEnd.controller;

import com.porfolio.BackEnd.dto.dtoHardsoft;
import com.porfolio.BackEnd.entity.Hardsoft;
import com.porfolio.BackEnd.security.Controller.Mensaje;
import com.porfolio.BackEnd.service.Shardsoft;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"https://gnbfrontend.web.app", "http://localhost:4200"})
@RequestMapping("/skill")
public class CHardsoft {

    @Autowired
    Shardsoft shardsoft;

    @GetMapping("/lista")
    public ResponseEntity<List<Hardsoft>> list() {
        List<Hardsoft> list = shardsoft.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Hardsoft> getById(@PathVariable("id") int id) {
        if (!shardsoft.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Hardsoft hardsoft = shardsoft.getOne(id).get();
        return new ResponseEntity(hardsoft, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!shardsoft.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        shardsoft.delete(id);
        return new ResponseEntity(new Mensaje("Skill eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHardsoft dtohardsoft) {
        if (StringUtils.isBlank(dtohardsoft.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (shardsoft.existsByNombre(dtohardsoft.getNombre())) {
            return new ResponseEntity(new Mensaje("Esa skill ya existe"), HttpStatus.BAD_REQUEST);
        }

        Hardsoft hardsoft = new Hardsoft(dtohardsoft.getNombre(), dtohardsoft.getPorcentaje());
        shardsoft.save(hardsoft);

        return new ResponseEntity(new Mensaje("Skill agregada"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHardsoft dtohardsoft) {
        //Validamos si existe el ID
        if (!shardsoft.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        //Compara nombre de skills
        if (shardsoft.existsByNombre(dtohardsoft.getNombre()) && shardsoft.getByNombre(dtohardsoft.getNombre()).get()
                .getId() != id) {
            return new ResponseEntity(new Mensaje("Esa skill ya existe"), HttpStatus.BAD_REQUEST);
        }
        //No puede estar vacio
        if (StringUtils.isBlank(dtohardsoft.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Hardsoft hardsoft = shardsoft.getOne(id).get();
        hardsoft.setNombre(dtohardsoft.getNombre());
        hardsoft.setPorcentaje(dtohardsoft.getPorcentaje());

        shardsoft.save(hardsoft);
        return new ResponseEntity(new Mensaje("Skill actualizada"), HttpStatus.OK);

    }

}
