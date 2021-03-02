/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;

/**
 *
 * @author Usuario
 */
public class Circle {
    
    private double radio;
    private double diametro;
    private double area;

    public Circle() {
        this.radio = 1;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
        this.Diametro();
        this.Area();
    }
    
    
    
    public void Diametro(){
        this.diametro = radio*2;
    }
    
    public double getDiametro(){
        return this.diametro;
    }
    
    public void Area(){
        this.radio = Math.PI * Math.pow(2,this.radio);
    }
    
    public double getArea(){
        return this.radio;
    }
    
}
