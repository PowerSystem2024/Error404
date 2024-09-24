import math

while True:
    numero = float(input("Ingrese un número positivo: "))
    if numero >= 0:
        break
    else:
        print("El número no es positivo.")

raiz_cuadrada = math.sqrt(numero)

print(f"La raíz cuadrada de {numero} es {raiz_cuadrada}")
