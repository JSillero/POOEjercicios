package rectanguloYCuadrado;


/***
 * Clase rectangulo
 * 
 * @author Sillero
 *
 */
public class Rectangulo {
	private int altura=1;
	private int ancho=1;
	private static int numCreado=0;
	private static int ladoMax=10;
	
	Rectangulo(int ancho, int altura){
		this.setAltura(altura);
		this.setAncho(ancho);
		Rectangulo.numCreado+=1;
		
	}
	
	//AÑADIR EL DELETER QUE NO SE COMO SE HACE no se puede'?
	
	void setAltura(int alt)  {
		try {
			Rectangulo.ladovalido(alt);
			this.altura=alt;
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Lado invalido(menor que 0 o mayor que"+this.getCreados() + ", no se ha cambiado el alto");
		}
		
		
	}
	int getAltura() {
		return this.altura;
	}
	
	void setAncho(int anch)  {
		try {
			Rectangulo.ladovalido(anch);
			this.ancho=anch;
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Lado invalido(menor que 0 o mayor que"+this.getCreados() + ", no se ha cambiado el ancho");
		}
		
		
	}
	int getAncho() {
		return this.ancho;
	}
	
	public static int getCreados() {
		return Rectangulo.numCreado;
	}


	static private void ladovalido(int lado) throws Exception {
		if(lado>ladoMax || lado<0)
			throw new Exception("Lado invalido.");
	}
	
	/**
	 * 
	 * @return perimetro del paralelipedo
	 */
	int perimetro() {
		
		return this.getAltura()*2+this.getAncho()*2;
	}
	
	/**
	 * 
	 * @return area del paralelipedo 
	 */
	int area( ) {
		
		return this.getAltura()*this.getAncho();
	}
	/**
	 * 
	 * @param otro objeto de la clase rectangulo con el que vamos a comparar
	 * @return valor de restar la area de uno con la de otro, dara 0 si iguales,
	 *  <0 si menores y >0 si mayor
	 */
	int compara(Rectangulo otro) {
		return this.area() - otro.area();
	}
	
	/**
	 * 
	 * @param otro otro objeto de tipo rectangulo
	 * @return
	 */
	boolean es_gemelo(Rectangulo otro) {
		
		return this.getAltura() == otro.getAltura() && this.getAncho() == otro.getAncho() ;
	}
	
	/**
	 * Muestra el objeto por pantalla
	 */
	void muestra() {
		System.out.println(this);
	}
	
	/**
	 * devuelve un rectangulo pintado con asteriscos de la dimension acorde a
	 * los atributos de altura y anchura.
	 */
	@Override
	public String toString() {
		String cuad="";
		
		for(int i=0;i<this.getAncho();i++)
			cuad+="*";
		
		cuad+="\n";
		
		for(int i=2; i<this.getAltura(); i++) {
			
			if(this.getAncho()>1)
				cuad+=("*");
			
			for(int e=2;e<this.getAncho();e++)
				cuad+=(" ");
			
			cuad+=("*\n");
		}
		
		if(this.area()>1) {
			for(int i=0;i<this.getAncho();i++)
				cuad+=("*");
		}
		
		return cuad;
	}
	
	public boolean menorQue(Rectangulo otro) {
		return this.area()<otro.area();
	}
	
	public boolean mayorQue(Rectangulo otro) {
		return this.area()>otro.area();
	}
	
	public boolean igualQue(Rectangulo otro) {
		return this.area()==otro.area();
	}
	
	/**
	 * Multiplica la base si no se pasa del lado máximo, en ese caso lo
        hace con la altura.
	 * 
	 * @param mult
	 */
	public void multiply(int mult) {
		if(this.getAncho()*mult <= Rectangulo.ladoMax) {
			this.setAncho(this.getAncho()*mult);
		}else {
			this.setAltura(this.getAltura()*mult);
		}
		
	}
}
