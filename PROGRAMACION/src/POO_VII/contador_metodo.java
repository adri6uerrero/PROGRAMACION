package POO_VII;

public class contador_metodo {
	public static boolean esNumero(String cadena) {
		try {
			Double.parseDouble(cadena);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean estaEnRango(double numero, double rangoInicio, double rangoFin) {
		return numero >= rangoInicio && numero <= rangoFin;
	}

	public static void main(String[] args) {
		String cadena1 = "123";
		String cadena2 = "abc";
		double numero1 = 15.5;
		double numero2 = 8.0;
		double rangoInicio = 10.0;
		double rangoFin = 20.0;
		System.out.println("¿" + cadena1 + " es un número? " + esNumero(cadena1));
		System.out.println("¿" + cadena2 + " es un número? " + esNumero(cadena2));
		System.out.println("¿" + numero1 + " está en el rango (" + rangoInicio + ", " + rangoFin + ")? "
				+ estaEnRango(numero1, rangoInicio, rangoFin));
		System.out.println("¿" + numero2 + " está en el rango (" + rangoInicio + ", " + rangoFin + ")? "
				+ estaEnRango(numero2, rangoInicio, rangoFin));
	}
}
