package POO_V;

import java.time.LocalDate;

public class uso_empleado3 {
	public static void main(String[] args) { 
		 empleado_3 empleado3 = new empleado_3("Maria", LocalDate.of(2005, 12, 8)); 
		 empleado_3 empleado4 = new empleado_3("Belen", LocalDate.of(2001, 7, 10)); 
		 LocalDate fechaContratoEmpleado3 = empleado3.dameFechaContrato(); 
		 LocalDate fechaContratoEmpleado4 = empleado4.dameFechaContrato(); 
		 int comparacion = fechaContratoEmpleado3.compareTo(fechaContratoEmpleado4); 
		 if (comparacion < 0) { 
		 System.out.println(empleado3.getNombre() + " fue contratada antes que " + empleado4.getNombre()); 
		 } else if (comparacion > 0) { 
		 System.out.println(empleado4.getNombre() + " fue contratada antes que " + empleado3.getNombre()); 
		 } else { 
		 System.out.println("Ambos empleados fueron contratados en la misma fecha."); 
		 } 
		 }
}
