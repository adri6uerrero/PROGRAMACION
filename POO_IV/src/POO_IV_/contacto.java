package POO_IV_;

public class contacto {
	private String nombre; 
	private int telefono; 
	private String email; 

	/*Constructor*/ 
	public contacto(String nombre, int telefono, String email) { 
	this.nombre = nombre; 
	this.telefono = telefono; 
	this.email = email; 
	} 

	/*getters y setters*/ 
	public String getNombre() { 
	return nombre; 
	} 
	public void setNombre(String nombre) { 
	this.nombre = nombre; 
	} 
	public int getTelefono() { 
	return telefono; 
	} 
	public void setTelefono(int telefono) { 
	this.telefono = telefono; 
	} 
	public String getEmail() { 
	return email; 
	} 
	public void setEmail(String email) { 
	this.email = email; 
	} 
}
