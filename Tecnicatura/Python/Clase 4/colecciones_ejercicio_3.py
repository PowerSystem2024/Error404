personajes = [
    {
        'Nombre': 'Aragorn',
        'Clase': 'Guerrero',
        'Raza': 'Dúnadan del norte'
    },
    {
        'Nombre': 'Gandalf',
        'Clase': 'Mago',
        'Raza': 'Istar'
    },
    {
        'Nombre': 'Legolas',
        'Clase': 'Arquero',
        'Raza': 'Elfo Sindar'
    }
]

for personaje in personajes:
    print(f"Nombre: {personaje['Nombre']}")
    print(f"Clase: {personaje['Clase']}")
    print(f"Raza: {personaje['Raza']}")
    print()  # Salto de línea para separar personajes
