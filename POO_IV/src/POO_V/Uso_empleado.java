package POO_V;

import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
public class Uso_empleado{
		public static void main(String[] args) {
	/*1. Empieza instanciando de empleados nuevos.
	 * Recuerda meterle exactamente el número de argumentos
	 * exacto, ni más ni menos*/
			Empleado [] misEmpleados = new Empleado[3];
			misEmpleados[0]= new Empleado
					("Jorge N.", 19500, 2000, 12, 30);
			misEmpleados[1]= new Empleado
					("Paco J.", 79500, 1980, 12, 28);
			misEmpleados[2]= new Empleado
					("Ana B.", 69500, 1995, 11, 18);
	/*2. Súbeles el sueldo, con subeSueldo, ¡son currantes!*/		
		/*for(int i=0; i<3; i++) {
			misEmpleados[i].subeSueldo(5);
		}
		for(int i=0; i<3; i++) {
			System.out.println("Nombre: " + misEmpleados[i].
					dameNombre() + " Sueldo: " + 
					misEmpleados[i].dameSueldo() + " Fecha de Alta: " + 
					misEmpleados[i].dameFechaContrato());
		}*/
	/*3. Comenta el código, los for anteriores y hazme for each*/
	/*4. : Es el operador que se utiliza en los bucles for each
	 * Separa la variable que representa el elemento actual 
	 * (Empleado e) de la colección que se está recorriendo 
	 * (misEmpleados)*/	
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		for(Empleado e: misEmpleados)
			System.out.println("Nombre: " + 
					e.dameNombre() + " Sueldo: " + 
					e.dameSueldo() + " Fecha de Alta: " + 
					e.dameFechaContrato());
		}
	}
		
class Empleado{

		public Empleado(String nom, double sue, 
				int agno, int mes, int dia){

			nombre=nom;
			sueldo=sue;

			GregorianCalendar calendario =  
					new GregorianCalendar(agno, mes-1, dia);

			alta_contrato=calendario.getTime();
		}

		public String dameNombre(){
			return nombre;
		}
		
		public double dameSueldo() {
			return sueldo;
		}
		public Date dameFechaContrato() {
			return alta_contrato;
		}

		public void subeSueldo(double porcentaje) {
			double aumento= sueldo*porcentaje/100;
			sueldo += aumento;
		}
		
		private String nombre;
		private double sueldo;
		private Date alta_contrato;
		
	}