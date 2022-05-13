/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.List;
import java.util.Scanner;
import org.biblioteca.clases.Coleccion;
import org.biblioteca.interfaces.Libro;
/**
 *
 * @author Christian Jimenez
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       Scanner lectura = new Scanner (System.in);
       System.out.println("Ingrese el libro a buscar: ");
       String query = lectura.next();
       Coleccion busca =  new Coleccion();
       
        List<Libro> buscar = busca.buscar(query.toLowerCase());
        
        for (Libro listaLibro : buscar) {
            System.err.println(listaLibro.getInformacion());
            }

       
    }
    
}
