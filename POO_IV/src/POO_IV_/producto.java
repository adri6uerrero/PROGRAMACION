package POO_IV_;

public class producto {
	private String nombre; 
	private int cantidad; 
	private double precio; 

	/*constructor*/ 
	public producto(String nombre, int cantidad, double precio) { 
	this.nombre = nombre; 
	this.cantidad = cantidad; 
	this.precio = precio; 
	} 

	/* getters y setters */ 
	public String getnombre() { 
	return nombre; 
	} 
	public void setnombre(String nombre) { 
	this.nombre = nombre; 
	} 
	public int getcantidad() { 
	return cantidad; 
	} 
	public void setcantidad(int cantidad) { 
	this.cantidad = cantidad; 
	} 
	public double getprecio() { 
	return precio; 
	} 
	public void setprecio(double precio) { 
	this.precio = precio; 
	}
}
