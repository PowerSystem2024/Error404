/*
Ejercicio 4: Leer 10 números enteros, guardarlos en un
arreglo. Debemos mostrarlos  en el siguiente orden: el primero,
el último, el segundo, el penúltimo, el tercero, etc.
*/


package arreglos_ejercicio_1;

import java.util.Scanner;



public class Arreglos_Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        // Leer 10 números enteros y almacenarlos en el arreglo
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los números en el orden requerido
        int inicio = 0;
        int fin = numeros.length - 1;

        System.out.println("\nNúmeros en el orden solicitado:");
        while (inicio <= fin) {
            if (inicio <= fin) {
                System.out.print(numeros[inicio] + " ");
                inicio++;
            }
            if (inicio <= fin) {
                System.out.print(numeros[fin] + " ");
                fin--;
            }
        }
    }
}
