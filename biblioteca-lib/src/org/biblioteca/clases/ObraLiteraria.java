/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.biblioteca.clases;

import java.lang.reflect.Array;
import org.biblioteca.interfaces.Libro;

/**
 *
 * @author Christian Jimenez
 */
public class ObraLiteraria implements Libro{
    int id;
    String titulo;
    String descripcion;
    int unidadesDisponibles;
    String datosLibro;
    /*Array[] bd;

    public Array[] getBd() {
        return bd;
    }

    public void setBd(Array[] bd) {
        this.bd = bd;
    }

    */
   public String LeerLibro(Libro hola) {
        String Sale=hola.getInformacion();
        
        return Sale;
        
        
    }
    
    public ObraLiteraria(int id, String titulo, String descripcion, int unidadesDisponibles) {
        
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.unidadesDisponibles = unidadesDisponibles;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }
    
    
    @Override
    public String getInformacion() {
       datosLibro = getTitulo() + " (" + getDescripcion() + ") - " + 
                     Integer.toString(getUnidadesDisponibles()) + " unidades disponibles. ("+
                    Integer.toString(getId()) + ")";
       return datosLibro;
    }

   
    
    
}
