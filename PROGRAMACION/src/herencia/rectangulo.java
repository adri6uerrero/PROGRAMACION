package herencia;

public class rectangulo extends figuras{
	
	private double base, altura;

	public rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		return base * altura * 0.5;
	}

}
