/*
 Ejercicio 4: Leer por teclado una tabla de 10 elementos numéricos enteros
y una posición (entre 0 y 9). Eliminar el elemento situado en la posición
dada sin dejar huecos
 */
package arreglos_ejercicio_4;

import java.util.Scanner;

public class Arreglos_Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tabla = new int[10];

        // Leer los 10 números enteros
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tabla[i] = scanner.nextInt();
        }

        // Leer la posición a eliminar
        int posicion;
        do {
            System.out.print("\nIngrese la posición del elemento a eliminar (0 - 9): ");
            posicion = scanner.nextInt();
        } while (posicion < 0 || posicion > 9); // Validar que la posición esté en el rango correcto

        // Eliminar el elemento en la posición dada
        for (int i = posicion; i < 9; i++) {
            tabla[i] = tabla[i + 1];  // Desplazar los elementos a la izquierda
        }

        // Asignar un valor nulo (o marcador) al último elemento, ya que se eliminó uno
        tabla[9] = 0;  // Esto depende de si se quiere un marcador especial 

        // Mostrar la tabla actualizada
        System.out.println("\nTabla después de eliminar el elemento en la posición " + posicion + ":");
        for (int i = 0; i < 9; i++) {
            System.out.print(tabla[i] + " ");
        }
    }
}

