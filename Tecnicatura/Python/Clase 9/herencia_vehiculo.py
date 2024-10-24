# Clase padre Vehiculo
class Vehiculo:
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return f'Vehículo de color {self.color} con {self.ruedas} ruedas'

# Clase hija Auto
class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return f'Auto de color {self.color} con {self.ruedas} ruedas y velocidad de {self.velocidad} km/h'

# Clase hija Bicicleta
class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return f'Bicicleta de color {self.color} con {self.ruedas} ruedas de tipo {self.tipo}'

vehiculo = Vehiculo('rojo', 4)
auto = Auto('azul', 4, 120)
bicicleta = Bicicleta('verde', 2, 'montaña')

# Imprimir los objetos
print(vehiculo)
print(auto)
print(bicicleta)
