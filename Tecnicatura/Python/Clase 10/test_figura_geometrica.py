from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

print('Creacion de objeto clase Cuadrado'.center(50, '-'))
cuadrado1 = Cuadrado(5, 'Azul')
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'Calculo del area del cuadrado: {cuadrado1.calcular_area()}')


print(cuadrado1)

print('Creacion de objeto clase Rectangulo'.center(50, '-'))
rectangulo1 = Rectangulo(3,8,'verde')
print(f'Calculo del area del rectangulo: {rectangulo1.calcular_area()}')
print(rectangulo1)

print(Cuadrado.mro())
