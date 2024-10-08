agenda = {}

def nuevo_contacto():
    nombre = input("Nombre del contacto: ")
    telefono = input("Telefono del contacto: ")
    agenda[nombre] = telefono
    print(f"Contacto {nombre} agregado")

def borrar_contacto():
    nombre = input("Nombre del contacto a borrar: ")
    if nombre in agenda:
        del agenda[nombre]
        print(f"Contacto {nombre} eliminado")
    else:
        print("El contacto no existe.")

def ver_contactos():
    if agenda:
        print("Lista de contactos:")
        for nombre, telefono in agenda.items():
            print(f"Nombre: {nombre}, Telefono: {telefono}")
    else:
        print("No hay contactos en la agenda")

def salir():
    print("Saliendo del programa")
    exit()

def menu():
    while True:
        print("\nAgenda Telefonica")
        print("1. Nuevo contacto")
        print("2. Borrar contacto")
        print("3. Ver contactos")
        print("4. Salir")
        opcion = input("Opción: ")

        if opcion == '1':
            nuevo_contacto()
        elif opcion == '2':
            borrar_contacto()
        elif opcion == '3':
            ver_contactos()
        elif opcion == '4':
            salir()
        else:
            print("Opción no válida")
menu()
