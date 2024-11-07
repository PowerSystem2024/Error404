/*
Ejercicio 3: Leer 5 elementos numéricos que se intruducirán ordenados de forma
creciente. Éstos los guardaremos en una tabla de tamaño 10. Leer un número N,
e insertarlo en el lugar adecuado para que la tabla continúe ordenada.
 */
package arreglos_ejercicio_3;


import java.util.Scanner;

public class Arreglos_Ejercicio_3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tabla = new int[10];  // El arreglo tiene tamaño 10
        int numero, posicion = 0;

        // Leer 5 números ordenados de forma creciente
        System.out.println("Ingrese 5 números en orden creciente:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tabla[i] = scanner.nextInt();
        }

        // Leer el número N a insertar
        System.out.print("\nIngrese un número para insertar: ");
        numero = scanner.nextInt();

        // Determinar la posición correcta para insertar el número
        while (posicion < 5 && tabla[posicion] < numero) {
            posicion++;
        }

        // Desplazar los elementos hacia la derecha para hacer espacio para el número
        for (int i = 5; i > posicion; i--) {
            tabla[i] = tabla[i - 1];
        }

        // Insertar el número en la posición correcta
        tabla[posicion] = numero;

        // Mostrar la tabla con el número insertado
        System.out.println("\nTabla con el número insertado:");
        for (int i = 0; i < 6; i++) {
            System.out.print(tabla[i] + " ");
        }
    }
}
