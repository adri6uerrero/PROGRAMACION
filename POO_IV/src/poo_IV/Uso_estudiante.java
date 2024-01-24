package poo_IV;

import javax.swing.JOptionPane;
public class Uso_estudiante {
	public static void main(String[] args) {
		//INSTANCIO
		Estudiante ADRIAN = new Estudiante();
		Estudiante HUGO = new Estudiante();
		Estudiante ALEX = new Estudiante();
		
		//ESTUDIANTE 1
		ADRIAN.setNombre(JOptionPane.showInputDialog("Introduce el nombre del estudiante"));
		//HE PASADO EL INT A STRING CON EL PARSEINT
		ADRIAN.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante")));
		ADRIAN.setGrado(JOptionPane.showInputDialog("Introduce el grado del estudiante"));
		
		//ESTUDIANTE 2
		HUGO.setNombre(JOptionPane.showInputDialog("Introduce el nombre del estudiante"));
		HUGO.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante")));
		HUGO.setGrado(JOptionPane.showInputDialog("Introduce el grado del estudiante"));
		
		//ESTUDIANTE 3
		ALEX.setNombre(JOptionPane.showInputDialog("Introduce el nombre del estudiante"));
		ALEX.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante")));
		ALEX.setGrado(JOptionPane.showInputDialog("Introduce el grado del estudiante"));
		
		//ESTO ES PARA QUE SE VEA EN EL PANEL
		ADRIAN.mostrarInformacion();
		HUGO.mostrarInformacion();
		ALEX.mostrarInformacion();
	}
}
