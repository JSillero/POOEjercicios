package circulo;
import javax.swing.*;

public class Circulo {
	private float radio;
	
	public Circulo(int radio) {
		this.setRadio(radio);
	}

	public float getRadio() {
		return radio;
	}

	private void setRadio(float radio) {
		if(radio>=0) { 
			this.radio = radio;
		}else {
			System.out.println("El radio no puede ser menor que 0.");
		}
		
		if(this.radio==0)
			JOptionPane.showMessageDialog( null, "Soy un misero punto sin area.", null, 0);
	}
	
	public void Crecer(int cantidad) {
		this.setRadio(this.getRadio() + cantidad);
	}
	
	public void Menguar(int cantidad) {
		this.setRadio(this.getRadio() - cantidad);
	}
	
	
	public String toString() {
		String cadena="Soy un circulo de radio "+ this.getRadio() +" metros. Ocupo un área de "+ (this.getRadio()*Math.PI*Math.PI);
		return cadena;
	}
}
