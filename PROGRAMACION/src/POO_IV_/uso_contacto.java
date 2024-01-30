package POO_IV_;

import javax.swing.JOptionPane;

public class uso_contacto {
	public static void main(String[] args) {
		/*null para que no tenga nada en memoria*/
		String nombre = null;
		String email = null;
		int tel = 0;
		/*creo el metodo inicio para poder guardar la info*/
		inicio(nombre, email, tel);
	}
	
	public static void inicio(String nombre, String email, int tel) {
		/*pregunta al usuario lo que quiere hacer*/
		int hacer = Integer.parseInt(JOptionPane.showInputDialog("PULSE 1 (añadir contactos)\nPULSE 2 (mostrar contacto)\nPULSE 3 (buscar contacto)"));
		/*switch para saber que hacer*/
		switch (hacer) {
		/*case 1 para añadir el contacto con la clase añadir*/
		case 1:
			añadir();
			return;
		/*case 2 para mostrar el contacto con la clase mostrar*/
		case 2:
			mostrar(nombre, email, tel);
		/*busca el contacto pero me da error al pulsar 3*/
		case 3:
			buscar(nombre,email,tel);
		default:
			JOptionPane.showMessageDialog(null, "Unexpected value: " + hacer);
		}
	}
	/*clase para añadir los contactos*/
	public static void añadir() {
		String nombre = JOptionPane.showInputDialog("nombre del contacto");
		String email = JOptionPane.showInputDialog("email del contacto");
		int tel = Integer.parseInt(JOptionPane.showInputDialog("Nº telefonico del contacto"));
		/*para que se muestre*/
		mostrar(nombre, email, tel);
	}

	/*clase para mostrar los contactos*/
	public static void mostrar(String nombre, String email, int tel) {
		contacto agenda = new contacto(nombre, tel, email);
		agenda.setNombre(null);
		JOptionPane.showMessageDialog(null, nombre + "\n" + email + "\n" + tel);
		inicio(nombre, email, tel);
	}

	/*revisar, da error*/
	public static void buscar(String nombre, String email, int tel) {
		
	}
}
