package com.porfolio.BackEnd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    
    private String nombre;
    private String apellido;
    private String img;
    private String profesion;
    private String sobremi;
    
}


//    @NotNull
//    @Size (min = 1, max = 50, message = "no cumple con la longitud")
//    private String nombre;
//    
//    @NotNull
//    @Size (min = 1, max = 50, message = "no cumple con la longitud")
//    private String apellido;
//        
//    @Size (min = 1, max = 50, message = "no cumple con la longitud")
//    private String img;
