package POO_V;

import java.time.LocalDate;

public class uso_empleado2 {
	public static void main(String[] args) { 
		empleado empleado2 = new empleado("Jose", 3500.0, LocalDate.of(2021, 6, 15)); 
		empleado2.setSueldo(10); 
		double nuevoSueldoEmpleado2 = empleado2.getSueldo(); 
		System.out.println("Nuevo sueldo de " + empleado2.getNombre() + ": " + nuevoSueldoEmpleado2); 
		}
}
