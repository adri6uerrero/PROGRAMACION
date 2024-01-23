package poo_IV;

import javax.swing.JOptionPane;
public class Uso_estudiante {
	public static void main(String[] args) {
		Estudiante ADRIAN = new Estudiante();
		Estudiante HUGO = new Estudiante();
		Estudiante ALEX = new Estudiante();
		
		ADRIAN.setNombre(JOptionPane.showInputDialog("Introduce el nombre del estudiante"));
		ADRIAN.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante")));
		ADRIAN.setGrado(JOptionPane.showInputDialog("Introduce el grado del estudiante"));
		
		HUGO.setNombre(JOptionPane.showInputDialog("Introduce el nombre del estudiante"));
		HUGO.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante")));
		HUGO.setGrado(JOptionPane.showInputDialog("Introduce el grado del estudiante"));
		
		ALEX.setNombre(JOptionPane.showInputDialog("Introduce el nombre del estudiante"));
		ALEX.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante")));
		ALEX.setGrado(JOptionPane.showInputDialog("Introduce el grado del estudiante"));
		
		ADRIAN.mostrarInformacion();
		HUGO.mostrarInformacion();
		ALEX.mostrarInformacion();
	}
}
