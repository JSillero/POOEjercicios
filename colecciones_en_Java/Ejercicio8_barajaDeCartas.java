package colecciones_en_Java;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
(10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
almacenarlas y asegúrate de que no se repite ninguna.

 * @author Sillero
 *
 *Modifica el programa anterior de tal forma que las cartas se muestren orde-
nadas. Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando

coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 */

public class Ejercicio8_barajaDeCartas {
	

	public static void main(String[] args) {
		ArrayList<Carta> baraja = new ArrayList<Carta>();
				
		for(int i=0; i<10;) {
			Carta carta =new Carta();
			
			Boolean puerta=true;
			for(Carta a:baraja) {
				if(carta.equals(a))
				puerta=false;	
			}
			
			if(puerta) {
				
				i+=1;
				baraja.add( carta );
				
			}
			
		}
		
		
		Collections.sort(baraja);
		
		System.out.println(baraja);
	}

}
