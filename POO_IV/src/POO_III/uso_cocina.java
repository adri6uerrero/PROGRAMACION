package POO_III;

import java.util.Scanner;

public class uso_cocina {
	public static void main(String[] args) { 
		tortillafrancesa(); 
		} 
	
		public static void tortillafrancesa() { 
		cocina nueva = new cocina(); 
		String[] ingre = new String[nueva.getin()]; 
		String[] pasos = new String[nueva.getpa()]; 
		System.out.println(" RECETA PARA HACER UNA TORTILLA FRANCESA"); 
		System.out.println(); 
		System.out.println("INGREDIENTES: "); 
		for (int i = 0; i < ingre.length; i++) { 
		ingre[0] = "huevos"; 
		ingre[1] = "sal"; 
		ingre[2] = "aceite"; 
		System.out.println(ingre[i]); 
		} 
		System.out.println(); 
		System.out.println("PASOS: "); 
		for (int i = 0; i < ingre.length; i++) { 
		pasos[0] = "calentar el aceite"; 
		pasos[1] = "añadir el huevo batido"; 
		pasos[2] = "añadir sal"; 
		System.out.println(pasos[i]); 
		} 
		Scanner sc =new Scanner(System.in); 
		System.out.println(); 
		System.out.print("te gustaria modificar(PULSE-1) algun ingrediente o modificar algun paso (PULSE-2): "); 
		int opcion = sc.nextInt(); 
		if (opcion==1) { 
		modIngrediente(ingre);  
		} 
		} 
		public static void modIngrediente(String[] ingre) { 
		cocina nueva = new cocina(); 
		Scanner sc =new Scanner(System.in); 
		System.out.print("añadir(PULSE-1) o quitar(PULSE-2): "); 
		int opcion=sc.nextInt(); 
		if (opcion ==1) { 
		for (int i = 0; i < ingre.length; i++) { 
		} 
		} 
	}
}
