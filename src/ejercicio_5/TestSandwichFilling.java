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
public class TestSandwichFilling {
    
    public static void main(String[] args) {
        TestSandwichFilling.filling();
    }
    
    public static void filling(){
        
        TestBread.Bread();
        
        SandwichFilling sandwich1 = new SandwichFilling("Ensalada de huevo",250);
        SandwichFilling sandwich2 = new SandwichFilling("Atun",130);
        SandwichFilling sandwich3 = new SandwichFilling("Huevo",190);
        
        System.out.println(sandwich1.getTipo() + " : " + sandwich1.getCalorias());
        System.out.println(sandwich2.getTipo() + " : " + sandwich2.getCalorias());
        System.out.println(sandwich3.getTipo() + " : " + sandwich3.getCalorias());
    }
}
