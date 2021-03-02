/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_1;

/**
 *
 * @author Usuario
 */
import java.util.Random;
public class Dados {
    
    private int numero;
    
    public Dados(){
    this.Lanzar();
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void Lanzar(){
        Random r = new Random();
        int aleatorio = r.nextInt(6)+1;
        this.numero = aleatorio;
    }
}

