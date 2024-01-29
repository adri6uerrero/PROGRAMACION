package POO_II_2;

public class uso_estudiante {
	public static void main(String[] args) { 
		estudiante adrian = new estudiante("Adrian", 19,7.5); 
		System.out.println("El nombre del estudiante es: "+adrian.getNombre()); 
		System.out.println("La edad del estudiante es: "+adrian.getEdad()); 
		System.out.println("La calificaion del estudiante es: "+adrian.getCalificacion()); 
		}
}
