/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
public class NextMonth {
    
    public static void main(String[] args) {
        
        GregorianCalendar today = new GregorianCalendar();
        int dia = today.get(Calendar.DAY_OF_MONTH);
        int mes = today.get(Calendar.MONTH); //MONTH lo da en 0 a 11
        int anio = today.get(Calendar.YEAR);
        
        System.out.println(dia + "/" + mes + "/" + anio);
        
        
        
        int diaDelAnio = today.get(Calendar.DAY_OF_YEAR);
        
        today.set(Calendar.DAY_OF_MONTH, 1);
        today.set(Calendar.MONTH, mes+1);
        int diaPrimeroDelSiguienteMes = today.get(Calendar.DAY_OF_YEAR);
        
        int diasRestantes = diaPrimeroDelSiguienteMes - diaDelAnio;
        System.out.print("Faltan " + diasRestantes);
        System.out.println(" dias para que sea primero del siguiente mes");
    }
}
