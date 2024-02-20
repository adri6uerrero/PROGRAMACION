package Abstract;

public class Uso_empleado {
	public class Main {
		public static void main(String[] args) {
			EmpleadoTiempoCompleto empleadoTiempoCompleto = new EmpleadoTiempoCompleto(2000);
			EmpleadoTiempoParcial empleadoTiempoParcial = new EmpleadoTiempoParcial(20, 15);
			System.out.println("Salario de empleado a tiempo completo: $" + empleadoTiempoCompleto.calcularSalario());
			System.out.println("Salario de empleado a tiempo parcial: $" + empleadoTiempoParcial.calcularSalario());
		}

	}
}
