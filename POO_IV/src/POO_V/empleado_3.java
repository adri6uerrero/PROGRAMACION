package POO_V;

import java.time.LocalDate;

public class empleado_3 {
	private String nombre; 
	private LocalDate fechaContrato; 

	
	public empleado_3(String nombre, LocalDate fechaContrato) { 
	this.nombre = nombre; 
	this.fechaContrato = fechaContrato; 
	} 
	
	
	public LocalDate dameFechaContrato() {
	return fechaContrato; 
	}
	public String getNombre() { 
	return nombre; 
	} 
	public void setNombre(String nombre) { 
	this.nombre = nombre; 
	} 
	public LocalDate getFechaContrato() { 
	return fechaContrato; 
	} 
	public void setFechaContrato(LocalDate fechaContrato) { 
	this.fechaContrato = fechaContrato; 
	}
}
