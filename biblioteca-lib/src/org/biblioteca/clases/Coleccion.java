/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.biblioteca.clases;

import java.util.ArrayList;
import java.util.List;
import org.biblioteca.excepciones.LibroNoEncontradoException;
import org.biblioteca.interfaces.Buscar;
import org.biblioteca.interfaces.Libro;

/**
 *
 * @author Christian Jimenez
 */
public class Coleccion implements Buscar{

    ObraLiteraria libro1 = new ObraLiteraria(152,"El llano en llamas","Compilacion de cuentos de juan rulfo",150);
    ObraLiteraria libro2 = new ObraLiteraria(151,"Harry Potter y la piedra filosofal","primer libro de la serie literaria",100);
    ObraLiteraria libro3 = new ObraLiteraria(150,"El señor de los anillos","novela de fantasía épica escrita por J. R. R. Tolkien",50);
    ObraLiteraria libro4 = new ObraLiteraria(149,"El psicoanalista","Novela de John Katzenbach",220);
    Libro[] listaLibros= new Libro []{libro1,libro2,libro3,libro4};

   
    
    @Override
    public List<Libro> buscar(String... palabrasClave) throws Exception {
    List<Libro> encontrados= new ArrayList<>();
        
    try{
        for(String palabra : palabrasClave) {
        for (Libro listaLibro : listaLibros) {
            if (listaLibro.getInformacion().toLowerCase().contains(palabra)) {
                encontrados.add(listaLibro);
                //System.out.println(libro1.LeerLibro(listaLibro));
                }
            }          
        }
    }
         catch (Exception e) {
             System.out.println("error");
             throw new LibroNoEncontradoException();
        }
      if (encontrados.isEmpty()){
          System.err.println("error");
          throw new LibroNoEncontradoException("No hay resultados para la busqueda realizada.");
      }
    return encontrados;
 }
}
