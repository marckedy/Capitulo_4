/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_11;

/**
 *
 * @author Usuario
 */
public class TestState {
    
    public static void main(String[] args) {
        
        State estado = new State();
        
        estado.setEstado("Oaxaca");
        estado.setPoblacionEstado(4132000);
        estado.setCiudadCapital("Oaxaca");
        estado.setPoblacionCiudadCapilta(300050);
        estado.setCiudadPoblada("Ejutla");
        estado.setPoblacionPoblada(17232);
        
        System.out.println(estado);
    }
}
