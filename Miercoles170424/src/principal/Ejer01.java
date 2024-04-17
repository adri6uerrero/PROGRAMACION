package principal;

import java.util.HashMap;

public class Ejer01 {
	public static void main(String[] args) {
		HashMap<String,Double> productos = new HashMap();
		 
		productos.put("peras",1.23);
		productos.put("manzanas",2.46);
		
		System.out.println(productos.get("peras"));
		
		for(String clave:productos.keySet()) {
			System.out.println("key="+clave+"valor="+productos.get(clave));
		}
	}
}
