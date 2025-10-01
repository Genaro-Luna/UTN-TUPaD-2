/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act4uml;

/**
 *
 * @author Genaro
 */
public class Cliente {
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setTarjeta(TarjetaDeCredito tarjeta){
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getCliente() != this){
            tarjeta.setCliente(this);
        }
    }
    
    public TarjetaDeCredito getTarjeta(){
        return this.tarjeta;
    }

    
    public String getNombre(){
        return this.nombre;
    }
    
    public String mostrarCliente() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", tarjeta=" + tarjeta.getNumero() + '}';
    }
    
    
}
