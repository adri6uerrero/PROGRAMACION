package POO_VII;

public class cuenta_instancias {
	private static int contadorDeInstancias = 0; 
	public cuenta_instancias() { 
	contadorDeInstancias++; 
	} 

	public static int obtenerNumeroDeInstancias() { 
	return contadorDeInstancias; 
	} 

	public static void main(String[] args) { 
	cuenta_instancias prubea1 = new cuenta_instancias(); 

	cuenta_instancias prueba2 = new cuenta_instancias(); 

	System.out.println("Número de instancias: " + cuenta_instancias.obtenerNumeroDeInstancias()); 

	} 
}
