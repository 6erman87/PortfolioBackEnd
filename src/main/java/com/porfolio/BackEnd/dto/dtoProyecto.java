
package com.porfolio.BackEnd.dto;

import jakarta.validation.constraints.NotBlank;


public class dtoProyecto {
    
    @NotBlank
    private String nombreP;
    
    @NotBlank
    private String descripcionP;
    
    @NotBlank
    private String fechaP;
    
    @NotBlank
    private String linkP;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP, String fechaP, String linkP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.fechaP = fechaP;
        this.linkP = linkP;
    }
    
     //Getter & Setter

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }    

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }
    
    public String getFechaP() {
        return fechaP;
    }   
    
    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }
    
    public String getLinkP() {
        return linkP;
    }   
    
    public void setLinkP(String linkP) {
        this.linkP = linkP;
    }
        
}