package colecciones_en_Java;

import java.util.ArrayList;
import java.util.Random;

/**
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
y 20 elementos ambos inclusive.
 * 
 * @author Sillero
 *
 */
public class Ejercicio2_valoresaleatorios {
	Random rand = new Random();
	
	public static void main(String[] args) {
		int maximo=-1;
		int min=111;
		int total=0;
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		int tamanno= (int) (Math.random() * (20 - 10 + 1) + 10);
		
		for(int i=0; i<tamanno; i++) {
			
			int numero=(int) (Math.random() * (100 + 1));
			numeros.add(numero);
			
			if(numero>maximo)
				maximo=numero;
			
			if(numero<min)
				min=numero;
			
			total+=numero;
			
			System.out.println(numeros.get(i));
		}
		System.out.println("Maximo: "+ maximo);
		System.out.println("Minimo: "+ min);
		System.out.println("Media: "+total/tamanno);


		
		
	}

}
