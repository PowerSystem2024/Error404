lista_original = []
lista_final = []
while True:
    caracteres = str(input("Ingrese caracteres (0 Finaliza): "))
    if caracteres == "0":
        break
    else:
        lista_original.append(caracteres)
        if caracteres not in lista_final:
            lista_final.append(caracteres)
print("Los caracteres sin repetir son:", lista_final)