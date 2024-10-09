lista = []
while True:
    num = int(input("Ingrese numeros. El 0 es para finalizar: "))
    if num == 0:
        break
    else:
        lista.append(num)
lista.sort()
print("La lista ordenada es: ", lista)