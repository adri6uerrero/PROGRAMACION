package POO_VI;

public class conversor {
	private double celsius;
    private final double faccon= 1.8;
    private final double ajuste = 32;
    
    public conversor() {
    	
    }

    public double getTemperaturaCelsius() {
        return celsius;
    }
    public void setTemperaturaCelsius(double celsius) {
        this.celsius = celsius;
    }
    public double convertirAFahrenheit() {
        return (celsius * faccon) + ajuste;
    }
}
