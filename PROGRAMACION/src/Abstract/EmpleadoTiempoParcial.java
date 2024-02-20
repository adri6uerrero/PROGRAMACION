package Abstract;

class EmpleadoTiempoParcial extends Empleado {

	private double horasTrabajadas;

	private double salarioPorHora;

	public EmpleadoTiempoParcial(double horasTrabajadas, double salarioPorHora) {

		this.horasTrabajadas = horasTrabajadas;

		this.salarioPorHora = salarioPorHora;

	}

	public double calcularSalario() {

		return horasTrabajadas * salarioPorHora;

	}

}
