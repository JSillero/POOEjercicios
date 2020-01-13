class Fecha:
    def fecha_correcta(self,fecha):

        correcto = True
        for i in range(0, len(fecha)):
            car = fecha[i:i + 1]
            if (
                    car != "1" and car != "2" and car != "3" and car != "4" and car != "5" and car != "6" and car != "7" and car != "8" and car != "9" and car != "0"):
                correcto = False

        if (correcto):
            dia = self.diaf(fecha)
            mes = self.mesf(fecha)
            anno = self.annof(fecha)

            if (mes > 12 or mes < 1):
                correcto = False

            if ((mes == 1 or mes == 3 or mes == 4 or mes == 5 or mes == 7 or mes == 8 or mes == 10 or mes == 12) and (
                    dia > 31 or dia < 1)):
                correcto = False
            elif (mes == 2 and not self.es_bisiesto(fecha) and (dia > 28 or dia < 1)):
                correcto = False
            elif (mes == 2 and self.es_bisiesto(fecha) and (dia > 29 or dia < 1)):
                correcto = False
            elif (dia > 30 or dia < 1):
                correcto = False

        return correcto

    '''annade un dia a una fecha pasada por parametro en formato AAAAMMDD y se devuelve en el mismo formato'''

    def fecha_mas_1dia(self,fecha):
        dia = self.diaf(fecha)
        mes = self.mesf(fecha)
        anno = self.annof(fecha)

        dia += 1

        while (not self.fecha_correcta(self.fechaf(dia, mes, anno))):
            if (mes > 12):
                anno += 1
                mes -= 12
            if ((mes == 1 or mes == 3 or mes == 4 or mes == 5 or mes == 7 or mes == 8 or mes == 10 or mes == 12) and (
                    dia > 31)):
                mes += 1
                dia -= 31
            elif (mes == 2 and not self.es_bisiesto(fecha) and (dia > 28)):
                mes += 1
                dia -= 28
            elif (mes == 2 and self.es_bisiesto(fecha) and (dia > 29)):
                mes += 1
                dia -= 29
            elif (dia > 30):
                mes += 1
                dia -= 30
        return self.fechaf(dia, mes, anno)

    '''annade un numero de dias determinado por el parametro dias a una fecha pasada por parametro en formato AAAAMMDD y se devuelve en el mismo formato'''

    def fecha_mas_Ndias(self,fecha, dias):
        dia = self.diaf(fecha)
        mes = self.mesf(fecha)
        anno = self.annof(fecha)

        dia += dias

        while (not self.fecha_correcta(self.fechaf(dia, mes, anno))):
            if (mes > 12):
                anno += 1
                mes -= 12
            if ((mes == 1 or mes == 3 or mes == 4 or mes == 5 or mes == 7 or mes == 8 or mes == 10 or mes == 12) and (
                    dia > 31)):
                mes += 1
                dia -= 31
            elif (mes == 2 and not self.es_bisiesto(fecha) and (dia > 28)):
                mes += 1
                dia -= 28
            elif (mes == 2 and self.es_bisiesto(fecha) and (dia > 29)):
                mes += 1
                dia -= 29
            elif (dia > 30):
                mes += 1
                dia -= 30
        return self.fechaf(dia, mes, anno)

    '''substrae un dia a una fecha pasada por parametro en formato AAAAMMDD y se devuelve en el mismo formato'''

    def fecha_menos_1dia(self,fecha):
        dia = self.diaf(fecha)
        mes = self.mesf(fecha)
        anno = self.annof(fecha)

        dia -= 1

        while (not self.fecha_correcta(self.fechaf(dia, mes, anno))):

            if ((mes == 1 or mes == 4 or mes == 5 or mes == 7 or mes == 8 or mes == 10 or mes == 12) and (
                    dia < 1)):
                mes -= 1
                dia += 30
            elif (mes == 3 and not self.es_bisiesto(fecha) and (dia < 1)):
                mes -= 1
                dia += 28
            elif (mes == 3 and self.es_bisiesto(fecha) and (dia < 1)):
                mes -= 1
                dia += 29
            elif (dia < 1):
                mes -= 1
                dia += 31
            if (mes < 1):
                anno -= 1
                mes += 12

        return self.fechaf(dia, mes, anno)

    def fecha_menos_Ndias(self,fecha, dias):
        dia = self.diaf(fecha)
        mes = self.mesf(fecha)
        anno = self.annof(fecha)

        dia -= dias

        while (not self.fecha_correcta(self.fechaf(dia, mes, anno))):

            if ((mes == 1 or mes == 4 or mes == 5 or mes == 7 or mes == 8 or mes == 10 or mes == 12) and (
                    dia < 1)):
                mes -= 1
                dia += 30
            elif (mes == 3 and not self.es_bisiesto(fecha) and (dia < 1)):
                mes -= 1
                dia += 28
            elif (mes == 3 and self.es_bisiesto(fecha) and (dia < 1)):
                mes -= 1
                dia += 29
            elif (dia < 1):
                mes -= 1
                dia += 31
            if (mes < 1):
                anno -= 1
                mes += 12

        return self.fechaf(dia, mes, anno)

    '''Devuelve un valor positivo si la primera fecha introducida es mayor que la segunda, cero si son iguales y un valor negativo
    en caso de que las primera sea menor que la segunda'''

    def compara_fechas(self,fecha1, fecha2):
        fecha1n = int(fecha1)
        fecha2n = int(fecha2)

        return fecha1n - fecha2n

    '''Devuelve un valor booleano dependiendo si la fecha introducida en formado AAAAMMDD es 
    o no un año bisiesto'''

    def es_bisiesto(self,fecha):

        anno = self.annof(fecha)

        if (anno % 4 == 0):
            if (anno % 100 == 0):
                if (anno % 400 == 0):
                    return True
                else:
                    return False
            else:
                return True
        else:
            return False

    def compara_fechas(self,fecha1, fecha2):
        fechan1 = int(fecha1)
        fechan2 = int(fecha2)
        return fechan1 - fechan2

    '''Devuelve la fecha introducida en formato AAAAMMDD en ell formato
    DD de mes de AAAA'''

    def fecha_formateada(self,fecha):
        dia = self.diaf(fecha)
        mes = self.nombre_mes(fecha)
        anno = self.annof(fecha)

        return str(dia) + " de " + mes + " de " + str(anno)

    '''Devuelve el año que se extrae del aparmetro fecha en formado AAAAMMDD'''

    def annof(self,fecha):
        return int(fecha[0:4])

    '''Devuleve el mes que se extrae del parametro fecha en formato AAAAMMDD'''

    def mesf(self,fecha):
        return int(fecha[4:6])

    '''
    Devuelve el nombre del mes que se extrae del parametro fecha que esta en formato 
    AAAAMMDD
    '''

    def nombre_mes(self,fecha):
        mes = self.mesf(fecha)
        if (mes == 1):
            return "Enero"
        elif (mes == 2):
            return "Febrero"
        if (mes == 3):
            return "Marzo"
        if (mes == 4):
            return "Abril"
        if (mes == 5):
            return "Mayo"
        if (mes == 6):
            return "Junio"
        if (mes == 7):
            return "Julio"
        if (mes == 8):
            return "Agosto"
        if (mes == 9):
            return "Septiembre"
        if (mes == 10):
            return "Octubre"
        if (mes == 11):
            return "Noviembre"
        if (mes == 12):
            return "Diciembre"

    '''Devuelve el dia de una fecha en formato AAAAMMDD'''

    def diaf(fecha):
        return int(fecha[6:8])

    '''Formatea una fecha en AAAAMMDD a partir de parametros dia mes y anno'''

    def fechaf(dia, mes, anno):
        dia = str(dia)
        mes = str(mes)
        anno = str(anno)

        if (len(dia) < 2):
            dia = "0" + dia

        if (len(mes) < 2):
            mes = "0" + mes

        while (len(anno) < 4):
            anno = "0" + anno

        return anno + mes + dia