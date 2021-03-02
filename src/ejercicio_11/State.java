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
public class State {
    
    private String estado;
    private int poblacion;
    City ciudad = new City();

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPoblacionEstado() {
        return this.poblacion;
    }

    public void setPoblacionEstado(int poblacion) {
        this.poblacion = poblacion;
    }
    
    
    
    public String getCiudadCapital() {
        return this.ciudad.getCiudad();
    }

    public void setCiudadCapital(String ciudad) {
        this.ciudad.setCiudad(ciudad);
    }

    public int getPoblacionCiudadCapital() {
        return this.ciudad.getPoblación();
    }

    public void setPoblacionCiudadCapilta(int poblacion) {
        this.ciudad.setPoblación(poblacion);
    }
    
    
    
    public String getCiudadPoblada() {
        return this.ciudad.getCiudadPoblada();
    }

    public void setCiudadPoblada(String ciudadPoblada) {
        this.ciudad.setCiudadPoblada(ciudadPoblada);
    }

    public int getPoblacionPoblada() {
        return this.ciudad.getPoblacionPoblada();
    }

    public void setPoblacionPoblada(int poblacionPoblada) {
        this.ciudad.setPoblacionPoblada(poblacionPoblada);
    }
    
    public String toString(){
        return this.estado + " " + this.poblacion;
    }
}
