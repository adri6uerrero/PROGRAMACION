package POO_VI;

public class descuento {
	 private double precio_por_uno;
	 private int cantidad;
	 private final double descuento = 0.10;
	
	 
	public double getPrecio_por_uno() {
		return precio_por_uno;
	}
	public void setPrecio_por_uno(double precio_por_uno) {
		this.precio_por_uno = precio_por_uno;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double calcularPrecioConDescuento() {
        if (cantidad > 5) {
            double descuentos = precio_por_uno * descuento / 100;
            return (precio_por_uno - descuento) * cantidad;
        } else {
            return precio_por_uno * cantidad;
        }
    }
}
