package com.porfolio.BackEnd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombreD;

    private String descripcionD;

    private String periodoD;

    private String imgD;

    public Educacion() {
    }

    public Educacion(String nombreD, String descripcionD, String periodoD, String imgD) {
        this.nombreD = nombreD;
        this.descripcionD = descripcionD;
        this.periodoD = periodoD;
        this.imgD = imgD;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public String getDescripcionD() {
        return descripcionD;
    }

    public void setDescripcionD(String descripcionD) {
        this.descripcionD = descripcionD;
    }

    public String getPeriodoD() {
        return periodoD;
    }

    public void setPeriodoD(String periodoD) {
        this.periodoD = periodoD;
    }

    public String getImgD() {
        return imgD;
    }

    public void setImgD(String imgD) {
        this.imgD = imgD;
    }

}
