package POO_II_2;

public class uso_cuenta {
	public static void main(String[] args) { 
		cuentabancaria cliente = new cuentabancaria("Adrian",10.000); 
		System.out.println("Titular: "+cliente.getTitular()); 
		System.out.println("Saldo: "+cliente.getSaldo()); 
		} 
}
