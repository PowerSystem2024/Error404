class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad
    
    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property
    def nombre(self):
        print('Estamos utilizando el metodo get')
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre):
        print('Estamos utilizando el metodo set')
        self._nombre = nombre
    
    @property
    def apellido(self):
        return self._apellido
    
    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido
    
    @property
    def edad(self):
        return self._edad
    
    @edad.setter
    def edad(self, edad):
        self._edad = edad

#1
print('==================================================================')
Personaa2 = Persona2('Jose', 'patroclo', 40)
print(Personaa2.nombre)
print(Personaa2.apellido)
print(Personaa2.edad)
Personaa2.nombre = 'Josefino'
Personaa2.apellido = 'Parsoto'
Personaa2.edad = 50
Personaa2.mostrar_detalles()
print('==================================================================')
#2
Persona3 = Persona2('Martin', 'Martinez', 70)
print(Persona3.nombre)
print(Persona3.apellido)
print(Persona3.edad)
Persona3.nombre = 'Marcelo'
Persona3.apellido = 'Martines'
Persona3.edad = 77
Persona3.mostrar_detalles()
print('==================================================================')
#3
Persona4 = Persona2('rogelio', 'pomelio', 88)
print(Persona4.nombre)
print(Persona4.apellido)
print(Persona4.edad)
Persona4.nombre = 'Roberto'
Persona4.apellido = 'pomelo'
Persona4.edad = 89
Persona4.mostrar_detalles()
print('==================================================================')