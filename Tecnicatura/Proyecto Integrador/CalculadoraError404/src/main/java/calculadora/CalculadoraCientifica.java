package calculadora;

import java.util.Scanner;

public class CalculadoraCientifica {
    // Scanner para leer la entrada del usuario
    private static final Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
    System.out.println("Bienvenido a la aplicación de Calculadora Científica");

    String seguir = "S"; // Variable para controlar el bucle principal
    while (seguir.equals("S")) {
        mostrarMenuPrincipal(); // Muestra el menú principal
        int opcion = scanner.nextInt(); // Lee la opción seleccionada por el usuario

        // Maneja la opción seleccionada
        switch (opcion) {
           /*
           case 1:
                manejarOperacionesBasicas(); Falta la clase para manejar las OP Basicas
                break;
           */ 
            case 2:
                manejarOperacionesCientificas(); // Maneja operaciones científicas
                break;
            case 3:
                manejarOperacionesMatrices(); // Maneja operaciones con matrices
                break;
            case 4:
                System.out.println("Saliendo...");
                seguir = "N"; // Cambia la variable para salir del bucle
                break;
            default:
                System.out.println("Opción no válida"); // Mensaje para opciones inválidas
        }

        // Pregunta al usuario si desea realizar otra operación
        if (!seguir.equals("N")) {
            System.out.print("¿Desea realizar otra operación? (S/N): ");
            seguir = scanner.next().toUpperCase();

            if (seguir.equals("N")) {
                System.out.println("Saliendo del programa...");
            } else if (!seguir.equals("S")) {
                System.out.println("Opción no válida, redirigiendo al menú principal...");
                seguir = "S"; // Redirige al menú principal si la opción es inválida
            }
        }
    }
    scanner.close(); // Cierra el scanner al finalizar
}
private static void mostrarMenuPrincipal() {
    System.out.println("1. Operaciones Básicas");
    System.out.println("2. Operaciones Científicas");
    System.out.println("3. Operaciones de Matrices");
    System.out.println("4. Salir");
    System.out.print("Seleccione una opción: ");
}

// Metodo para manejar las operaciones básicas
private static void manejarOperacionesBasicas() {
    System.out.println("Operaciones Básicas");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicación");
    System.out.println("4. División");
    System.out.print("Seleccione una operación: ");
    int subopcion = scanner.nextInt();

    // Crea una instancia de OperacionesBasicas y ejecuta la operación seleccionada
    OperacionesBasicas operacion = new OperacionesBasicas();
    operacion.ejecutarOperacion(subopcion);
}

// Metodo para manejar las operaciones científicas
private static void manejarOperacionesCientificas() {
    System.out.println("Operaciones Científicas");
    System.out.println("1. Potencia");
    System.out.println("2. Raíz Cuadrada");
    System.out.println("3. Logaritmo");
    System.out.println("4. Seno");
    System.out.println("5. Coseno");
    System.out.println("6. Tangente");
    System.out.print("Seleccione una operación: ");
    int subopcion = scanner.nextInt();

    // Crea una instancia de OperacionesCientificas y ejecuta la operación seleccionada
    OperacionesCientificas operacion = new OperacionesCientificas();
    operacion.ejecutarOperacion(subopcion);
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


// Clase que maneja las operaciones científicas de la calculadora
class OperacionesCientificas {
    // Scanner para leer la entrada del usuario
    private static final Scanner scanner = new Scanner(System.in);

    // Metodo para ejecutar la operación científica seleccionada
    public void ejecutarOperacion(int opcion) {
        switch (opcion) {
            case 1:
                potencia(); // Ejecuta la potencia
                break;
            case 2:
                raizCuadrada(); // Ejecuta la raíz cuadrada
                break;
            case 3:
                logaritmo(); // Ejecuta el logaritmo
                break;
            case 4:
                seno(); // Calcula el seno
                break;
            case 5:
                coseno(); // Calcula el coseno
                break;
            case 6:
                tangente(); // Calcula la tangente
                break;
            default:
                System.out.println("Opción no válida"); // Mensaje para opciones inválidas
        }
    }

    // Metodo para calcular la potencia de un número
    private void potencia() {
        double base;
        // Bucle para asegurar que la base sea mayor a 0
        do {
            System.out.print("Ingrese la base: ");
            base = scanner.nextDouble();
            if (base <= 0) {
                System.out.println("Error: La base debe ser un número mayor a 0.");
            }
        } while (base <= 0);

        double exponente;
        // Bucle para asegurar que el exponente sea mayor a 0
        do {
            System.out.print("Ingrese el exponente: ");
            exponente = scanner.nextDouble();
            if (exponente <= 0) {
                System.out.println("Error: El exponente debe ser un número mayor a 0.");
            }
        } while (exponente <= 0);

        // Calcula y muestra el resultado de la potencia
        System.out.println("El resultado es " + Math.pow(base, exponente));
    }

    // Metodo para calcular la raíz cuadrada de un número
    private void raizCuadrada() {
        double num;
        // Bucle para asegurar que el número sea mayor o igual a 0
        do {
            System.out.print("Ingrese el número para calcular la raíz cuadrada: ");
            num = scanner.nextDouble();
            if (num < 0) {
                System.out.println("Error: El número debe ser mayor o igual a 0.");
            }
        } while (num < 0);

        // Calcula y muestra la raíz cuadrada
        System.out.println("La raíz cuadrada de " + num + " es: " + Math.sqrt(num));
    }

    // Metodo para calcular el logaritmo natural de un número
    private void logaritmo() {
        double num;
        // Bucle para asegurar que el número sea positivo
        do {
            System.out.print("Ingrese el número para calcular el Logaritmo Natural: ");
            num = scanner.nextDouble();
            if (num <= 0) {
                System.out.println("El logaritmo Natural no está definido para números no positivos.");
            }
        } while (num <= 0);

        // Calcula y muestra el logaritmo natural
        System.out.println("El Logaritmo Natural de " + num + " es: " + Math.log(num));
    }

    // Metodo para calcular el seno de un ángulo
    private void seno() {
        System.out.print("Ingrese el número para calcular el Seno: ");
        double num = scanner.nextDouble();
        // Calcula y muestra el seno
        System.out.println("El Seno de " + num + " es: " + Math.sin(num));
    }

    // Metodo para calcular el coseno de un ángulo
    private void coseno() {
        System.out.print("Ingrese el número para calcular el Coseno: ");
        double num = scanner.nextDouble();
        // Calcula y muestra el coseno
        System.out.println("El Coseno de " + num + " es: " + Math.cos(num));
    }

    // Metodo para calcular la tangente de un ángulo
    private void tangente() {
        System.out.print("Ingrese el número para calcular la Tangente: ");
        double num = scanner.nextDouble();
        // Calcula y muestra la tangente
        System.out.println("La Tangente de " + num + " es: " + Math.tan(num));
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
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la posición [" + (i + 1) + ", " + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }
        return matriz;
    }

    // Metodo para mostrar una matriz en la consola
    private void mostrarMatriz(double[][] matriz) {
        for (double[] fila : matriz) {
            for (double valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
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