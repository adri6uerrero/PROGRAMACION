package POO_VII;

import java.util.Scanner;

public class calculadora {
	public static double sumar(double num1, double num2) {
		return num1 + num2;
	}

	public static double restar(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	public static double dividir(double num1, double num2) {
		if (num2 != 0) {
			return num1 / num2;
		} else {
			throw new IllegalArgumentException("No es posible dividir por cero.");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero: ");

		double num1 = sc.nextDouble();

		System.out.println("Introduce otro numero: ");

		double num2 = sc.nextDouble();

		System.out.println("suma: " + sumar(num1, num2));

		System.out.println("resta: " + restar(num1, num2));

		System.out.println("multiplicacion: " + multiplicar(num1, num2));

		System.out.println("division: " + dividir(num1, num2));

	}
}
