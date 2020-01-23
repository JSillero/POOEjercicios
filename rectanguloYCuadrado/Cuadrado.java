package rectanguloYCuadrado;

public class Cuadrado extends Rectangulo {
	
	Cuadrado(int lado){
		super(lado,lado);
	}
	
	int getLado() {
		return this.getAltura();
	}
	
	void setLado(int lado) {
		this.setAltura(lado);
		this.setAncho(lado);
	}

}
