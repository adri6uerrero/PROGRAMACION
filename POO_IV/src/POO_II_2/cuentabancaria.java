package POO_II_2;

public class cuentabancaria {
	private String titular;
	private Double saldo;

	/* a */
	public cuentabancaria(String titular, Double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {

		this.saldo = saldo;
	}
}
