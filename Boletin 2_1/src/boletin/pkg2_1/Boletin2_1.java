/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg2_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        float porcentaje;

        

        System.out.println("Introduce el precio de la tarifa y el precio total pagado\n");

        

        float precioT = sc.nextFloat();

        float precioP = sc.nextFloat();

        

        porcentaje=((precioT-precioP)/precioT)*100; 

        

        System.out.println("Porcentaje aplicado= "+porcentaje);

        
    }
    
}
