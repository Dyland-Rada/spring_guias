/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.modelo;


import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import lombok.Data;

/**
 *
 * @author Sylandklk
 */
@Entity
@Table(name="usuarios")
@Data 
public class Usuario implements Serializable {
    //propiedades:
    private static final long serialVersionUID = 1L;
    @Id
    private String Cedula;
    
    private String Clave;
    private String Nombre;
    private String Email;
}
