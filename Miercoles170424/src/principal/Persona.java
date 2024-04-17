package principal;

import java.util.Objects;

public class Persona {
	private String Nombre;
	private String Apellidos;
	private int Edad;
	
	public Persona(String nombre, String apellidos, int edad) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		Edad = edad;
		
		
	}
 
	@Override
	public int hashCode() {
		return Objects.hash(Apellidos, Edad, Nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(Apellidos, other.Apellidos) && Edad == other.Edad && Objects.equals(Nombre, other.Nombre);
	}

	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad + "]";
	}
}
