package herencia;

import java.text.DecimalFormat;

public class intentofiguras {
	
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("0.00");
		rectangulo r1 = new rectangulo(2, 32);
		circulo c1 = new circulo(4);
		
		System.out.println("Rectangulo");
		System.out.println("Area");
		System.out.println("Rectángulo base " + r1.getBase() + " y altura " + r1.getAltura() + " es " + r1.calcularArea());
		System.out.println();
		System.out.println("Circulo");
		System.out.println("Area");
		System.out.println("Circulo radio: "+ c1.getRadio() + " : " + formato.format(c1.calcularArea()));
	}

}
