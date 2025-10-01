/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act6uml;

/**
 *
 * @author Genaro
 */
public class Cliente {
    private String nombre;
    private int telefono;

    public Cliente(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    
    public String mostrarCliente() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }

    

    
}
