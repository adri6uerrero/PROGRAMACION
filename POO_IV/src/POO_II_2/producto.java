package POO_II_2;

public class producto {
	private String nombre; 
	private double precio; 
	private int stock; 

	 
	public producto(){ 
	nombre = "doritos"; 
	precio = 2.00; 
	stock = 500; 
	} 
	public void setnombre(String nombre) { 
	this.nombre=nombre; 
	} 
	public void setprecio(double precio) { 
	this.precio=precio; 
	} 
	public void setstock(int stock) { 
	this.stock=stock; 
	} 
	public String getnombre() { 
	return nombre; 
	} 
	public double getprecio() { 
	return precio; 
	} 
	public int getstock() { 
	return stock;
	} 
}
