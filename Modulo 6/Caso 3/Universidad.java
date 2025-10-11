/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caso3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Genaro
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    
    public Universidad(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void agregarProfesor(Profesor p){
        if(p != null && !profesores.contains(p)){
            this.profesores.add(p);
        }
    }
    
    
    public void agregarCurso(Curso c){
        if(c != null && !cursos.contains(c)){
            this.cursos.add(c);
        }
    }
    
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Profesor p = buscarProfesorPorId(idProfesor);
        Curso c = buscarCursoPorCodigo(codigoCurso);
        c.setProfesor(p);
    }
    
    
    public void listarProfesores(){
        for (Profesor p : profesores) {
            System.out.println(p.mostrarInfo());
        }
    }
    
    
    public void listarCursos(){
        for (Curso c : cursos) {
            System.out.println(c.mostrarInfo());
        }
    }
    
    
    public Profesor buscarProfesorPorId(String id){
        Profesor p = null;
        for (Profesor profe : profesores) {
            if(profe.getId().equals(id)){
                p = profe;
            }
        }
        return p;
    }
    
    
    public Curso buscarCursoPorCodigo(String codigo){
        Curso c = null;
        for (Curso cur : cursos) {
            if(cur.getCodigo().equals(codigo)){
                c = cur;
            }
        }
        return c;
    }
    
    
    public void eliminarCurso(String codigo){
        Curso c = buscarCursoPorCodigo(codigo);
        if(cursos.contains(c)){
            c.getProfesor().eliminarCurso(c);
            cursos.remove(c);
        }
    }
    
    
    public void eliminarProfesor(String id){
        Profesor p = buscarProfesorPorId(id);
        if(profesores.contains(p)){
            for (Curso curso : cursos) {
                if(curso.getProfesor().equals(p)){
                    curso.setProfesor(null);
                }
            }
        profesores.remove(p);
        }
    }
    
    public void reporte(){
        int total = 0;
        for (Profesor profe : profesores) {
            total = profe.listarCursos().size();
            System.out.println("Profesor: " + profe.getNombre() + ", ID: " + profe.getId());
            System.out.println("Cursos totales: "+total);
        }
    }
}
