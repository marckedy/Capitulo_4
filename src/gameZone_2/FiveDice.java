/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class FiveDice {
    
    public static void main(String[] args) {
        
        int intentar=0;
        
       Cubilete humano = new Cubilete();
       
       Cubilete computadora = new Cubilete();
       
       do{
       humano.lanzar();
       humano.mostrar();
       computadora.lanzar();
       computadora.mostrar();
       
       int dado1=humano.evaluar();
       int dado2=computadora.evaluar();
       
       if(dado1==dado2){
           System.out.println("Empate");
       }else{
           if(dado1<dado2){
               System.out.println("El ganador es la computadora");
           }else{
               System.out.println("El ganador es el humano");
           }
       }
       System.out.println("");
       System.out.println("Quieres jugar de nuevo?");
       System.out.println("1. Si");
       System.out.println("2. No");
           Scanner num = new Scanner(System.in);
           intentar = num.nextInt();
       }while(intentar==1);
    }
}
