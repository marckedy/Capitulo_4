/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10;

/**
 *
 * @author Usuario
 */
import java.util.GregorianCalendar;
import java.util.Calendar;

public class TestCertificateOfDeposit {
    
    public static void main(String[] args) {
        
        GregorianCalendar fecha = new GregorianCalendar();
        fecha.set(Calendar.DATE, 5);
        fecha.set(Calendar.MONTH, 3);
        fecha.set(Calendar.YEAR, 2021);
        
        CertificateOfDeposit deposito = new CertificateOfDeposit(11129,"Perez",1200, fecha);
        
        deposito.imprimir();
        
    }
}
