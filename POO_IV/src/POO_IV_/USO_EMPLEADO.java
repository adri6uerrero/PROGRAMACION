package POO_IV_;

import javax.swing.JOptionPane;

public class USO_EMPLEADO {
	public static void main(String[] args) {
		EMPLEADO[] empleados = new EMPLEADO[5];
		empleados[0] = new EMPLEADO("adrian", 1, 1);
		empleados[0] = new EMPLEADO("sebastian", 2, 2);
		empleados[0] = new EMPLEADO("maria", 3, 3);
		empleados[0] = new EMPLEADO("belen", 4, 4);
		empleados[0] = new EMPLEADO("hugo", 5, 5);

		/* inicializa i en 0, se ejecuta mientras sea < 5, */
		for (int i = 0; i < 5; i++) {
			String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado " + (i + 1) + ":");
			double horasTrabajadas = Double
					.parseDouble(JOptionPane.showInputDialog("Ingrese las horas trabajadas por " + nombre + ":"));
			double tarifaPorHora = Double
					.parseDouble(JOptionPane.showInputDialog("Ingrese la tarifa por hora de " + nombre + ":"));
			/* para que el bucle de arriba i sea empleados y haga el bucle */

			EMPLEADO empleado = new EMPLEADO(nombre, horasTrabajadas, tarifaPorHora);
			empleados[i] = empleado;
		}
		/*
		 * empleado tomara cada elemento dentro de empleados y calcula el salario con el
		 * metodo de la clase empleado
		 */
		for (EMPLEADO empleado : empleados) {
			double salario = empleado.calcularSalario();
			JOptionPane.showMessageDialog(null, "Empleado: " + empleado.getNombre() + "\nSalario: " + salario);
		}
	}
}
