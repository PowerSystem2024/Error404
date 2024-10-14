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
    #Destructor de objetos
    '''
    def __del__(self):
        print(f'Persona2: {self._nombre} {self._apellido} {self._edad})
    '''

if __name__ == '__main__':
    Persona1 = Persona2('Ariel', 'Bentacud', 45)
    print(Persona1.nombre)
    #Atributo read-only (Solo lectura) seria la edad por que no tiene el metodo set
    print(Persona1.edad)

    print(__name__)