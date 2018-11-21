/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg2_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        float F, K;

        



        System.out.println("Conversor de ºC a F y K\n");

        System.out.println("Introduce una temperatura en ºC\n");

        

        float temp = leer.nextFloat();



        F = (temp * 9 / 5) + 32;

        K = (temp + 273.15f);



        System.out.println("Grados en K=" + K + "\n" + "Grados en F=" + F);



    }
    }
    

