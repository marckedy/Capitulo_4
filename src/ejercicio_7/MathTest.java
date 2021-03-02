/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class MathTest {
    
    public static void main(String[] args) {
        
        System.out.print("Raíz cuadrada de 37 : ");
        System.out.println(Math.sqrt(37));
        
        System.out.print("Seno de 300 : ");
        System.out.println(Math.sin(300));
        
        System.out.print("Coseno de 300: ");
        System.out.println(Math.cos(300));
        
        System.out.print("El valor floor de 22.8: ");
        System.out.println(Math.floor(22.8));
        
        System.out.print("El valor ceiling de 22.8: ");
        System.out.println(Math.ceil(22.8));
        
        System.out.print("El valor round de 22.8: ");
        System.out.println(Math.round(22.8));
        
        System.out.print("Numero aleatorio entre 0 al 20: ");
        Random r = new Random();
        System.out.println(r.nextInt(20)+1);
        
        System.out.print("Maximo entre D Y 71: ");
        System.out.println(Math.max((int)'D',71));
    }
}
