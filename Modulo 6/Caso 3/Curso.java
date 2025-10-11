/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caso3;

/**
 *
 * @author Genaro
 */
public class Curso {
    private String codigo, nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public String getNombre() {
        return nombre;
    }
    

    public String getCodigo() {
        return codigo;
    }
    
    public void setProfesor(Profesor p){
        if (this.profesor == p){
            return;
        }
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        this.profesor = p;
        if (p != null && !p.listarCursos().contains(this)){
            p.agregarCurso(this);
        }
    }

    
    public String mostrarInfo() {
        if(profesor == null){
            return "CURSO-> Codigo: " + codigo + " | Nombre: " + nombre + "\n"
        + "Profesor asignado: " + profesor;
        }
        return "CURSO-> Codigo: " + codigo + " | Nombre: " + nombre + "\n"
        + "Profesor asignado: " + profesor.getNombre() + " | ID: " + profesor.getId() + " | Especialidad: " + profesor.getEspecialidad();
    }
    
    
}
