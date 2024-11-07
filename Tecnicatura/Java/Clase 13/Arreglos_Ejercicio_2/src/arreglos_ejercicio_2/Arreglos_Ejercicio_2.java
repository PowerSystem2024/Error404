/*
Ejercicio 2: Leer por teclado dos tablas de 10 números
enteros y mezclarlas en una tercera de la forma: el 1ᵃ de A,
el 1ᵃ de B, el 2ᵃ de A, el 2ᵃ de B, etc.
*/
package arreglos_ejercicio_2;

import java.util.Scanner;

public class Arreglos_Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablaA = new int[10];
        int[] tablaB = new int[10];
        int[] tablaMezclada = new int[20];  // La tabla mezclada será de tamaño 20 (10 de A + 10 de B)

        // Leer los números para la tabla A
        System.out.println("Ingrese 10 números para la tabla A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + " de A: ");
            tablaA[i] = scanner.nextInt();
        }

        // Leer los números para la tabla B
        System.out.println("\nIngrese 10 números para la tabla B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + " de B: ");
            tablaB[i] = scanner.nextInt();
        }

        // Mezclar las tablas A y B en tablaMezclada
        int j = 0;
        for (int i = 0; i < 10; i++) {
            tablaMezclada[j++] = tablaA[i];  // Primero el de A
            tablaMezclada[j++] = tablaB[i];  // Luego el de B
        }

        // Mostrar la tabla mezclada
        System.out.println("\nTabla mezclada:");
        for (int i = 0; i < 20; i++) {
            System.out.print(tablaMezclada[i] + " ");
        }
    }
}
