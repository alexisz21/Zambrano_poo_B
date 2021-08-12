/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Persona;
/**
 *
 * @author HP
 */
public class Aplicacion {
   public static void main (String[] args){
       Cliente c1 = new Cliente();
       Persona p1 = new Persona();
       
       c1.getTelefono("0986719053");
       p1.getNombre("Melany");
       p1.getEdad("19");
       
       System.out.println("c1.toString");
       System.out.println("p1.toString");
       
               
   } 
}
