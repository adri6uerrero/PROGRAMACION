package POO_III;

public class cocina {
	private int ingradientes; 
	private int pasos; 

	
	 public cocina() { 
	 ingradientes=5; 
	 pasos=5; 
	} 
	 public void setin(int in) { 
	 this.ingradientes=in; 
	 } 
	 public int getin() { 
	 return ingradientes; 
	 } 
	 public void setpa(int pa) { 
	 this.pasos=pa; 
	 } 
	 public int getpa() { 
	 return pasos; 
	 } 
}
