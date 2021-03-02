/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

/**
 *
 * @author Usuario
 */
public class Bread {
    
    private String tipo;
    private double calorias;
    
    public Bread(){
        this.tipo = "Ninguno";
        this.calorias = 0;
    }
    
    public Bread(String tipo, double calorias){
        this.tipo = tipo;
        this.calorias = calorias;
    }
    
    public final static String MOTTO = "El staff de la vida";
    
    public String getTipo(){
        return this.tipo;
    }
    
    public double getCalorias(){
        return this.calorias;
    }
    
}
