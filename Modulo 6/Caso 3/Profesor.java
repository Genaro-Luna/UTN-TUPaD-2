/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caso3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Genaro
 */
public class Profesor {
    private String id, nombre, especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    
    public void agregarCurso(Curso c){
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }
    
    
    public void eliminarCurso(Curso c){
        if (cursos.contains(c) && c.getProfesor() == this) {
            cursos.remove(c);
            c.setProfesor(null);
        }
    }
    
    
    public List<Curso> listarCursos(){
        return Collections.unmodifiableList(cursos);
    }
    
    
    public String mostrarInfo() {
        String profe = "Profesor:\nID: " + id + " | Nombre: " + nombre + " | Especialidad: " + especialidad + "\n";
        for (Curso curso : cursos) {
            profe += "CURSO-> Codigo: " + curso.getCodigo() + " | Nombre: " + curso.getNombre() + "\n";
        }
        return profe;
    }
}
