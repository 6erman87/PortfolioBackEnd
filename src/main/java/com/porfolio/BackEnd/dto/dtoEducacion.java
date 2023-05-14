package com.porfolio.BackEnd.dto;

import jakarta.validation.constraints.NotBlank;

public class dtoEducacion {

    @NotBlank
    private String nombreD;

    @NotBlank
    private String descripcionD;

    @NotBlank
    private String periodoD;

    private String imgD;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreD, String descripcionD, String periodoD, String imgD) {
        this.nombreD = nombreD;
        this.descripcionD = descripcionD;
        this.periodoD = periodoD;
        this.imgD = imgD;
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
