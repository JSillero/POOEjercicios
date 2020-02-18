package colecciones_en_Java;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja
española y que sume los puntos según el juego de la brisca. El valor de las
cartas se debe guardar en una estructura HashMap que debe contener parejas
(figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser una
estructura de la clase ArrayList que contiene objetos de la clase Carta. El valor
de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey → 4;
el resto de cartas no vale nada.
 * 
 * 
 * @author Sillero
 *
 */
public class Ejercicio12_brisca {

	public static void main(String[] args) {
		
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		
		HashMap<Integer, Integer> dic = new HashMap<Integer,Integer>();
		
		dic.put(1, 11);
		dic.put(2, 0);
		dic.put(3, 10);
		dic.put(4, 0);
		dic.put(5, 0);
		dic.put(6, 0);
		dic.put(7, 0);
		dic.put(8, 2);
		dic.put(9, 3);
		dic.put(10,4);
		
		int suma = 0;
		
		for(int i = 0 ; i<5 ; i++) {
			
			cartas.add(new Carta());
			
			suma += dic.get(cartas.get(i).getNumero());
					
		}
		
		System.out.println("El valor total es: "+ suma);
		
	}
	
	

}
