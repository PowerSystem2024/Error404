/*
Ejercicio 5: Leer 10 enteros en una tabla. Guardar en otra tabla 
los elementos pares de la primera, y a continuación lso elementos impares.
 */
package arreglos_ejercicio_5;


import java.util.Scanner;

public class Arreglos_Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablaOriginal = new int[10];
        int[] tablaNueva = new int[10];
        int paresIndex = 0, imparesIndex = 0;

        // Leer los 10 números enteros
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tablaOriginal[i] = scanner.nextInt();
        }

        // Almacenar los números pares primero
        for (int i = 0; i < 10; i++) {
            if (tablaOriginal[i] % 2 == 0) {
                tablaNueva[paresIndex++] = tablaOriginal[i];
            }
        }

        // Luego almacenar los números impares
        imparesIndex = paresIndex;  // Iniciar el índice de los impares donde terminaron los pares
        for (int i = 0; i < 10; i++) {
            if (tablaOriginal[i] % 2 != 0) {
                tablaNueva[imparesIndex++] = tablaOriginal[i];
            }
        }

        // Mostrar la nueva tabla
        System.out.println("\nTabla con pares seguidos de impares:");
        for (int i = 0; i < 10; i++) {
            System.out.print(tablaNueva[i] + " ");
        }
    }
}
