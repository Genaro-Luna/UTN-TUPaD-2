/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caso3;

/**
 *
 * @author Genaro
 */
public class Caso3 {

    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN-Parana");
        //Punto 1
        Profesor profe1 = new Profesor("1", "Matias", "Calculo diferencial");
        Profesor profe2 = new Profesor("2", "Ariel", "Programacion II");
        Profesor profe3 = new Profesor("3", "Issac", "Base de datos");
        
        Curso c1 = new Curso("C1", "Comision 1");
        Curso c2 = new Curso("C2", "Comision 2");
        Curso c3 = new Curso("C3", "Comision 3");
        Curso c4 = new Curso("C4", "Comision 4");
        Curso c5 = new Curso("C5", "Comision 5");
        Curso c6 = new Curso("C6", "Comision 6");
        
        //Punto 2
        uni.agregarProfesor(profe1);
        uni.agregarProfesor(profe2);
        uni.agregarProfesor(profe3);
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);
        uni.agregarCurso(c6);
        
        
        //Punro 3
        uni.asignarProfesorACurso("C3", "1");
        uni.asignarProfesorACurso("C2", "3");
        uni.asignarProfesorACurso("C6", "3");
        uni.asignarProfesorACurso("C4", "2");
        uni.asignarProfesorACurso("C5", "1");
        uni.asignarProfesorACurso("C1", "2");
        System.out.println("Profesroes asignados a cursos");
        //Punto 4
        uni.listarProfesores();
        uni.listarCursos();
        System.out.println("||||||||||||||||");
        //Punto 5
        uni.asignarProfesorACurso("C3", "2");
        uni.asignarProfesorACurso("C4", "3");
        System.out.println("Reasignacion de profesores");
        uni.listarProfesores();
        uni.listarCursos();
        System.out.println("||||||||||||||||");
        //Punto 6
        uni.eliminarCurso("C6");
        System.out.println("Curso eliminado");
        uni.listarProfesores();
        uni.listarCursos();
        System.out.println("||||||||||||||||");
        //Punto 7
        uni.eliminarProfesor("2");
        System.out.println("Proferos eliminado");
        uni.listarProfesores();
        uni.listarCursos();
        System.out.println("||||||||||||||||");
        //Punto 8
        System.out.println("Cantidad de cursos por profesor");
        uni.reporte();
    }
}
