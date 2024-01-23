package poo_IV;

import javax.swing.JOptionPane;

public class Estudiante {
	private String nombre;
    private int edad;
    private String grado;
    
    public Estudiante() {
    	
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}
	public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nEdad: " + edad + "\nGrado: " + grado);
} 
}