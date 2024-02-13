package herencia;

public class principal {

	public static void main(String[] args) {
		
		animal animal = new animal();
		animal.emitirSonido();
		
		perro perro = new perro();
		perro.emitirSonido();
	}
}
