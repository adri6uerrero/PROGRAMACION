package Abstract;

class Circulo extends FiguraGeometrica {

	private double radio;

	public Circulo(double radio) {

		this.radio = radio;

	}

	public double calcularArea() {

		return Math.PI * radio * radio;

	}

}
