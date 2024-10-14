package calculadora;

import java.util.Scanner;

public class CalculadoraCientifica {
    // Scanner para leer la entrada del usuario
    private static final Scanner scanner = new Scanner(System.in);

    // Metodo principal que ejecuta la calculadora
    public static void main(String[] args) {
        manejarOperacionesMatrices();
    }

    // Metodo para manejar las operaciones con matrices
    private static void manejarOperacionesMatrices() {
        System.out.println("Operaciones de Matrices");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. Determinante");
        System.out.println("5. Transposición");
        System.out.print("Seleccione una operación: ");
        int subopcion = scanner.nextInt();

        // Crea una instancia de OperacionesMatrices y ejecuta la operación seleccionada
        OperacionesMatrices operacion = new OperacionesMatrices();
        operacion.ejecutarOperacion(subopcion);
    }
}

// Clase que maneja las operaciones con matrices de la calculadora
class OperacionesMatrices {
    // Scanner para leer la entrada del usuario
    private static final Scanner scanner = new Scanner(System.in);

    // Metodo para ejecutar la operación de matrices seleccionada
    public void ejecutarOperacion(int opcion) {
        switch (opcion) {
            case 1:
                sumaMatrices(); // Ejecuta la suma de matrices
                break;
            case 2:
                restaMatrices(); // Ejecuta la resta de matrices
                break;
            case 3:
                multiplicacionMatrices(); // Ejecuta la multiplicación de matrices
                break;
            case 4:
                determinanteMatriz(); // Calcula el determinante de una matriz
                break;
            case 5:
                transpuestaMatriz(); // Calcula la transpuesta de una matriz
                break;
            default:
                System.out.println("Opción no válida"); // Mensaje para opciones inválidas
        }
    }

    // Metodo para cargar una matriz ingresada por el usuario
    private double[][] cargarMatriz(int filas, int columnas) {
        double[][] matriz = new double[filas][columnas];
        return matriz;
    }

    // Metodo para mostrar una matriz en la consola
    private void mostrarMatriz(double[][] matriz) {
        System.out.println();
    }

    // Metodo para sumar dos matrices
    private void sumaMatrices() {
        System.out.println("Ejecutando Suma de Matrices...");
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        // Carga la primera matriz
        System.out.println("Ingrese la matriz A:");
        double[][] matrizA = cargarMatriz(filas, columnas);

        // Carga la segunda matriz
        System.out.println("Ingrese la matriz B:");
        double[][] matrizB = cargarMatriz(filas, columnas);

        // Inicializa la matriz resultado
        double[][] resultado = new double[filas][columnas];
        // Suma elemento por elemento
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Muestra el resultado de la suma
        System.out.println("El resultado de la suma de matrices es:");
        mostrarMatriz(resultado);
    }

    // Metodo para restar dos matrices
    private void restaMatrices() {
        System.out.println("Ejecutando Resta de Matrices...");
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        // Carga la primera matriz
        System.out.println("Ingrese la matriz A:");
        double[][] matrizA = cargarMatriz(filas, columnas);

        // Carga la segunda matriz
        System.out.println("Ingrese la matriz B:");
        double[][] matrizB = cargarMatriz(filas, columnas);

        // Inicializa la matriz resultado
        double[][] resultado = new double[filas][columnas];
        // Resta elemento por elemento
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }

        // Muestra el resultado de la resta
        System.out.println("El resultado de la resta de matrices es:");
        mostrarMatriz(resultado);
    }

    // Metodo para multiplicar dos matrices
    private void multiplicacionMatrices() {
        System.out.println("Ejecutando Multiplicación de Matrices...");
        System.out.print("Ingrese el número de filas de la matriz A: ");
        int filasA = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz A: ");
        int columnasA = scanner.nextInt();

        System.out.print("Ingrese el número de filas de la matriz B: ");
        int filasB = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz B: ");
        int columnasB = scanner.nextInt();

        // Verifica si las matrices se pueden multiplicar
        if (columnasA != filasB) {
            System.out.println("Error: El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.");
            return; // Termina el metodo si no se pueden multiplicar
        }

        // Carga la primera matriz
        System.out.println("Ingrese la matriz A:");
        double[][] matrizA = cargarMatriz(filasA, columnasA);

        // Carga la segunda matriz
        System.out.println("Ingrese la matriz B:");
        double[][] matrizB = cargarMatriz(filasB, columnasB);

        // Inicializa la matriz resultado con dimensiones apropiadas
        double[][] resultado = new double[filasA][columnasB];
        // Realiza la multiplicación de matrices
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Muestra el resultado de la multiplicación
        System.out.println("El resultado de la multiplicación de matrices es:");
        mostrarMatriz(resultado);
    }

    // Metodo para calcular el determinante de una matriz 3x3 usando la regla de Sarrus
    private void determinanteMatriz() {
        System.out.println("Ejecutando Determinante de Matrices...");
        System.out.println("Info >> La regla de Sarrus es un método específico para calcular el determinante de una matriz cuadrada de tamaño 3x3");

        int filas = 3;
        int columnas = 3;

        // Carga la matriz 3x3
        System.out.println("Ingrese los elementos de la matriz A:");
        double[][] matriz = cargarMatriz(filas, columnas);

        // Muestra la matriz ingresada
        System.out.println("La matriz ingresada es:");
        mostrarMatriz(matriz);

        // Calcula el determinante usando la regla de Sarrus
        double determinante =
                        matriz[0][0] * matriz[1][1] * matriz[2][2] +
                        matriz[1][0] * matriz[2][1] * matriz[0][2] +
                        matriz[2][0] * matriz[0][1] * matriz[1][2] -
                        matriz[2][0] * matriz[1][1] * matriz[0][2] -
                        matriz[0][0] * matriz[2][1] * matriz[1][2] -
                        matriz[1][0] * matriz[0][1] * matriz[2][2];

        // Muestra el determinante calculado
        System.out.println("La Determinante es: " + determinante);
    }

    // Metodo para calcular la transpuesta de una matriz
    private void transpuestaMatriz() {
        System.out.println("Ejecutando Transposición de Matriz...");
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        // Carga la matriz original
        System.out.println("Ingrese los elementos de la matriz:");
        double[][] matrizOriginal = cargarMatriz(filas, columnas);

        // Muestra la matriz original
        System.out.println("Matriz Original:");
        mostrarMatriz(matrizOriginal);

        // Inicializa la matriz transpuesta con dimensiones invertidas
        double[][] matrizTranspuesta = new double[columnas][filas];
        // Realiza la transposición
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }

        // Muestra la matriz transpuesta
        System.out.println("Matriz Transpuesta:");
        mostrarMatriz(matrizTranspuesta);
    }
}
