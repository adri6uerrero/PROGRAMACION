package Principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Ejer01 {
	public static Scanner sc = new Scanner(System.in);
	public static int nlineas=0;
	
	public static void contar(String l, String p) {
		nlineas++;
		String linea=l;
		int c=0,n=l.indexOf(p);
		
		
		while (n>-1) {
			c++;
			l=l.substring(n+p.length());
			n=l.indexOf(p);
		}
		if(c>0)System.out.println(l+" "+String.valueOf(nlineas)+" "+linea+" "+String.valueOf(c));
	}
	
	
	public static void main(String[] args) {
		String linea;
		String ruta="c:\\FICHEROS\\";
		
		System.out.print("Nombre del fichero ");
		String fichero= sc.nextLine();
		
		System.out.println("Palabra a buscar ");
		String palabra=sc.nextLine();
		
		try(BufferedReader br=new BufferedReader(new FileReader(ruta+fichero));){
			linea=br.readLine();
			while(linea!=null) {
				
				contar(linea,palabra);
				
				linea=br.readLine();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
}
 