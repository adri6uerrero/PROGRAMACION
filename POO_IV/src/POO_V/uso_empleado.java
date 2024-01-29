package POO_V;

import java.time.LocalDate;

public class uso_empleado {
	public static void main(String[] args) { 
		String nombreEmpleado1 = "Adrian"; 
		double sueldoEmpleado1 = 3000.0; 
		LocalDate fechaContratoEmpleado1 = LocalDate.of(2022, 1, 1); 
		empleado empleado1 = new empleado(nombreEmpleado1, sueldoEmpleado1, fechaContratoEmpleado1); 
		System.out.println("Información de empleado 1: "); 
		System.out.println("Nombre: " + empleado1.getNombre()); 
		System.out.println("Sueldo: " + empleado1.getSueldo()); 
		System.out.println("Fecha de Contrato: " + empleado1.getFechaContrato()); 
		}
}
