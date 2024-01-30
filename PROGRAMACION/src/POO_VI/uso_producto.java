package POO_VI;

import javax.swing.JOptionPane;

public class uso_producto {
	 public static void main(String[] args) {
		 try {
		 productos calcular = new productos();
	        /*pregunta el precio*/
	        String input = JOptionPane.showInputDialog("Ingrese el precio del producto:");
	        /*almacena el precio*/
	        double precio = Double.parseDouble(input);
	        calcular.setPrecio(precio);
	        /*hace la operacion de precio * impuesto y muestra el precio final*/
	        double preciofinal =   calcular.preciofinal();
	        JOptionPane.showMessageDialog(null, "El precio con impuestos es: " + preciofinal);
	 }catch(Exception e) {
		 System.out.println("Debes ingresar un numero");
	 }
}
}
