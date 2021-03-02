/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

/**
 *
 * @author Usuario
 */
public class TestBirdSighting {
    
    public static void main(String[] args) {
        
        BirdSighting2 prueba = new BirdSighting2(2 , 5, "oro");
        
        System.out.println(prueba.getDia() + " / " + prueba.getMes() + " es el dia " + prueba.getDias() + " del año");
        System.out.println(prueba.getEspecie());
        
    }
}
