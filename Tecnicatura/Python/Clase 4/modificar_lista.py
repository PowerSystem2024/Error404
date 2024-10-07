numbers = list(range(1, 10))

num = int(input("Ingrese un numero para efectuar la multiplicacion: "))

for i in range(len(numbers)):
    if i != len(numbers) - 1:
        print(num * numbers[i], end="-")
    else:
        print(num * numbers[i])
