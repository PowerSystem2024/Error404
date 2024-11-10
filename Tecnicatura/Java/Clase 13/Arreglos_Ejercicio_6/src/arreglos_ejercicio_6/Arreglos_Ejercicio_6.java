/*
 Ejercicio 6: Leer dos series de 10 enteros, que estarán ordenados crecientemente.
Copiar(fusionar) las dos tablas en una tarcera, de forma que sigan ordenados.
 */
package arreglos_ejercicio_6;

import java.util.Scanner;

public class Arreglos_Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] serie1 = new int[10];
        int[] serie2 = new int[10];
        int[] fusion = new int[20];  // Arreglo para fusionar las dos series

        // Leer la primera serie de 10 números ordenados
        System.out.println("Ingrese 10 números ordenados para la primera serie:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            serie1[i] = scanner.nextInt();
        }

        // Leer la segunda serie de 10 números ordenados
        System.out.println("\nIngrese 10 números ordenados para la segunda serie:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            serie2[i] = scanner.nextInt();
        }

        // Fusionar las dos series en un solo arreglo ordenado
        int i = 0, j = 0, k = 0;  // Índices para recorrer las dos series
        while (i < 10 && j < 10) {
            if (serie1[i] <= serie2[j]) {
                fusion[k] = serie1[i];
                i++;
            } else {
                fusion[k] = serie2[j];
                j++;
            }
            k++;
        }

        // Si quedan elementos en serie1
        while (i < 10) {
            fusion[k] = serie1[i];
            i++;
            k++;
        }

        // Si quedan elementos en serie2
        while (j < 10) {
            fusion[k] = serie2[j];
            j++;
            k++;
        }

        // Mostrar la tabla fusionada
        System.out.println("\nSerie fusionada:");
        for (int x = 0; x < 20; x++) {
            System.out.print(fusion[x] + " ");
        }
    }
}


   