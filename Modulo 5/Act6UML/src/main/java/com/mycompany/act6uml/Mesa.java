/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act6uml;

/**
 *
 * @author Genaro
 */
public class Mesa {
    private int numero, capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public String mostrarMesa() {
        return "Mesa{" + "numero=" + numero + ", capacidad=" + capacidad + '}';
    }
    
    
    
}
