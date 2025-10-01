/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act4uml;

/**
 *
 * @author Genaro
 */
public class Banco {
    private String nombre;
    private int cuit;
    private TarjetaDeCredito tarjeta;

    public Banco(String nombre, int cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }
    
    
    
    
    
    public String getNombre(){
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", cuit=" + cuit;
    }
    
    
}
