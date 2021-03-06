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
public class Rental2 {
    
    public final static int NUMEROS_MINUTOS_EN_UNA_HORA = 60;
    public final static int TARIFA_POR_HORA = 40;
    private int numeroContrato;
    private int numeroHoras;
    private int numeroSegundos;
    private int precio;
    private String numeroControl;
    
    public Rental2(){
        this.numeroSegundos = 0;
        this.numeroControl = "A000";
    }
    
    public Rental2(String numeroControl, int numeroSegundos){
        this.numeroSegundos = numeroSegundos;
        this.numeroControl = numeroControl;
    }
    
    public void setNumeroContrato(int numero){
        this.numeroContrato = numero;
    }
    
    public void setHorasYMinutos(){
        this.numeroHoras = this.numeroContrato / 60;
        this.numeroSegundos = this.numeroContrato % 60;
    }
    
    public void setPrecio(){
        this.precio = TARIFA_POR_HORA*this.numeroHoras; 
        this.precio = this.numeroSegundos + this.precio;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public int getNumeroSegundos() {
        return numeroSegundos;
    }

    public int getPrecio() {
        this.setPrecio();
        return precio;
    }

    public String getNumeroControl() {
        return numeroControl;
    }
    
    public void imprimir(){
        SammysRentalPrice sammy = new SammysRentalPrice();
        
        this.setNumeroContrato(this.numeroSegundos);
        this.setHorasYMinutos();
        
        
        System.out.print(this.numeroHoras);
        System.out.println(" : " + this.numeroSegundos + " hr");
        System.out.println("Total: $ " + this.getPrecio());
        System.out.println("Numero de control: " + this.numeroControl);
        System.out.println(sammy.getLEMA());
    }
}
