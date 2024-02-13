package herencia;

import javax.swing.JOptionPane;

public class uso_estudiante {
	
	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Introduce nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
		String carrera = JOptionPane.showInputDialog("Introduce tu carrera");
		
		estudiante est = new estudiante(nombre, edad, carrera);
		
		JOptionPane.showInternalMessageDialog(null, est.nombre + "\n" + est.edad + "\n" + est.carrera);
	}

}