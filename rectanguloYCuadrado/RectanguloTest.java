package rectanguloYCuadrado;

public class RectanguloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo rectangulo1 = new Rectangulo(1,4);
		Rectangulo rectangulo2 = new Rectangulo(2,3);

		rectangulo1.muestra();
		rectangulo2.muestra();
		
		System.out.println("Resultado de comparar r1 con r2"+ rectangulo1.compara(rectangulo2));
		System.out.println("¿Son gemelos?" + rectangulo1.es_gemelo(rectangulo2));
		
		System.out.println("Area de r1:"+ rectangulo1.area() + " Perimetro de r1" + rectangulo1.perimetro());
		System.out.println("Area de r2:"+ rectangulo2.area() + " Perimetro de r2" + rectangulo2.perimetro());

		System.out.println("Total de rectangulos creados: "+ Rectangulo.getCreados());

	}

}
