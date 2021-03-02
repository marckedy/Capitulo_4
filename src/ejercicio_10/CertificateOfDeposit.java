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

public class CertificateOfDeposit {
    
    private int numCertificado;
    private String apellido;
    private double saldo;
    private GregorianCalendar fechaEmision;
    private GregorianCalendar fechaVencimiento;

    public CertificateOfDeposit(int numCertificado, String apellido, double saldo, GregorianCalendar fechaEmision) {
        this.numCertificado = numCertificado;
        this.apellido = apellido;
        this.saldo = saldo;
        this.fechaEmision = fechaEmision;
    }
    
    public void fechaVencimiento(){
        this.fechaVencimiento = this.fechaEmision;
        int anio = this.fechaVencimiento.get(Calendar.YEAR) + 1;
        this.fechaVencimiento.set(Calendar.YEAR, anio);
    }
    
    public void imprimir(){
        System.out.println("Numero de Certificado: " + this.numCertificado);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Saldo: " + this.saldo);
        
        System.out.print("Fecha de emicion: ");
        System.out.print(this.fechaEmision.get(Calendar.DATE) + "/");
        System.out.print(this.fechaEmision.get(Calendar.MONTH ) + "/");
        System.out.println(this.fechaEmision.get(Calendar.YEAR));
        
        this.fechaVencimiento();
        
        System.out.print("Fecha de Vencimiento: ");        
        System.out.print(this.fechaVencimiento.get(Calendar.DATE) + "/");
        System.out.print(this.fechaVencimiento.get(Calendar.MONTH ) + "/");
        System.out.println(this.fechaVencimiento.get(Calendar.YEAR));
    }
    
}
