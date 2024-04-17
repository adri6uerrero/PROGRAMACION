package principal;

import java.util.ArrayList;
import java.util.HashMap;

public class Ejer02 {
	public static void imprimir(HashMap<String,ArrayList<String>> K){
			for (String key: K.keySet()) {
				System.out.println(key);
				for(String valor: K.get(key)) {
					System.out.println("\t"+valor);
				}
			}
		}
	
	
	public static void main(String[] args) {
		
		HashMap<String,ArrayList<String>> familias=new HashMap();
		
		familias.put("Perez", new ArrayList<String>());
		familias.get("Perez").add("Juan Andres");
		familias.get("Perez").add("Ana Maria");
		
		
		familias.put("Rey",new ArrayList<String>());
		familias.get("Rey").add("Juan Maria");
		familias.get("Rey").add("Ana Maria");
		
		imprimir(familias);
	}
}
