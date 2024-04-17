package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		String linea,campos[];
		String fichero="c:\\FICHEROS\\jugadores.csv";
		HashMap<String,ArrayList<jugador>> datos= new HashMap<String,ArrayList<jugador>>();
		
		try(BufferedReader br =new BufferedReader(new FileReader(fichero));){
			/*leo registro con esto*/
			linea=br.readLine();
			while(linea!=null) {
				campos=linea.split(",");
				
				/*pregunto si esta el club por el que he preguntado*/
				if(!datos.containsKey(campos[7])) {
					/*si no está mete al club nuevo*/
					datos.put(campos[7], new ArrayList<jugador>());
				}
				
				/*lee que el equipo esta dentro del arraylist*/
				datos.get(campos[7]).add(new jugador(campos[0], Integer.valueOf(campos[1]), campos[6],campos[7],campos[11]));
				
				linea=br.readLine();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		for(String club:datos.keySet()) {
			System.out.println(club);
			
			for(jugador item: datos.get(club))
				System.out.println("\t"+item);
			
		}
	}
}
