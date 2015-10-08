/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import clases.Persona;
import clases.Trabajo;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class Principal {
    
    public static void main(String[] args) {
        
       Persona p = new Persona(); 
       p.imprime();
       
       System.out.println("         ");
       System.out.println("*********");
       System.out.println("         ");
       
       Persona p2 = new Persona(401790443, "Marisel Zamora", 'M', 7000000, 
               true, new Date(), "Heredia" , 87032054, "mz123@una.cr");
       p2.imprime();
       
       System.out.println("         ");
       System.out.println("*********");
       System.out.println("         ");
       
       Persona p3 = new Persona(401790443, "Marisel Zamora", 'M', 7000000, 
               true, new Date(), new Trabajo());
       p3.imprime();
    }
    
}
