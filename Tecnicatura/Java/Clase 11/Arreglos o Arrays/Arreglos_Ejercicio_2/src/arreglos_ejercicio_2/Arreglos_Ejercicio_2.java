/*
Ejercicio  2: Leer 5 números, guardarlos en un arreglo y
mostrarlos en el orden inverso al introducirlos.
 */
package arreglos_ejercicio_2;

import java.util.Scanner;

public class Arreglos_Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] arreglos = new float[5];
        
        System.out.println("Guardando los datos del arreglo");
        for(int i=0;i<5;i++) {
            System.out.println((i+1)+". Digite un número: ");
            arreglos[i] = entrada.nextFloat();
        }
        
         System.out.println("\nImprimit los elemetnos del arreglo");
          for(int i=4;i>=0;i--) {
             System.out.print(i+" ");
        }
        System.out.println("\n");         
    }
    
}
