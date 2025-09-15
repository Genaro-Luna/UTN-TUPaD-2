package com.mycompany.modulo3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Genaro
 */
public class Estudiante {
    String nombre = "Javier", apellido = "Martinez", curso = "Matematicas";
    double calificacion = 0.0;


    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+" Apellido: "+apellido+" Curso: "+curso+" Calificacion: "+calificacion);
    }
    
    public double subirCalificacion(double puntos){
        if (puntos > calificacion){
            calificacion = puntos;
        }
        return calificacion;
    }
    
    
    public double bajarCalificacion(double puntos){
        if (puntos < calificacion){
            calificacion = puntos;
        }
        return calificacion;
    }
}

