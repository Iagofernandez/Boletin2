/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg2_4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        int b100,b20,b5,moneda1;

        

        System.out.println("Introduce una cantidad entera de dinero:\n");

        

        int dinero = sc.nextInt();

        

        b100= (dinero/100);     

        b20= (dinero-(dinero%20))/20;

        b5= (dinero-(dinero%5))/5;

        moneda1= (dinero-(dinero%1))/1;

        

        System.out.println("Billetes 100= "+b100+"\nBilletes 20= "+b20+"\nBilletes 5= "+b5+"\nMonedas 1 euro= "+moneda1);

        

       

    }
    }
    

