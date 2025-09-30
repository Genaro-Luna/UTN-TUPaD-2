/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act2uml;

/**
 *
 * @author Genaro
 */
public class Celular {
    private String imei, marca, modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this){
            usuario.setCelular(this);
        }
    }
    
    public Usuario getUsuario(){
        return this.usuario;
    }
    
    public String getCelu(){
        return "Celular: " + marca +" "+modelo;
    }
    
    
    public String mostrarCelular() {
        return "Celular{" + "Imei: " + imei + ", Marca: " + marca + ", Modelo: " + modelo + "\n"+bateria.mostrarBateria() + "\n" + usuario.mostrarUsuario() +'}';
    }
    
}
