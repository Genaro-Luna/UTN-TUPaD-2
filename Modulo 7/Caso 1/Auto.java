/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciavehiculo;

/**
 *
 * @author Genaro
 */
public class Auto extends Vehiculo{
    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String mostrarInfo() {
        return "Auto-> Cantidad de Puertas: " + cantidadPuertas + " " + super.mostrarInfo();
    }
    
    
}
