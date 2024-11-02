from Empleado import Empleado
from Gerente import Gerente

def imprimir_detalles(objeto):
    print(type(objeto))
    print(objeto.mostrar_detalles())
    if isinstance(objeto, Gerente):
        print(objeto.departamento)


empleado = Empleado('Roman', 100)
imprimir_detalles(empleado)


gerente = Gerente('Natalia', 200, 'Sistema')
imprimir_detalles(gerente)