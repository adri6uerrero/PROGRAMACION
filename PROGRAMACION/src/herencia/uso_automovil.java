package herencia;

import javax.swing.JOptionPane;

public class uso_automovil {
	public class Uso_Automovil {

		public static void main(String[] args) {
			
			String marca = JOptionPane.showInputDialog("Introduce la marda del automovil");
			String modelo = JOptionPane.showInputDialog("Introduce el modelo del automovil");
			int año = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año del vehiculo"));
			int tipoDeCombustible = Integer.parseInt(JOptionPane.showInputDialog("Tipo de combustible"));
			
			automovil auto = new automovil(marca, modelo, año, tipoDeCombustible);
			
			JOptionPane.showMessageDialog(null, auto.marca + "\n" + auto.modelo + "\n" + auto.año + "\n" + auto.tipoDeCombustible);
			
		}
	}
}
