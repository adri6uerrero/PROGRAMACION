package POO_VI;

import javax.swing.JOptionPane;

public class uso_conversor {
	public static void main(String[] args) {
        conversor conversores = new conversor();
        String input = JOptionPane.showInputDialog("Pon la temperatura en Celsius:");
        double temperaturaCelsius = Double.parseDouble(input);
        conversores.setTemperaturaCelsius(temperaturaCelsius);
        double temperaturaFahrenheit = conversores.convertirAFahrenheit();
        JOptionPane.showMessageDialog(null, "La temperatura en Fahrenheit es: " + temperaturaFahrenheit);
    }
}
