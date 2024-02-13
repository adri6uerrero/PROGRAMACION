package herencia;

public class circulo extends figuras {

	private double radio;
	private final double pi;

	public circulo(double radio) {
		this.radio = radio;
		this.pi = Math.PI;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getPi() {
		return pi;
	}

	public double calcularArea() {
		return pi * Math.pow(radio, 2);
	}
}
