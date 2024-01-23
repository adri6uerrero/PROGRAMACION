package poo_IV;

import javax.swing.JOptionPane;
public class Uso_estudiante {
	public static void main(String[] args) {
		Estudiante ADRIAN = new Estudiante();
		
		ADRIAN.setNombre(JOptionPane.showInputDialog("Introduce el nombre del estudiante"));
		ADRIAN.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante")));
		ADRIAN.setGrado(JOptionPane.showInputDialog("Introduce el grado del estudiante"));
		
		ADRIAN.mostrarInformacion();
	}
}
