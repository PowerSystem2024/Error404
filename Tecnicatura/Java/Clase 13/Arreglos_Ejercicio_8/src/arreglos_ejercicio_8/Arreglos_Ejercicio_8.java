/*
Ejercicio 8: Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera
y transponerla en la segunda.
 */

package arreglos_ejercicio_8;

import java.util.Scanner;

public class Arreglos_Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz1 = new int[5][9];  // Matriz original de 5x9
        int[][] matriz2 = new int[9][5];  // Matriz transpuesta de 9x5

        // Cargar la primera matriz (5x9)
        System.out.println("Ingrese los elementos de la matriz de 5x9:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();  // Corregido: Asignar a la celda específica [i][j]
            }
        }

        // Transponer la matriz (convertir 5x9 en 9x5)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matriz2[j][i] = matriz1[i][j];  // Intercambiar filas por columnas
            }
        }

        // Mostrar la matriz transpuesta (9x5)
        System.out.println("\nMatriz transpuesta (9x5):");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();  // Nueva línea para cada fila
        }
    }
}
