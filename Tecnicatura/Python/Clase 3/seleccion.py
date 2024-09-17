seleccionArgentina = {}

seleccionArgentina[10] = {
    "nombre": "Lionel",
    "apellido": "Messi",
    "edad": 36,
    "altura": 1.70,
    "precio": 50_000_000,
    "posición": "Delantero"
}

seleccionArgentina[23] = {
    "nombre": "Emiliano",
    "apellido": "Martínez",
    "edad": 31,
    "altura": 1.95,
    "precio": 35_000_000,
    "posición": "Arquero"
}

seleccionArgentina[9] = {
    "nombre": "Julián",
    "apellido": "Álvarez",
    "edad": 24,
    "altura": 1.75,
    "precio": 60_000_000,
    "posición": "Delantero"
}

seleccionArgentina[19] = {
    "nombre": "Nicolás",
    "apellido": "Otamendi",
    "edad": 35,
    "altura": 1.83,
    "precio": 7_000_000,
    "posición": "Defensa"
}

seleccionArgentina[7] = {
    "nombre": "Rodrigo",
    "apellido": "De Paul",
    "edad": 29,
    "altura": 1.80,
    "precio": 40_000_000,
    "posición": "Centrocampista"
}

seleccionArgentina[22] = {
    "nombre": "Lautaro",
    "apellido": "Martínez",
    "edad": 26,
    "altura": 1.74,
    "precio": 80_000_000,
    "posición": "Delantero"
}

seleccionArgentina[3] = {
    "nombre": "Nicolás",
    "apellido": "Tagliafico",
    "edad": 31,
    "altura": 1.72,
    "precio": 15_000_000,
    "posición": "Defensa"
}

seleccionArgentina[11] = {
    "nombre": "Ángel",
    "apellido": "Di María",
    "edad": 36,
    "altura": 1.80,
    "precio": 10_000_000,
    "posición": "Extremo"
}

for numero, jugador in seleccionArgentina.items():
    print(f"Número: {numero}")
    for key, value in jugador.items():
        print(f"{key.capitalize()}: {value}")
    print()
