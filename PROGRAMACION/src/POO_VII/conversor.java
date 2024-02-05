package POO_VII;

public class conversor {
	public static double convertirKilometrosAMillas(double kilometros) {
		return kilometros * 0.621371;
	}

	public static double convertirCelsiusAFahrenheit(double gradosCelsius) {
		return (gradosCelsius * 9 / 5) + 32;
	}

	public static void main(String[] args) {
		double distanciaEnKilometros = 10.0;
		double temperaturaEnCelsius = 25.0;
		System.out.println(distanciaEnKilometros + " kilómetros son "
				+ convertirKilometrosAMillas(distanciaEnKilometros) + " millas.");
		System.out.println(temperaturaEnCelsius + " grados Celsius son "
				+ convertirCelsiusAFahrenheit(temperaturaEnCelsius) + " grados Fahrenheit.");
	}
}
