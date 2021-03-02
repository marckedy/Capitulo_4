/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;

/**
 *
 * @author Usuario
 */
public class TestCircle {
    
    public static void main(String[] args) {
        
        Circle circulo = new Circle();
        circulo.setRadio(4);
        System.out.println("Diametro = " + circulo.getDiametro());
        System.out.println("Area = " + circulo.getArea());
        
        Circle circulo2 = new Circle();
        circulo2.setRadio(13);
        System.out.println("Diametro = " + circulo2.getDiametro());
        System.out.println("Area = " + circulo2.getArea());
    }
}
