package colecciones_en_Java;


public class Carta implements Comparable<Carta> {	 
	 
		enum Palo{
			Bastos,
			Espadas,
			Copas,
			Oros
		}
		
		private Palo palo;
		private int numero=0;
		
		public Carta() {
			this.numero = (int) (Math.random() * (10) + 1);
			
			int palo=  (int) (Math.random() * (4) + 1);
			if(palo==1)
				this.palo=Palo.Bastos;
			if(palo==2)
				this.palo=Palo.Espadas;
			if(palo==3)
				this.palo=Palo.Copas;
			if(palo==4)
				this.palo=Palo.Oros;
		}
		
		public Carta(int numero , Palo palo) {
			this.numero=numero;
			this.palo=palo;
		}
		
		public String toString() {
			
			String cadena= Integer.toString(this.numero)+" de " + this.palo;
			
			if(this.numero==8)
				cadena= "Sota de " + this.palo;
			else if(this.numero==9)
				cadena= "Reina de " + this.palo;
			else if(numero==10)
				cadena= "Rey de " + this.palo;

			return cadena;
		}
		
		public boolean equals(Carta otra) {
			if(otra.numero==this.numero && otra.palo==this.palo)
				return true;
			else
				return false;
		}
		
		public int getNumero() {
			return this.numero;
		}
		
		public Palo getPalo() {
			return this.palo;
		}
		
		public int valor() {
			
			int valor=0;
			if(this.palo==Palo.Bastos)
				valor+=100;
			if(this.palo==Palo.Copas)
				valor+=200;
			if(this.palo==Palo.Espadas)
				valor+=200;
			if(this.palo==Palo.Oros)
				valor+=400;
			
			valor+=this.numero;
			
			return valor;
			
		}

		@Override
		public int compareTo(Carta otra) {
			
			int valor=0;
			if(this.palo==Palo.Bastos)
				valor+=100;
			if(this.palo==Palo.Copas)
				valor+=200;
			if(this.palo==Palo.Espadas)
				valor+=200;
			if(this.palo==Palo.Oros)
				valor+=400;
			
			valor+=this.numero;
			
			
			int valorOtra=0;
			if(otra.palo==Palo.Bastos)
				valorOtra+=100;
			if(otra.palo==Palo.Copas)
				valorOtra+=200;
			if(otra.palo==Palo.Espadas)
				valorOtra+=200;
			if(otra.palo==Palo.Oros)
				valorOtra+=400;
			
			valorOtra+=otra.numero;
			
			return valor - valorOtra;
		}
		
		
	}

