class Vehiculo:
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return 'Color: ' +self.color+ ' Ruedas: ' +str(self.ruedas)
    
class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return super().__str__() + ', Velocidad(km/h: )'+ str(self.velocidad)
    

class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return super().__str__()+' Tipo: '+self.tipo

vehiculo = Vehiculo('Blanco', 4)
print(vehiculo)

auto = Auto('Amarillo', 4, 120)
print(auto)

bici = Bicicleta('Azul', 2, 'Urbana')
print(bici)