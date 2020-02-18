package colecciones_en_Java;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
(con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
almacenar las parejas de palabras. El programa pedirá una palabra en español
y dará la correspondiente traducción en inglés.
 * 
 * @author Sillero
 *
 */
public class Ejercicio10_diccionarioEspañolIngles {

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
		dic.put("exit", "");
		
		String palabra="";
		
		while(true) {
						
			palabra=s.nextLine();
						
			System.out.println(dic.get(palabra));
		}

	}

}
