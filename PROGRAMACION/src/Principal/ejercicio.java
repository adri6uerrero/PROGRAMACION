package Principal;

public class ejercicio {
	public static int alea(int li, int ls) {
		return (int)(Math.random()*(ls-li+1))+li;
	}
	public static void rellenar(int m [][]) {
		for (int i = 0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]=alea(140,210);
			}
		}
	}
	public static void imprimir(int m[][],String p[]) {
		int maximo,minimo,suma;
		String h1= "                                                                      MIN   MED   MAX";
		String h2= "                                                                      ===   ===   ===";
		System.out.println(h1);
		System.out.println(h2);
		
		for (int i=0;i<m.length;i++){
			suma=0;
		    maximo=100;
		    minimo=300;
			System.out.printf("%-10s",p[i]);
			
			for (int j=0;j<m[i].length;j++) {
				System.out.printf("%5d",m [i][j]);
				if (m[i][j]>maximo)maximo=m[i][j];
				if (m[i][j]<minimo)minimo=m[i][j];
				
				suma +=m[i][j];
			}
			System.out.printf("  ----->%5d %5d %5d\n", minimo, suma / m[i].length, maximo);
		}
	}
	
	public static void main(String[] args) {
        String[] paises = {"España", "Rusia", "Japón", "Australia"};
        int[][]estaturas = new int[4][10];
        rellenar(estaturas);
        imprimir(estaturas, paises);
        }
}
