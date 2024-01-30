package PRUEBA;

public class pruebas {
	public static void main(String[] args) {
		empleados empleado1 = new empleados("Loli");
		empleados empleado2 = new empleados("Indalecio");
		
		
		System.out.println(empleado1.devuelveDatos());
		System.out.println(empleado2.devuelveDatos());
		
		empleado1.cambiaSeccion("Recursos humanos");
	}
}

class empleados{
	
	private final String nombre;
	private String seccion;
	
	public empleados(String nom) {
		nombre = nom;
		seccion = "Administracion";
		
	}
	public void cambiaSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String devuelveDatos() {
		return "El nombre es " + nombre + " y la seccion es " +seccion;
	}
}