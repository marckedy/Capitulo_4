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
public class SandwichFilling {
    
    private String tipo;
    private double calorias;
    
    public SandwichFilling(String tipo, double calorias){
        this.tipo = tipo;
        this.calorias = calorias;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public double getCalorias(){
        return this.calorias;
    }
}
