package POO_VI;

public class voto {
	private int edad;
    private final int minvoto = 18;
	
    
    public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean puede_votar() {
        return edad >= minvoto;
    }
    
}
