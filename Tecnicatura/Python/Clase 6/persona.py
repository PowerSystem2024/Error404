class persona:
    def __init__(self, nombre, apellido, edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
    def mostrar_detalle(self):
        print(f"Persona: {self.nombre}, Nombre: {self.edad}, edad: {self.edad}")

persona1 = persona("Diego", "Paez", "32")

persona2 = persona("Favi", "abache", "29")

# Se modifica persona1
persona1 = persona("Jose", "Perez", "44")

persona1.mostrar_detalle()
persona2.mostrar_detalle()