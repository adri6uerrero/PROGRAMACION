package POO_VI;

import javax.swing.JOptionPane;

public class uso_voto {
	 public static void main(String[] args) {
	        voto persona = new voto();
	        String input = JOptionPane.showInputDialog("Introduce tu edad:");
	        int edad = Integer.parseInt(input);
	        persona.setEdad(edad);
	        boolean esElegible = persona.puede_votar();
	        if (esElegible) {
	            JOptionPane.showMessageDialog(null, "Puedes votar.");
	        } else {
	            JOptionPane.showMessageDialog(null, "No puedes votar.");
	        }
	    }
}
