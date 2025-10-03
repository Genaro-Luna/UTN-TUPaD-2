/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act14uml;

/**
 *
 * @author Genaro
 */
public class Act14UML {

    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Integrador SQL", "12:43");
        EditorVideo edit = new EditorVideo();
        edit.exportar("mp4", proyecto);
    }
}
