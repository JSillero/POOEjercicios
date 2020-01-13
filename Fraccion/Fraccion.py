class Fraccion:

    def __init__(self,numerador,denominador):
        self.__num=1
        self.__den=1

        self.num=numerador
        if(denominador!=0):
            self.den=denominador
        else:
            print("EL denominador no puede ser 0, se le asigna 1.")
            self.den=1

    def cadena(self):
        cad= str(self.num) +"/"+ str(self.den)

        return cad

    def resultado(self):
        return self.num/self.den

    def multiplicar_numero(self, numero):
        self.num=self.num * numero

    def multiplicar_fraccion(self,frac):
        self.num=self.num * frac.num
        self.den=self.den * frac.den
        self.simplificar()

    def sumar_fraccion(self, frac):

        self.den=self.den * frac.den
        self.num=self.num * frac.den

        self.num=self.num + (frac.num * self.get_den())
        self.simplificar()

    def restar_fraccion(self,frac):
        self.den=self.den * frac.den
        self.num=self.num * frac.den
        self.num=self.num - (frac.num * self.get_den())
        self.simplificar()

    @property
    def num(self):
        return self.__num

    @num.setter
    def num(self, numerador):
        self.__num=numerador

    @property
    def den(self):
        return self.__den

    @den.setter
    def den(self, denominador):
        if denominador != 0:
            self.__den = denominador
        else:
            print("El denominador no puede ser 0")

    def simplificar(self):
        if(self.num>self.den):
            max=self.num
        else:
            max=self.den

        while True:
            reducible=False
            for i in range(2,(max//2+1   )):
                if(self.num % i==0 and self.den % i ==0):
                    self.num=int(self.num/i)
                    self.den=int(self.den/i)
                    reducible=True

            if not reducible :
                break
