package POO_III;

public class habitacion {
	private int num_hab; 
	private String tipo; 
	private int ocupada; 
	private int libre;
	
	
	public habitacion() { 
	ocupada=1; 
	libre=0; 
	} 
	public void setnhab(int nhab) { 
	this.num_hab=nhab; 
	} 
	public int getnhab() { 
	return num_hab; 
	} 
	public void settipo(String tipo) { 
	this.tipo=tipo; 
	} 
	public String getttipo() { 
	return tipo; 
	} 
	public void setoc(int oc) { 
	this.ocupada=oc; 
	} 
	public int getoc() { 
	return ocupada; 
	} 
	public void setli(int li) { 
	this.libre=li; 
	} 
	public int getli() { 
	return libre; 
	}
}
