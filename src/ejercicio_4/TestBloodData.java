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
public class TestBloodData {
    
    public static void main(String[] args) {
        
        BloodData dato = new BloodData();
        
        System.out.print(dato.getSangre());
        System.out.println(dato.getRh());
        
        Patient paciente = new Patient(29,21,"A+");
        
        
        
        System.out.println(paciente.getBloodData());
        System.out.println(paciente.getEdad());
        System.out.println(paciente.getId());
    }
}
