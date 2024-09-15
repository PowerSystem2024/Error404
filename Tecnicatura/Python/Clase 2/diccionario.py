diccionario = {
    "OOP": "Object-Oriented Programming, a programming paradigm based on the concept of objects which can contain data and methods.",
    "IDLE": "Integrated Development and Learning Environment, Python's default IDE which includes an editor and an interpreter.",
    "IDE": "Integrated Development Environment, a software suite that provides comprehensive tools for software development, including a code editor, compiler, and debugger."
}
print(diccionario.get('OOP'))
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)