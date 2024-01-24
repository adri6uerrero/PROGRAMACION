package POO_IV_;

public class EMPLEADO {
	private String nombre;
	private double horas_trabajadas;
	private double tarifa_horas;
	
	
	public EMPLEADO(String nombre, double horas_trabjadas, double tarifa_horas) {
		this.nombre = nombre;
		this.horas_trabajadas = horas_trabajadas;
		this.tarifa_horas = tarifa_horas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getHoras_trabajadas() {
		return horas_trabajadas;
	}
	public void setHoras_trabajadas(double horas_trabajadas) {
		this.horas_trabajadas = horas_trabajadas;
	}
	public double getTarifa_horas() {
		return tarifa_horas;
	}
	public void setTarifa_horas(double tarifa_horas) {
		this.tarifa_horas = tarifa_horas;
	}
	
	
	
}
