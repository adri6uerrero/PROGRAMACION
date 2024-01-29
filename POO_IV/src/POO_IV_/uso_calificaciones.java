package POO_IV_;

import javax.swing.JOptionPane;

public class uso_calificaciones {
	public static void main(String[] args) { 
		calificaciones curso = new calificaciones(); 
		/*pregunta al usuario el curso*/ 
		String nombreCurso = JOptionPane.showInputDialog("Ingrese el nombre del curso:"); 
		/*almacena el nombre del curso*/ 
		curso.setNombreCurso(nombreCurso); 
		/*pregunta al usuario la calificacion y calificacion lo pasa a int */ 
		double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del curso:")); 
		/*almacena la calificacion*/ 
		curso.setCalificacion(calificacion); 
		/*muestra el curso y la calificacion*/ 
		JOptionPane.showMessageDialog(null, "Curso: " + curso.getNombreCurso() + "\nCalificación: " + calificacion); 

		}
}
