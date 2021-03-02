/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

/**
 *
 * @author Usuario
 */
public class BirdSighting {
    
    int dia;
    int dias;
    int mes;
    String especie;
    
    public BirdSighting(){
        this.dia = 1;
        this.especie = "Robin";
    }
    
    public BirdSighting(int dia, String especie){
        this.dia = dia;
        this.especie = especie;
    }
    
    public void setMes(int mes){
        this.mes =  mes;
    }
    
    public int getDia(){
        return this.dia;
    }
            
    public int getDias(){
        this.dias = this.Mes() + this.dia;
        return this.dias;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public String getEspecie(){
        return this.especie;
    }
    
    
    public int Mes(){
        
        this.mes--;
        switch(this.mes){
            case 1: this.dias = 31; break;
            case 2: this.dias = 59; break;
            case 3: this.dias = 90; break;
            case 4: this.dias = 120; break;
            case 5: this.dias = 151; break;
            case 6: this.dias = 181; break;
            case 7: this.dias = 212; break;
            case 8: this.dias = 243; break;
            case 9: this.dias = 273; break;
            case 10: this.dias = 304; break;
            case 11: this.dias = 334; break;
            case 12: this.dias = 365; break;
        }
        return this.dias;
    }
}
