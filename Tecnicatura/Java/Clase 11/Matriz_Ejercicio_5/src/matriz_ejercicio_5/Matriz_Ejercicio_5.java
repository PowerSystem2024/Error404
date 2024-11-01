/*
Ejercicio 5: Crear y cargasr una matriz de tamaño n x m, mostrar la suma
de cada fila y de cada columna.
 */
package matriz_ejercicio_5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matriz_Ejercicio_5 {
    
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el tamaño de la matriz usando Scanner
        System.out.print("Ingrese el número de filas (n): ");
        int n = sc.nextInt();
        System.out.print("Ingrese el número de columnas (m): ");
        int m = sc.nextInt();

        // Crear la matriz
        int[][] matriz = new int[n][m];

        // Cargar la matriz usando Scanner
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Mostrar la matriz usando JOptionPane
        StringBuilder matrizTexto = new StringBuilder("Matriz ingresada:\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrizTexto.append(matriz[i][j]).append("\t");
            }
            matrizTexto.append("\n");
        }
        JOptionPane.showMessageDialog(null, matrizTexto.toString());

        // Calcular y mostrar la suma de cada fila usando JOptionPane
        StringBuilder sumaFilasTexto = new StringBuilder("Suma de cada fila:\n");
        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < m; j++) {
                sumaFila += matriz[i][j];
            }
            sumaFilasTexto.append("Suma de la fila ").append(i).append(": ").append(sumaFila).append("\n");
        }
        JOptionPane.showMessageDialog(null, sumaFilasTexto.toString());

        // Calcular y mostrar la suma de cada columna usando JOptionPane
        StringBuilder sumaColumnasTexto = new StringBuilder("Suma de cada columna:\n");
        for (int j = 0; j < m; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }
            sumaColumnasTexto.append("Suma de la columna ").append(j).append(": ").append(sumaColumna).append("\n");
        }
        JOptionPane.showMessageDialog(null, sumaColumnasTexto.toString());

        sc.close();
    }
}

