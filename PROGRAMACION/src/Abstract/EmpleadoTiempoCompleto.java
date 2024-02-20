package Abstract;

class EmpleadoTiempoCompleto extends Empleado {

	private double salarioMensual;

	public EmpleadoTiempoCompleto(double salarioMensual) {

		this.salarioMensual = salarioMensual;

	}

	public double calcularSalario() {

		return salarioMensual;

	}

}
