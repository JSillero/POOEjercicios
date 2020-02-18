package colecciones_en_Java;
/**
 * Realiza un programa que escoja al azar 5 palabras en español del mini-
diccionario del ejercicio anterior. El programa irá pidiendo que el usuario teclee
la traducción al inglés de cada una de las palabras y comprobará si son
correctas. Al final, el programa deberá mostrar cuántas respuestas son válidas
y cuántas erróneas.
 */
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio11_comprobacionDiccionario {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		HashMap<String, String> dic = new HashMap<String,String>();
		
		dic.put("blanco", "white");
		dic.put("lampara", "lamp");
		dic.put("mesa", "table");
		dic.put("ensalada", "salad");
		dic.put("tapadera", "lid");
		dic.put("fresas", "strawberry");
		dic.put("mandarina", "tangerine");
		dic.put("hoja", "leaf");
		dic.put("zapato", "shoe");
		dic.put("sombra", "shade");
		dic.put("desodorante", "dehodorant");
		dic.put("dinero", "money");
		dic.put("raton", "mouse");
		dic.put("arbol", "tree");
		
		Set<String> claves = dic.keySet() ;
		Object[] clavesArr =claves.toArray();
		
		int valor=0;
		
		int correcto=0;
		int incorrecto=0;
		
		String respuesta="";
		
		for(int i=0; i<5; i++) {
			
			valor= (int) (Math.random() * (dic.size()  + 1));
			
			System.out.println("Traduccion de: "+ clavesArr[valor]);
			
			respuesta=s.nextLine();
			
			if(respuesta.equals(dic.get(clavesArr[valor])))
				correcto+=1;
			else
				incorrecto+=1;
			
			
		}
		
		System.out.println("Respuestas correctas: "+ correcto);
		System.out.println("Respuestas incorretas: "+ incorrecto);


	}

}
