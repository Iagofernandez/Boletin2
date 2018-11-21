/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg2_5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);



        float ventas, km, dias,sueldoF,sueldoB,sueldoL;

              

        System.out.println("Calcular sueldo bruto y liquido\n");

        System.out.println("Introduce el importe total de ventas \n");

        ventas = leer.nextFloat();



        System.out.println("Introduce el sueldo fijo\n");

        sueldoF = leer.nextFloat();

        

        System.out.println("Introduce los kilometros hechos\n");

        km = leer.nextFloat();

        System.out.println("Introduce los dias desplazados\n");

        dias = leer.nextFloat();

        

        sueldoB=sueldoF+((ventas*5)/100)+(2*km)+(30*dias);

        

        sueldoL=sueldoB-((sueldoB*18)/100)-36;

        

        System.out.println("Sueldo Bruto= "+sueldoB+"\nSueldo liquido= "+sueldoL);
    }
    
}
