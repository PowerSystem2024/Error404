class Persona:
    # Esta clase hereda de la clase Object
    def __init__(self, nombre, edad):
        self.__nombre = nombre  # Atributo privado
        self.__edad = edad      # Atributo privado

    # Getters
    def get_nombre(self):
        return self.__nombre

    def get_edad(self):
        return self.__edad

    # Setters
    def set_nombre(self, nombre):
        self.__nombre = nombre

    def set_edad(self, edad):
        self.__edad = edad

class Empleado(Persona):
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self.__sueldo = sueldo  # Atributo privado

    def get_sueldo(self):
        return self.__sueldo

    def set_sueldo(self, sueldo):
        self.__sueldo = sueldo

empleado1 = Empleado('Ariel', 40, 75000)

print(empleado1.get_nombre())
print(empleado1.get_edad())
print(empleado1.get_sueldo())

empleado1.set_nombre('Carlos')
empleado1.set_edad(45)
empleado1.set_sueldo(80000)

print(empleado1.get_nombre())
print(empleado1.get_edad())
print(empleado1.get_sueldo())
