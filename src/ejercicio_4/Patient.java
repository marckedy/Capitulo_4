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
public class Patient {
    
    private int id;
    private int edad;
    private String bloodData;
    
    public Patient(){
        this.id = 0;
        this.edad = 0;
        this.bloodData = "O+";
    }
    
    public Patient( int id, int edad, String bloodData){
        this.id = id;
        this.edad = edad;
        this.bloodData = bloodData;
    }
    
    public int getId(){
        return this.id;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String getBloodData(){
        return this.bloodData;
    }
}
