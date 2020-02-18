package colecciones_en_Java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 * 
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
y almacenados en un objeto de la clase ArrayList.
 * 
 * @author Sillero
 *
 */
public class Ejercicio3_ordenarNumeros {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		 Scanner s = new Scanner(System.in);
		
		for(int i=0; i<10 ; i++) {
			System.out.println("Introduce un numero.");
			int numero=s.nextInt();
			numeros.add(numero);
		}
		Collections.sort(numeros);
	
		for(int num : numeros) {
			System.out.println(num);
		}
		
	}

}
