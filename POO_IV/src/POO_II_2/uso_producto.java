package POO_II_2;

public class uso_producto {
	public static void main(String[] args) { 
		producto uno = new producto (); 
		uno.setnombre(uno.getnombre()); 
		uno.setprecio(uno.getprecio()); 
		uno.setstock(uno.getstock()); 
		System.out.println("nombre: "+ uno.getnombre()); 
		System.out.println("precio: "+ uno.getprecio()); 
		System.out.println("stock: "+ uno.getstock()); 
	}
}
