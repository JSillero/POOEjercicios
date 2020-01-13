'''1. Crea la clase Tiempo. Los objetos de la clase Tiempo son intervalos de tiempo y se crean de la forma:

t = Tiempo(1, 20, 30)

donde los parámetros que se le pasan al constructor son las horas, los minutos y los segundos respectivamente.

Crea métodos para:

Sumar y restar otro objeto de la clase Tiempo.
Sumar y restar segundos, minutos y/o horas.
Devolver una cadena con el tiempo almacenado, de forma que si lo que hay es (10 35 5) la cadena sea 10h 35m 5s.'''

class Tiempo:
    def __init__(self,horas,minutos,segundos):
        self.horas=horas
        self.minutos=minutos
        self.segundos=segundos
        self.hora_ajustada()


    def sumar_tiempo(self,horas,minutos,segundos):
        self.horas += horas
        self.minutos += minutos
        self.segundos += segundos
        self.hora_ajustada()

    def sumar_tiempo2(self,tiempo):
        self.horas += tiempo.horas
        self.minutos += tiempo.minutos
        self.segundos += tiempo.segundos
        self.hora_ajustada()

    def restar_tiempo(self,horas,minutos,segundos):
        self.horas-=horas
        self.minutos-=minutos
        self.segundos-=segundos
        self.hora_ajustada()

    def cadena(self):
        cad= str(self.horas)+ "h " +str(self.minutos)  + "m " + str(self.segundos) + "s"
        return cad

    '''Metodo dedicado a impedir que los valores de horas, minutos y segundos se salgan de sus valores límites.'''
    def hora_ajustada(self):
        while(self.horas<0 or self.minutos<0 or self.segundos<0 or self.minutos>=60 or self.segundos>=60):
            if self.horas<0:
                print("La hora no pueded ser negativa, todos los valores seran asignados 0")
                self.horas = 0
                self.minutos = 0
                self.segundos = 0
                break
            if self.minutos<0:
                self.horas-=1
                self.minutos+=60
            if self.segundos<0:
                self.minutos-=1
                self.segundos+=60
            if self.minutos>=60:
                self.minutos-=60
                self.horas+=1
            if self.segundos>=60:
                self.segundos-=60
                self.minutos+=1