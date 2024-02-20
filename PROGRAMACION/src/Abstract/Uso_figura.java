package Abstract;

public class Uso_figura {
	public class Main {
		public static void main(String[] args) {
			Rectangulo rectangulo = new Rectangulo(5, 10);
			Circulo circulo = new Circulo(3);
			System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
			System.out.println("Área del círculo: " + circulo.calcularArea());
		}

	}
}
