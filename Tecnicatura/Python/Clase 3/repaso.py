# Repaso tuplas
tupla = (4, 'Hola', 6.78, [1, 2, 78], 4, 'Hola') # Puede tener diferentes tipos de datos
print(4 in tupla) # Rta booleana
# Lo que podemos usar dentro de tuplas son: index, count, len
# Se puede convertir de tupla a lista y de lista a tupla

# Repaso de set o conjunto
conjunto1 = set()
conjunto2 = {'bye'}
conjunto1.add(7)
conjunto1.add('Hola')
print(conjunto1)
conjunto2.add('Hola')
print(conjunto2)
print(3 not in conjunto2)

# Igualdad de dos conjunto
print(conjunto2 == conjunto1) # Rta booleana

# Operaciones con conjuntos
conjunto3 = conjunto2 | conjunto1 # full join
print(conjunto3)

conjunto3 = conjunto2 & conjunto1 # inner join
print(conjunto3)

conjunto3 = conjunto2 - conjunto1 # left join
print(conjunto3)

conjunto3 = conjunto2 ^ conjunto1 # fullouter join
print(conjunto3)