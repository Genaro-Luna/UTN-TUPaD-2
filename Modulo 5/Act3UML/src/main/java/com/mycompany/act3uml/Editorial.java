/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act3uml;

/**
 *
 * @author Genaro
 */
public class Editorial {
    private String nombre, direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String mostrarEditorial() {
        return "Editorial{" + "nombre=" + nombre + ", direccion=" + direccion + '}';
    }

    public String getNombre() {
        return nombre;
    }

}
