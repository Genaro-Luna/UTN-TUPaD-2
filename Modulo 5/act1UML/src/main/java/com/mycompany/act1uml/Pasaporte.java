/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act1uml;

/**
 *
 * @author Genaro
 */
public class Pasaporte {
    private int numero;
    private Foto foto;
    private String fechaEmision;
    private Titular titular;

    public Pasaporte(int numero, String imagen, String formato, String fechaEmision) {
        this.numero = numero;
        this.foto = new Foto(imagen, formato);
        this.fechaEmision = fechaEmision;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this){
            titular.setPasaporte(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public String mostarPasaporte() {
        return "Pasaporte{" + "numero=" + numero + ", foto=" + foto.mostrarFoto() + ", fechaEmision=" + fechaEmision + ", titular=" + titular.mostrarTitular() + '}';
    }
    
    public String mostrarFoto(){
        return "Fotos: " + foto.mostrarFoto();
    }
    
    
}
