from computadora import Computadora
from monitor import Monitor
from raton import Raton
from teclado import Teclado
from orden import Orden

teclado1 = Teclado('HP', 'USB')
monitor1 = Monitor('HP', '15 Pulgadas')
raton1 = Raton ('HP', 'USB')
computadora1 = Computadora('HP', monitor1, teclado1, raton1)

teclado2 = Teclado('Redragon', 'USB')
monitor2 = Monitor('Sansung', '27 Pulgadas')
raton2 = Raton ('Razer', 'USB')
computadora2 = Computadora('Corsair', monitor1, teclado1, raton1)



teclado3 = Teclado('HP', 'Bluetooth')
monitor3 = Monitor('HP', '32 Pulgadas')
raton3 = Raton ('HP', 'Bluetooth')
computadora3 = Computadora('HP', monitor3, teclado3, raton3)

teclado4 = Teclado('Redragon', 'USB')
monitor4 = Monitor('Sansung', '27 Pulgadas')
raton4 = Raton ('Razer', 'USB')
computadora4 = Computadora('Acer', monitor4, teclado4, raton4)

teclado5 = Teclado('Redragon', 'USB')
monitor5 = Monitor('Sansung', '27 Pulgadas')
raton5 = Raton ('Razer', 'Bluetooth')
computadora5 = Computadora('Samsung', monitor5, teclado5, raton5)

computadora6 = Computadora('Samsung', monitor1, teclado2, raton4)
computadora7 = Computadora('Gamer', monitor2, teclado3, raton5)

computadoras1 = [computadora1, computadora2, computadora7, computadora4]
orden1 = Orden(computadoras1)
orden1.agregar_computadora(computadora3)
print(orden1)

computadoras2 = [computadora3, computadora5, computadora6]
orden2 = Orden(computadoras2)
orden2.agregar_computadora(computadora1)
print(orden2)