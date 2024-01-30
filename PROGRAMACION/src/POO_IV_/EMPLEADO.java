package POO_IV_;

public class EMPLEADO {
	private String nombre; 
	private double horasTrabajadas; 
	private double tarifaPorHora;   

	public EMPLEADO(String nombre, double horasTrabajadas, double tarifaPorHora) { 
	this.nombre = nombre; 
	this.horasTrabajadas = horasTrabajadas; 
	this.tarifaPorHora = tarifaPorHora; 
	} 

	public String getNombre() { 
	return nombre; 
	} 
	public void setNombre(String nombre) { 
	this.nombre = nombre; 
	} 
	public double getHorasTrabajadas() { 
	return horasTrabajadas; 
	} 
	public void setHorasTrabajadas(double horasTrabajadas) { 
	this.horasTrabajadas = horasTrabajadas; 
	} 
	public double getTarifaPorHora() { 
	return tarifaPorHora; 
	} 	 
	public void setTarifaPorHora(double tarifaPorHora) { 
	this.tarifaPorHora = tarifaPorHora; 
	} 	 
	/*metodo para calcular el salario*/ 
	public double calcularSalario() { 
	return horasTrabajadas * tarifaPorHora; 
	} 
}
