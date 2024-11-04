class Aritmetica:
    def __init__(self, opA, opB):
        self.opA = opA
        self.opB = opB

    def sumar(self):
        return self.opA + self.opB

    def restar(self):
        return self.opA - self.opB

    def mult(self):
        return self.opA * self.opB

    def dividir(self):
        return self.opA / self.opB

operacion = Aritmetica(129, 345)
print(f'El resultado de la suma de {operacion.opA} y {operacion.opB} es {operacion.sumar()}')
print(f'El resultado de la resta de {operacion.opA} y {operacion.opB} es {operacion.restar()}')
print(f'El resultado de la multiplicación de {operacion.opA} y {operacion.opB} es {operacion.mult()}')
print(f'El resultado de la división de {operacion.opA} y {operacion.opB} es {operacion.dividir():.2f}')
