/*
Ejercicio 7: Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla.
Se debe mostrar la posición en que se encuentra. Si no está, indicarlo
con un mensaje.
 */
package arreglos_ejercicio_7;

import java.util.Scanner;

public class Arreglos_Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tabla = new int[10];
        int posicion = -1;

        // Leer los 10 números enteros
        System.out.println("Ingrese 10 números enteros en orden creciente:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tabla[i] = scanner.nextInt();
        }

        // Leer el número N a buscar
        System.out.print("\nIngrese el número a buscar: ");
        int N = scanner.nextInt();

        // Buscar el número N en la tabla
        for (int i = 0; i < 10; i++) {
            if (tabla[i] == N) {
                posicion = i;
                break;  // Salir del bucle una vez encontrado
            }
        }

        // Mostrar el resultado
        if (posicion != -1) {
            System.out.println("El número " + N + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("El número " + N + " no está en la tabla.");
        }
    }
}


