package POO_V;

import java.time.LocalDate;

public class empleado {
	private String nombre; 
	private double sueldo; 
	private LocalDate fechaContrato; 


	public empleado(String nombre, double sueldo, LocalDate fechaContrato) { 
	this.nombre = nombre; 
	this.sueldo = sueldo; 
	this.fechaContrato = fechaContrato; 
	} 
	
	public String getNombre() { 
	return nombre; 
	} 
	public void setNombre(String nombre) { 
	this.nombre = nombre; 
	} 
	public double getSueldo() { 
	return sueldo; 
	} 
	public void setSueldo(double sueldo) { 
	this.sueldo = sueldo; 
	} 
	public LocalDate getFechaContrato() { 
	return fechaContrato; 
	}
	public void setFechaContrato(LocalDate fechaContrato) { 
	this.fechaContrato = fechaContrato; 
	} 
}
