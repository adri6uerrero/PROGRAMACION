package POO_V;

import java.time.LocalDate;

public class empleado_2 {
	private String nombre; 
	private double sueldo; 
	private LocalDate fechaContrato; 

	public empleado_2(String nombre, double sueldo, LocalDate fechaContrato) { 
	this.nombre = nombre; 
	this.sueldo = sueldo; 
	this.fechaContrato = fechaContrato; 
	} 
	
	public String dameNombre() { 
	return nombre; 
	} 
	public double dameSueldo() { 
	return sueldo; 
	}  
	public void subeSueldo(double porcentajeAumento) { 
	sueldo += sueldo * (porcentajeAumento / 100.0); 
	} 
	public LocalDate dameFechaContrato() { 
	return fechaContrato; 
	} 
}
