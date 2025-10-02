/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act7uml;

/**
 *
 * @author Genaro
 */
public class Vehiculo {
    private String patente, modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    
    public void setConductor(Conductor conductor){
        this.conductor = conductor;
        if(conductor != null && conductor.getVehiculo() != this){
            conductor.setVehiculo(this);
        }
    }
    
    public Conductor getConductor(){
        return this.conductor;
    }

    
    public String mostrarVehiculo() {
        return "Vehiculo: " + "patente=" + patente + ", modelo=" + modelo + "\n" + motor.mostrarMotor() + "\n" + conductor.mostrarConductor();
    }
}
