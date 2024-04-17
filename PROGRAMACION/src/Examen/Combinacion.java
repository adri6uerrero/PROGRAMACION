package Examen;

public class Combinacion {
	final int NumColoresCombinacion=4;
	final int NumColoresJuego=6;
	String[] Combi;
	String[] TablaColores= {"R","A","V","A","M","N"};
	public void Pruebacombinacion(String[] Combi, String[] Resultado) {
		for (int i=0; i<NumColoresCombinacion; i++) {
	        Resultado[i] = "";
		}
		for (int i = 0; i < NumColoresCombinacion; i++) {
	        if (Combi[i].equals(this.Combi[i])) {
	            Resultado[i] = "X";
	        }
	    }
	 }	    
}
