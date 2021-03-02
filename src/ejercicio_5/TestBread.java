/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

/**
 *
 * @author Usuario
 */
public class TestBread {
    
    public static void Bread() {
        
        System.out.println(Bread.MOTTO);
        
        Bread pan1 = new Bread("Nuez",250);
        System.out.println(pan1.getTipo() + " : " +pan1.getCalorias());
        
        Bread pan2 = new Bread("Blanco",200);
        System.out.println(pan2.getTipo() + " : " +pan2.getCalorias());
        
        Bread pan3 = new Bread("Integral",150);
        System.out.println(pan3.getTipo() + " : " +pan3.getCalorias());
        
        
    }
}
