package com.porfolio.BackEnd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;

    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String profesion;

    @NotNull
    private String descripcion;

    private String banner;

    private String img;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String profesion, String descripcion, String banner, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.descripcion = descripcion;
        this.banner = banner;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.img = banner;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
