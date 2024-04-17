package principal;
 
public class jugador {
	private String Nombre;
	private int Edad;
	private String Posicion;
	private String Club;
	private String Nacionalidad;
	
	public jugador(String nombre, int edad, String posicion, String club, String nacionalidad) {
		super();
		Nombre = nombre;
		Edad = edad;
		Posicion = posicion;
		Club = club;
		Nacionalidad = nacionalidad;
	}
	
	public String getNombre() {
		return Nombre;
	}
 
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
 
	public int getEdad() {
		return Edad;
	}
 
	public void setEdad(int edad) {
		Edad = edad;
	}
 
	public String getPosicion() {
		return Posicion;
	}
 
	public void setPosicion(String posicion) {
		Posicion = posicion;
	}
 
	public String getClub() {
		return Club;
	}
 
	public void setClub(String club) {
		Club = club;
	}
 
	public String getNacionalidad() {
		return Nacionalidad;
	}
 
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
 
	@Override
	public String toString() {
		return "Jugador [Nombre=" + Nombre + ", Edad=" + Edad + ", Posicion=" + Posicion + ", Club=" + Club
				+ ", Nacionalidad=" + Nacionalidad + "]";
	}
 
	/*0 full_name
	1 age	
	6 position
	7 club
	11 nationality
	*/
}
