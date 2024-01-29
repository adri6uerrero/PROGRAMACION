package POO_III;

import java.util.Scanner;

public class uso_habitacion {
	public static void main(String[] args) {	 
		habitacion habita = new habitacion(); 
		int [] hab = new int[101]; 
		Scanner sc = new Scanner(System.in); 
		for (int i = 1; i < hab.length; i++) { 
		hab[i] = habita.getli(); 
		if (i % 10 == 0) { 
		System.out.println(hab[i]); 
		} else { 
		System.out.print(hab[i] + " "); 
		} 
		} 
		System.out.println();		 
		inicio(hab); 
		}
		public static void inicio(int [] hab) {		 
		habitacion eleccion = new habitacion(); 
		Scanner sc = new Scanner(System.in); 
		for (int i = 0; i < 1; i++) { 
		System.out.println(" QUE NUMERO DE HABITACION QUIERES RESERVAR: "); 
		eleccion.setnhab(sc.nextInt()); 
		if (eleccion.getnhab() >= 1 && eleccion.getnhab() < 100) { 
		hab(eleccion.getnhab()); 
		} else { 
		System.out.println("este numero de habitacion no existe"); 
		} 
		} 
		} 
		public static void inicio2(int[] habitaciones) { 
		System.out.println(); 
		System.out.println(); 
		System.out.println(habitaciones); 
		} 
		public static void hab(int a) { 

		habitacion reservada = new habitacion(); 

		int[] habitaciones = new int[101]; 

		System.out.println("habitacion alquilada con exito"); 

		for (int i = 1; i < habitaciones.length; i++) { 

		habitaciones[a] = reservada.getoc(); 

		if (i % 10 == 0) { 

		System.out.println(habitaciones[i]+" "); 

		} else { 

		System.out.print(habitaciones[i] + " "); 

		} 

		}
		}
}
