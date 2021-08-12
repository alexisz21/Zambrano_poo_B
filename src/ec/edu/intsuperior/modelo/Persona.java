/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Persona {
    private String nombre;
    private String edad;
   
   public Persona(){
        
       JOptionPane.showMessageDialog(null,"Se a creado un objeto de la clase persona");
         
   }

    public Persona(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre:"+getNombre() +"\n"
                + "edad" + getEdad();
        
    }

    public void getNombre(String melany) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getEdad(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
   }

