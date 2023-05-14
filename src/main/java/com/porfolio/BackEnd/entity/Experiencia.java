package com.porfolio.BackEnd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size(min = 1, max = 200, message = "no cumple con la longitud")
    private String nombreE;
    
    @NotNull
    @Size(min = 1, max = 200, message = "no cumple con la longitud")
    private String puestoE;
    
    @NotNull
    @Size(min = 1, max = 200, message = "no cumple con la longitud")
    private String periodoE;
    
    @NotNull
    @Size(min = 1, max = 100, message = "no cumple con la longitud")
    private String descripcionE;    
   
    private String img;
    
    //Constructores
    
    public Experiencia() {
    }

    public Experiencia(String nombreE, String puestoE, String periodoE, String descripcionE, String img) {
        this.nombreE = nombreE;
        this.puestoE = puestoE;
        this.periodoE = periodoE;
        this.descripcionE = descripcionE;
        this.img = img;
    }
    
    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getPuestoE() {
        return puestoE;
    }

    public void setPuestoE(String puestoE) {
        this.puestoE = puestoE;
    }

    public String getPeriodoE() {
        return periodoE;
    }

    public void setPeriodoE(String periodoE) {
        this.periodoE = periodoE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}