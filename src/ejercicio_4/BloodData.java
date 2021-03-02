/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

/**
 *
 * @author Usuario
 */
public class BloodData {
    
    private String sangre;
    private String rh;
    
    public BloodData(){
        
        this.sangre = "O";
        this.rh= "+";
    }
    
    public BloodData(String sangre, String rh){
        this.sangre = sangre;
        this.rh= rh;
    }
    
    public void setSangre(String sangre){
        this.sangre = sangre;
    }
    
    public String getSangre(){
        return this.sangre;
    }
    
    public void setRh(String rh){
        this.rh = rh;
    }
    
    public String getRh(){
        return this.rh;
    }
}
