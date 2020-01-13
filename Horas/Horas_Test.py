from EjerciciosPOO.Horas.Horas import Tiempo

hora=Tiempo(2,65,190)
hora2=Tiempo(1,1,1)
print(hora.cadena())
hora.sumar_tiempo(0,55,190)
print(hora.cadena())
hora.restar_tiempo(99,0,0)
print(hora.cadena())
hora.sumar_tiempo(3,0,0)
print(hora.cadena())
hora.restar_tiempo(0,60,120)
print(hora.cadena())

hora.sumar_tiempo2(hora2)
print(hora.cadena())
