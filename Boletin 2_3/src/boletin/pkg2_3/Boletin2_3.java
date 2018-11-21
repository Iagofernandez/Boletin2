/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg2_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);

        

        int monedaEuro,billete5,billete20,billete100;

        float resultado;

        

        System.out.println("Introduce la cantidad de monedas de 1 euro:\n");

        

        monedaEuro = leer.nextInt();

        

        System.out.println("Introduce la cantidad de billetes de 5 euros:\n");

        

        billete5 = leer.nextInt();

        

        System.out.println("Introduce la cantidad de billetes de 20 euros:\n");

        

        billete20 = leer.nextInt();

        

        System.out.println("Introduce la cantidad de billetes de 100 euros:\n");

        

        billete100 = leer.nextInt();

        

        resultado=monedaEuro+(billete5*5)+(billete20*20)+(billete100*100);

        

        System.out.println("Dinero="+resultado+"euros");

        

        
    }
    
}
