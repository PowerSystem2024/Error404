class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def calcular_area(self):
        return self.base * self.altura

rectangulos = []
for i in range(3):
    print(f"\nRectángulo {i+1}:")
    base = float(input("Ingresar la base: "))
    altura = float(input("Ingresar la altura: "))
    rectangulos.append(Rectangulo(base, altura))

for i, rect in enumerate(rectangulos):
    print(f"\nEl área del Rectángulo {i+1} es: {rect.calcular_area()}")