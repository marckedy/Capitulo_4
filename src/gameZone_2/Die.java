/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_2;

/**
 *
 * @author Usuario
 */
import java.util.Random;

public class Die {
    
    private int dado;
    
    public Die(){
        this.Lanzar();
    }
    
    public int getDado(){
        return this.dado;
    }
    
    public void Lanzar(){
        Random dados = new Random();
        this.dado = dados.nextInt(6)+1;
    }
}
