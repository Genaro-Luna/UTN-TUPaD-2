/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act5uml;

/**
 *
 * @author Genaro
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placa;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placa = new PlacaMadre(modelo, chipset);
    }
    
    public void setPropietario(Propietario propietario){
        this.propietario = propietario;
        if(propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora(this);
        }
    }
    
    public Propietario getPropietario(){
        return this.propietario;
    }
    
    public PlacaMadre getPlaca(){
        return this.placa;
    }
    
    public String mostrarCompu() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + "\nPlaca=" + placa.mostrarPlaca() + "\nPropietario=" + propietario.mostrarPropietario() + '}';
    }
    
    
    
}
