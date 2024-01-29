package POO_III;

public class reloj_alarma {
	private int horaAlarma; 
	private int horaActaulizada; 
	private int minAlarma; 
	private int minActualizado; 
	private boolean modoReloj; 

	public reloj_alarma(int horaAlarma, int horaActualizada, int minAlarma, int minActualizado, boolean modoReloj) {
		this.horaAlarma = horaAlarma;
		this.horaActaulizada = horaActualizada;
		this.minAlarma = minAlarma;
		this.minActualizado = minActualizado;
		this.modoReloj = modoReloj;
	}
	
	
	public void sethoraAl(int horaAl) { 
	this.horaAlarma = horaAl; 
	} 
	public int gethoraAl() { 
	return horaAlarma; 
	} 
	public void sethoraAc(int horaAc) { 
	this.horaActaulizada = horaAc; 
	} 
	public int gethoraAc() { 
	return horaActaulizada; 
	} 
	public void setminAl(int minAl) { 
	this.minAlarma = minAl; 
	} 
	public int getminAl() { 
	return minAlarma; 
	} 
	public void setminAc(int minAc) { 
	this.minActualizado = minAc; 
	} 
	public int getminAc() { 
	return minActualizado; 
	} 
	public void setmodoReloj(boolean modoReloj) { 
	this.modoReloj = modoReloj; 
	} 
	public boolean getmodoReloj() { 
	return modoReloj; 
	}
}
