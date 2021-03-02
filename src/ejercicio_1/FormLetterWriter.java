/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

/**
 *
 * @author Usuario
 */
public class FormLetterWriter {
    
    public static void displaySalutation(String apellido){
        System.out.println("Estimado Sr. o Sra " + apellido);
        System.out.println("Gracias por su orden reciente");
    }
    
    public static void displaySalutation(String nombre, String apellido){
        System.out.println("Estimado " + nombre + " " + apellido);
        System.out.println("Gracias por su orden reciente");
    }
}
