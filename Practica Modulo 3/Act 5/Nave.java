/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */
package com.mycompany.naveespacial;

/**
 *
 * @author Genaro
 */
public class Nave {
    
    private String nombre = "HORNERO-F15";
    private double combustible = 0;

    
    public boolean despegar(){
        if (combustible > 10){
            combustible -= 5;
            return true;
        }
        return false;
    }
    
    public void avanzar(double km){
        if ((despegar())&&(combustible - (km*0.10) > 0)){
            combustible -= (km*0.10);
            System.out.println("La nave recorreo: "+km+" km");
        } else {
            System.out.println("Combustible insuficiente");
        }
    }
    
    public void recargarCombustible(double carga){
        if(carga > 0.0){
            combustible += carga;
        } else {
            System.out.println("Error de carga");
        }
    }
    
    public void mostrarEstado(){
        System.out.println("Nombre de la nave: "+nombre);
        System.out.println("Combustible actual: "+combustible);
        System.out.println("Estado de despliege: "+despegar());
        
    }
}

