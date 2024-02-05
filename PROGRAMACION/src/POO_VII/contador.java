package POO_VII;

public class contador {
	private static int contadorLlamadas = 0;

	public void operacionSimple() {

		System.out.println("Realizando una operación simple.");

		contadorLlamadas++;

	}

	public static int obtenerNumeroLlamadas() {

		return contadorLlamadas;

	}

	public static void main(String[] args) {

		contador instancia = new contador();

		instancia.operacionSimple();

		instancia.operacionSimple();

		instancia.operacionSimple();

		System.out.println("Número de llamadas: " + contador.obtenerNumeroLlamadas());

	}
}
