/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act5uml;

/**
 *
 * @author Genaro
 */
public class Propietario {
    private String nombre;
    private int dni;
    private Computadora compu;

    public Propietario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    
    
    
    public void setComputadora(Computadora compu){
        this.compu = compu;
        if(compu != null && compu.getPropietario() != this){
            compu.setPropietario(this);
        }
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Computadora getComputadora(){
        return this.compu;
    }
    
    public String mostrarPropietario() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
}
