/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblems_1;

/**
 *
 * @author Usuario
 */
public class TestCarlysEventPriceWithMethods2 {
    
    public static void main(String[] args) {
        
        CarlysEventPriceWithMethods2 evento = new CarlysEventPriceWithMethods2(10);
        
        evento.setInvitados(3);
        evento.setNumeroEvento("M1K3");
        evento.imprimir();
        
        
        CarlysEventPriceWithMethods2 evento2 = new CarlysEventPriceWithMethods2("PW12",70);
        System.out.println("");
        evento2.imprimir();
        
        evento2.valoresPredeterminados();
        System.out.println("");
        evento2.imprimir();
    }
}
