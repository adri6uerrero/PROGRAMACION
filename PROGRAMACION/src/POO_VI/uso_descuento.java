package POO_VI;

import javax.swing.JOptionPane;

public class uso_descuento {
	public static void main(String[] args) {
        descuento producto = new descuento();
        String inputPrecio = JOptionPane.showInputDialog("Introduce el precio: ");
        double precioUnitario = Double.parseDouble(inputPrecio);
        String inputCantidad = JOptionPane.showInputDialog("Introduce la cantidad: ");
        int cantidad = Integer.parseInt(inputCantidad);
        producto.setPrecio_por_uno(precioUnitario);
        producto.setCantidad(cantidad);
        double precioTotal = producto.calcularPrecioConDescuento();
        JOptionPane.showMessageDialog(null, "El precio total con descuento es: " + precioTotal);
    }
}
