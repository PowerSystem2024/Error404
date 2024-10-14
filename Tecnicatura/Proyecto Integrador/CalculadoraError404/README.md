# Calculadora Científica

Este proyecto es una **Calculadora Científica**, desarrollada como parte del **proyecto final de semestre** en la **Universidad Tecnológica Nacional (UTN), Facultad Regional San Rafael**, por el grupo **Error404**. El código es una adaptación de un programa original escrito en **PSeInt** que puedes encontrar en el siguiente repositorio: [Error404Calculadora](https://github.com/DiegoLeonardoPaez/Error404Calculadora).

## Integrantes del Grupo Error404
- **Abeiro, Roman**
- **Diaz, Sebastian**
- **Ortega, Lucas**
- **Paez, Diego**

## Funcionalidades

La calculadora incluye las siguientes categorías de operaciones:

### 1. Operaciones Básicas
Permite realizar operaciones matemáticas simples, como:
- **Suma**
- **Resta**
- **Multiplicación**
- **División**

### 2. Operaciones Científicas
Ofrece funcionalidades más avanzadas para cálculos científicos, como:
- **Potencia**: Cálculo de una base elevada a un exponente.
- **Raíz Cuadrada**: Cálculo de la raíz cuadrada de un número.
- **Logaritmo Natural**: Cálculo del logaritmo natural de un número.
- **Seno, Coseno, Tangente**: Cálculos trigonométricos.

### 3. Operaciones de Matrices
Soporta operaciones con matrices como:
- **Suma de Matrices**
- **Resta de Matrices**
- **Multiplicación de Matrices**
- **Cálculo del Determinante de una Matriz 3x3** (regla de Sarrus)
- **Transposición de Matrices**

## Estructura del Proyecto

El código está organizado en las siguientes clases:

- **`CalculadoraCientifica`**: Clase principal que controla el flujo del programa y gestiona el menú.
- **`OperacionesBasicas`**: Clase que maneja las operaciones aritméticas básicas.
- **`OperacionesCientificas`**: Clase que se encarga de las funciones científicas.
- **`OperacionesMatrices`**: Clase que gestiona las operaciones con matrices.

## Instrucciones de Uso

### Requisitos Previos
Debes tener instalado **Java** para poder ejecutar el programa.

### Compilar y Ejecutar

1. Clona este repositorio o descarga los archivos del proyecto.
2. Abre una terminal en el directorio del proyecto y compila el código con el siguiente comando:
   ```bash
   javac CalculadoraCientifica.java
Luego, ejecuta el programa con:
bash
Copiar código
java CalculadoraCientifica
### Menú de Navegación

Una vez ejecutado el programa, se mostrará un menú principal con las siguientes opciones:

1. **Operaciones Básicas**: Para realizar sumas, restas, multiplicaciones o divisiones.
2. **Operaciones Científicas**: Para cálculos como potencia, raíz cuadrada, seno, coseno, etc.
3. **Operaciones de Matrices**: Permite realizar operaciones de suma, resta, multiplicación, determinantes y transposición de matrices.
4. **Salir**: Para terminar el programa.

### Ejemplo de Uso

1. **Seleccionar Operación**: Al ejecutar el programa, se te pedirá que selecciones una opción (1, 2, 3 o 4).
    - Si seleccionas la opción **1**, por ejemplo, el programa te llevará al submenú de operaciones básicas, donde podrás elegir entre sumar, restar, multiplicar o dividir.

2. **Ingresar Valores**: Una vez seleccionada la operación, se te pedirá que ingreses los números correspondientes para realizar el cálculo.

3. **Resultado**: El programa mostrará el resultado y luego te preguntará si deseas realizar otra operación. Si ingresas "S" (sí), volverás al menú principal; si ingresas "N" (no), el programa finalizará.

## Licencia

Este proyecto está bajo la Licencia MIT. Para más detalles, consulta el archivo [LICENSE](LICENSE).

