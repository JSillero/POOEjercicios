from EjerciciosPOO.Fraccion.Fraccion import Fraccion

frac1=Fraccion(10,45)
frac2=Fraccion(2,9)

frac1.sumar_fraccion(frac2)
print(frac1.cadena())
frac1.restar_fraccion(frac2)
print(frac1.cadena())
frac1.multiplicar_fraccion(frac2)
print(frac1.cadena())
frac1.multiplicar_numero(5)
print(frac1.cadena())
print(frac1.resultado())

