package POO_VI;

import javax.swing.JOptionPane;

public class productos {
	private double precio;
    private final double impuesto = 15.0; 

    /*constructor*/
    public productos() {
    	
    }

    /*getters y setters*/
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getImpuesto() {
		return impuesto;
	}
	
	/*clase para la operacion del precio final*/
	public double preciofinal(){
		double impuestos = 0.15 * precio;
		double pfin = impuestos + precio;
		return pfin;
	}
}


