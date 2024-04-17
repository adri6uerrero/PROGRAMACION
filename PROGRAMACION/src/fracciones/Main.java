package fracciones;

public class Main {
	public static void main(String[] args) {
		Fraccion f1=new Fraccion(-6,2);
		Fraccion f2=new Fraccion(3,4);
		Fraccion f3=new Fraccion(-1,3);
		
		//System.out.println(f1.simplificar());
		
		System.out.println(f1.multiplicar(f2).multiplicar(f3).simplificar());
	}
}
