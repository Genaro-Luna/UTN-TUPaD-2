/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act8uml;

/**
 *
 * @author Genaro
 */
public class Usuario {
    private String nombre, email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    
    public String mostrarUsuario() {
        return "Usuario{" + "nombre=" + nombre + ", email=" + email + '}';
    }
    
    
}
