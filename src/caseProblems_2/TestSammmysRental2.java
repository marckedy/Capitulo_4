/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblems_2;

/**
 *
 * @author Usuario
 */
public class TestSammmysRental2 {
    public static void main(String[] args) {
        
        Rental2 renta = new Rental2();
        renta.imprimir();
        
        System.out.println("");
        
        Rental2 renta2 = new Rental2("PWL23", 90);
        renta2.imprimir();
        
    }
}
