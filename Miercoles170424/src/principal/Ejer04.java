package principal;

import java.util.ArrayList;
import java.util.HashMap;

public class Ejer04 {
	public static void main(String[] args) {
		HashMap<Persona,ArrayList<Persona>> familias = new HashMap<Persona,ArrayList<Persona>>();
		
		familias.put(new Persona("juan","perez",50),new ArrayList<Persona>());
		
		familias.get(new Persona("juan","perez",50)).add(new Persona("maria","perez",25));
		familias.get(new Persona("juan","perez",50)).add(new Persona("ana","perez",20));
		
		
		familias.put(new Persona("juan","perez",50),new ArrayList<Persona>());
		
		familias.get(new Persona("juan","perez",50)).add(new Persona("maria","perez",25));
		familias.get(new Persona("juan","perez",50)).add(new Persona("ana","perez",20));
		
		for(Persona p :familias.keySet()) {
			System.out.println(p);
			for(Persona hijos:familias.get(p)) {
				System.out.println("\t"+hijos);
			}
		}
	}
}
