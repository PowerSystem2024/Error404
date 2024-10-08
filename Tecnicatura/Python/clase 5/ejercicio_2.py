def multiplicar_numeros(*args):
    resultado = 1
    for numero in args:
        resultado *= numero
    return resultado

resultado = multiplicar_numeros(2, 3, 4, 6, 8)
print(f"La multiplicación de los numeros es: {resultado}")
