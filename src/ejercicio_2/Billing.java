/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

/**
 *
 * @author Usuario
 */
public class Billing {
    
    public static double computeBill(double price){
        price = (price*0.08)+price;
        return price;
    }
    
    public static double computeBill(double price, int cantidad){
        price = price*cantidad;
        price = (price*0.08)+price;
        return price;
    }
    
    public static double computeBill(double price, int cantidad, double cupon){
        price = price*cantidad;
        price = price-cupon;
        price = (price*0.08)+price;
        return price;
    }
}
