/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9;


import java.util.GregorianCalendar;
import java.util.Calendar;

public class YearEnd {
    
    public static void main(String[] args) {
        GregorianCalendar fecha = new GregorianCalendar();
    
        int diaActual = fecha.get(Calendar.DAY_OF_YEAR);
    
        fecha.set(Calendar.MONTH, 11);
        fecha.set(Calendar.DATE, 31);
        
        int diaUltimo = fecha.get(Calendar.DAY_OF_YEAR);
        int diferenciaDias = diaUltimo - diaActual + 1;
        
        System.out.print("Faltan " + diferenciaDias);
        System.out.println(" dias para que termine el año");
    }
    
}
