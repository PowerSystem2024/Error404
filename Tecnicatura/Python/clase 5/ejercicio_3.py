def imprimir_descendente(n):
    if n <= 0:
        return
    print(n)
    imprimir_descendente(n - 1)

numero = int(input("Ingrese un número positivo: "))
imprimir_descendente(numero)