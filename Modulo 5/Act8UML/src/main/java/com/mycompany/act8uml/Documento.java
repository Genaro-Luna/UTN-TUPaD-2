/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act8uml;

/**
 *
 * @author Genaro
 */
public class Documento {
    private String titulo, contenido;
    private FirmaDigital firma;
    private Usuario usuario;

    public Documento(String titulo, String contenido, String codigo, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigo, fecha, usuario);
    }

    
    public String mostrarDocumento() {
        return "Documento: " + "titulo=" + titulo + ", contenido=" + contenido + "\nFirma=" + firma.mostrarFirma() + "\nUsuario=" + firma.getUsuario().mostrarUsuario();
    }
    
    
    
    
}
