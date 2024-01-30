package POO_IV_;

import javax.swing.JOptionPane;

public class uso_producto {
	public static void main(String[] args) { 
		producto[] productos = new producto[3]; 
		productos[0] = new producto("huevos", 1000, 5); 
		productos[0] = new producto("doritos", 2000, 2); 
		productos[0] = new producto("pringles", 3000, 3); 
		/* 
		 * bucle for para poner que los productos son = i, mientras i<3 se hara el bucle 
		 */ 
		for (int i = 0; i < 3; i++) { 
		/* pregunta el nombre */ 
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto " + (i + 1) + ":"); 
		/* pregunta cantidad */ 
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de " + nombre + ":")); 
		/* pregunta precio */ 
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de " + nombre + ":")); 
		/* hace que producto sea = i */ 
		producto producto = new producto(nombre, cantidad, precio); 
		productos[i] = producto; 
		}
		/* no se como hacer que se vea almacenado */ 
		} 
}
