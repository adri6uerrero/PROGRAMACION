package POO_II_2;

public class estudiante {
	private String nombre; 
	private int edad; 
	private double calificacion; 
	
	public estudiante(String nombre, int edad, double calificacion) { 
	this.nombre = nombre; 
	this.edad = edad; 
	this.calificacion = calificacion; 
	} 
	
	
	public String getNombre() { 
	return nombre; 
	} 
	public void setNombre(String nombre) { 
	this.nombre = nombre; 
	} 
	public int getEdad() { 
	return edad; 
	} 
	public void setEdad(int edad) { 
	this.edad = edad; 
	} 
	public double getCalificacion() { 
	return calificacion; 
	} 
	public void setCalificacion(double calificacion) { 
	this.calificacion = calificacion; 
	}
}
