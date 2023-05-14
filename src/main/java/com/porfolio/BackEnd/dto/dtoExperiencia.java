package com.porfolio.BackEnd.dto;

import jakarta.validation.constraints.NotBlank;

public class dtoExperiencia {

    @NotBlank
    private String nombreE;

    @NotBlank
    private String puestoE;

    @NotBlank
    private String periodoE;

    @NotBlank
    private String descripcionE;

    private String img;
    
    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String puestoE, String periodoE, String descripcionE, String img) {
        this.nombreE = nombreE;
        this.puestoE = puestoE;
        this.periodoE = periodoE;
        this.descripcionE = descripcionE;
        this.img = img;
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
