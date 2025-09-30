/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act2uml;

/**
 *
 * @author Genaro
 */
public class Act2UML {

    public static void main(String[] args) {
        Bateria bateria = new Bateria("6v PP", 5000);
        Celular celular = new Celular("1234", "Motorola", "X100", bateria);
        Usuario usuario = new Usuario("Genaro", 44369231);
        
        celular.setUsuario(usuario);
        System.out.println("Mostramos Celular\n"+celular.mostrarCelular());
        System.out.println("Mostramos Usuario\n"+ usuario.mostrarUsuario());
        System.out.println("Mostramos Bateria\n"+ bateria.mostrarBateria());
        
        System.out.println("Damos por null Celular");
        celular = null;
        System.out.println("Mostramos nuevamente");
        System.out.println("Bateria:\n" + bateria.mostrarBateria());
        System.out.println("Usuario:\n" + usuario.mostrarUsuario());
    }
}
