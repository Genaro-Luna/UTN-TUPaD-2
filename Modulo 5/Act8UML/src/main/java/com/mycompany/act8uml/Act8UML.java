/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act8uml;

/**
 *
 * @author Genaro
 */
public class Act8UML {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Genaro", "ejemplo@gmail.com");
        Documento documento = new Documento("Acta", "autorizacion", "1234", "28/|0/2025", usuario);
        
        System.out.println(documento.mostrarDocumento());
        //Por medio del getUsuario en FirmaDigital, podemos acceder al metodo mostrarUsuario
        //-mostrando así los datos de tanto firma como usuario declarados anteriormente
    }
}
