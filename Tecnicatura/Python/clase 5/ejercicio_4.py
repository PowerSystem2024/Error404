def calcular_pago_con_impuesto(pago_sin_impuesto, porcentaje_impuesto):
    impuesto = pago_sin_impuesto * (porcentaje_impuesto / 100)
    pago_total = pago_sin_impuesto + impuesto
    return pago_total

# Ejemplo de uso
pago_sin_impuesto = 1000
porcentaje_impuesto = 21

pago_total = calcular_pago_con_impuesto(pago_sin_impuesto, porcentaje_impuesto)

print(f"Pago sin impuesto: {pago_sin_impuesto}")
print(f"Porcentaje de impuesto: {porcentaje_impuesto}%")
print(f"Pago con impuesto: {pago_total:.2f}")