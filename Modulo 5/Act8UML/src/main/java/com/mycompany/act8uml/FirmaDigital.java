/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act8uml;

/**
 *
 * @author Genaro
 */
public class FirmaDigital {
    private String codigoHash, fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String mostrarFirma() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + '}';
    }
    
    public Usuario getUsuario(){
        return this.usuario;
    }
    
}
