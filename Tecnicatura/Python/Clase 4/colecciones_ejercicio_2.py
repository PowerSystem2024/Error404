lista1 = ['manzana', 'banana', 'pera', 'naranja', 'uva']
lista2 = ['uva', 'melon', 'naranja', 'mango', 'pera']

# Lista de palabras que aparecen en las dos listas (sin repetición)
union = list(set(lista1) | set(lista2))

# Lista de palabras que aparecen en la primera lista pero no en la segunda
solo_primera = list(set(lista1) - set(lista2))

# Lista de palabras que aparecen en la segunda lista pero no en la primera
solo_segunda = list(set(lista2) - set(lista1))

# Lista de palabras que aparecen en ambas listas
en_ambas = list(set(lista1) & set(lista2))

# Mostrar los resultados
print("1. Palabras que aparecen en ambas listas (sin repetición):", union)
print("2. Palabras solo en la primera lista:", solo_primera)
print("3. Palabras solo en la segunda lista:", solo_segunda)
print("4. Palabras que aparecen en ambas listas:", en_ambas)
