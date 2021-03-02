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
public class Dosdados {
    public static void main(String[] args) {
        Dados dados = new Dados();
        
        System.out.println(dados.getNumero());
        dados.Lanzar();
        System.out.println(dados.getNumero());
        dados.Lanzar();
        System.out.println(dados.getNumero());
        dados.Lanzar();
        System.out.println(dados.getNumero());
    }
}
