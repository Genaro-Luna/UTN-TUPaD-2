/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caso2;

/**
 *
 * @author Genaro
 */
public class Autor {
    private String id, nombre, nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String mostrarInfo() {
        return "Autor= " + "ID: " + id + "- Nombre: " + nombre + "- Nacionalidad: " + nacionalidad;
    }
}
