/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act2uml;

/**
 *
 * @author Genaro
 */
public class Usuario {
    private String nombre;
    private int dni;
    private Celular celular;

    public Usuario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setCelular(Celular celular){
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this){
            celular.setUsuario(this);
        }
    }
    
    public Celular getCelular(){
        return this.celular;
    }

    public String mostrarUsuario() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + celular.getCelu()+ '}';
    }
    
    
}
