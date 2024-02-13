package herencia;

public class automovil extends vehiculo {
	
	int tipoDeCombustible;

	public automovil(String marca, String modelo, int año, int tipoDeCombustible) {
		super(marca, modelo, año);
		this.tipoDeCombustible = tipoDeCombustible;
	}

	public int getTipoDeCombustible() {
		return tipoDeCombustible;
	}

	public void setTipoDeCombustible(int tipoDeCombustible) {
		this.tipoDeCombustible = tipoDeCombustible;
	}
	
}
