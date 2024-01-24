package poo_IV;

import javax.swing.JOptionPane;

public class Estudiante {
	//DEFINO LAS CARACTERISTICAS
	private String nombre;
    private int edad;
    private String grado;
    
    //CONSTRUCTOR
    public Estudiante() {
    	
    }
    
    //GETTERS Y SETTERS
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
	
	
	//LO BUSQUE EN CHATGPT PORQUE NO SABIA COMO HACER QUE SE MUESTRE
	public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nEdad: " + edad + "\nGrado: " + grado);
} 
}