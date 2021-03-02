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
public class CarlysEventPriceWithMethods2 {
    
    private double precio;
    private int invitados;
    private String numEvento;
    private final String LEMA = "La mejor comida";
    private final int PRECIO_POR_PERSONA = 35;
    private final int EVENTO_GRANDE = 50;
    
    public CarlysEventPriceWithMethods2(){
        this.invitados = 30;
        this.numEvento = "A000";
    }
    
    public CarlysEventPriceWithMethods2(int invitados){
        this.precio = invitados * this.PRECIO_POR_PERSONA;
        this.invitados = invitados;
    }
    
    public CarlysEventPriceWithMethods2(String numeroE, int invitados){
        this.numEvento = numeroE;
        this.precio = invitados * this.PRECIO_POR_PERSONA;
        this.invitados = invitados;
    }
    
    public void valoresPredeterminados(){
        this.invitados = 30;
        this.numEvento = "A000";
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setInvitados(int invitados){
        this.invitados = invitados;
        this.precio = invitados * this.PRECIO_POR_PERSONA;
    }
    
    public int getInvitados() {
        return invitados;
    }
    
    public void setNumeroEvento(String numEvento){
        this.numEvento = numEvento;
    }
    
    public String getNumeroEvento(){
        return this.numEvento;
    }
        
    public String getLEMA() {
        return LEMA;
    }
    
    public void tamano(){
        if(this.invitados >= this.EVENTO_GRANDE){
            System.out.println("Es un evento grande");
        }else{
            System.out.println("No es un evento grande");
        }
    }
    
    public void imprimir(){
        System.out.println("LEMA " + this.LEMA);
        System.out.println("Numero de personas: " + this.getInvitados());
        this.tamano();
        System.out.println("Precio por persona: " + this.PRECIO_POR_PERSONA);
        System.out.println("Precio del evento: " + this.getPrecio());
        System.out.println("Numero de evento: " + this.numEvento);
    }
}
