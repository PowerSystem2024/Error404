class Persona:
    def __init__(self, nombre, apellido, edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
    def mostrar_detalle(self):
        print(f"Persona: {self.nombre}, Nombre: {self.edad}, edad: {self.edad}")

persona1 = Persona("Diego", "Paez", "32")

persona2 = Persona("Favi", "abache", "29")

# Se modifica persona1
persona1 = Persona("Jose", "Perez", "44")

persona1.mostrar_detalle()
persona2.mostrar_detalle()

# persona.mostrar_detalle(persona1) No usar

persona1.telefono = '123456789' # No es lo común la creación de un atributo dentro de un objeto
print(persona1.telefono)