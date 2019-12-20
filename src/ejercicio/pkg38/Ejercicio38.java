/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg38;

import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class Ejercicio38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);
        int numero, mayor = 0, menor = 0,menor2=0, suma = 0, sumaPositivos = 0, sumaNegativos = 0, contador = 0;
        double mediaSuma = 0;
        do {
            System.out.println("Digite un número: ");
            numero = Teclado.nextInt();

            if (numero == -1) {
                System.out.println("Te has salido...");
            } else {
                contador++;
                suma = suma + numero;
                if (numero >= 0) {
                    sumaPositivos = sumaPositivos + numero;
                } else {
                    sumaNegativos = sumaNegativos + numero;
                }
                
                ////corregir corregir corregir
                if(mayor==0){
                   mayor = numero;}
                
                else if(mayor>numero){
                       
                }
                
                else{
                mayor=numero;
                }

            if(menor2==0){
                   menor = numero;
                   menor2++;}
                
                else if(menor<numero){
                       
                }
                
                else{
                menor=numero;
                }
       
            }

        } while (numero != -1);

        mediaSuma = suma / contador;

        System.out.println("El numero mayor digitado fue: " + mayor);
        System.out.println("El numero menor digitado fue: " + menor);
        System.out.println("La suma de todos los números digitados es de " + suma);
        System.out.println("La suma de todos los números positivos es de " + sumaPositivos);
        System.out.println("La suma de todos los números negativos es de " + sumaNegativos);
        System.out.println("La media de la suma de todos los numeros digitados es de " + mediaSuma);
    }

}
