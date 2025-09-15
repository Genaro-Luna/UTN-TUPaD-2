/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */
package com.mycompany.simulaciongallinero;

/**
 *
 * @author Genaro
 */
public class Gallina {
    private int idGallina, edad, huevosPuestos = 0;


    public void setIdGallina(int id) {
        if (esPositivo(id)){
            idGallina = id;
        }
    }

    public void setEdad(int n) {
        if (esPositivo(n)){
            edad = n;
        }
    }

    public void setPonerHuevos(int huevos) {
        if (esPositivo(huevos)){
            huevosPuestos += huevos;
        }
    }
    
    public void envejecer(){
        edad += 1;
    }
    
    public void mostrarEstado(){
        System.out.println("ID-Gallina: "+idGallina);
        System.out.println("Edad: "+edad+" anios");
        System.out.println("Huevos totales puestos: "+huevosPuestos);
        System.out.println("-----------------------------------------");
    }
    
    public boolean esPositivo(int n){
        return n >= 0;
    }

}