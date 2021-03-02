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
public class City {
    
    private String ciudadCapital;
    private int poblacionCapital;
    private String ciudadPoblada;
    private int poblacionPoblada;

    public String getCiudad() {
        return ciudadCapital;
    }

    public void setCiudad(String ciudad) {
        this.ciudadCapital = ciudad;
    }

    public int getPoblación() {
        return poblacionCapital;
    }

    public void setPoblación(int poblacion) {
        this.poblacionCapital =  poblacion;
    }

    public String getCiudadPoblada() {
        return ciudadPoblada;
    }

    public void setCiudadPoblada(String ciudadPoblada) {
        this.ciudadPoblada = ciudadPoblada;
    }

    public int getPoblacionPoblada() {
        return poblacionPoblada;
    }

    public void setPoblacionPoblada(int poblacionPoblada) {
        this.poblacionPoblada = poblacionPoblada;
    }
    
    
}
