class Cubo:
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.alto * self.profundidad

ancho = float(input("Ingresar el ancho: "))
alto = float(input("Ingresar el alto: "))
profundidad = float(input("Ingresar la profundidad: "))

cubo = Cubo(ancho, alto, profundidad)
print(f"El volumen del cubo es: {cubo.calcular_volumen()}")
