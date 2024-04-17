package principal;

public class Ejer03 {
	public static void main(String[] args) {
		
		Persona p1= new Persona("Jose", "Ruiz",33);
		System.out.println(p1.hashCode());
		
		Persona p2= new Persona("Jose", "Ruiz",33);
		System.out.println(p2.hashCode());
		
		if(p1.equals(p2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son distintos");
		}	
	}
}
