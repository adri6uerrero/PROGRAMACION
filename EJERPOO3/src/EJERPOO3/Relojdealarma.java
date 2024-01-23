package EJERPOO3;

import java.util.Calendar;

public class Relojdealarma {
	private int horaAlarma;
    private int horaActual;
    private boolean alarmaActivada;

    public Relojdealarma() {
        /*Inicializar la hora de la alarma y la hora actual*/
        this.horaAlarma = 0;
        this.horaActual = 0;
        this.alarmaActivada = false;
    }
    /*Métodos para establecer la hora de la alarma*/
    public void setHoraAlarma(int horaAlarma) {
        this.horaAlarma = horaAlarma;
    }
    /* Método para activar la alarma*/
    public void activarAlarma() {
        this.alarmaActivada = true;
    }
    /*Método para desactivar la alarma*/
    public void desactivarAlarma() {
        this.alarmaActivada = false;
    }
    /*Método para actualizar la hora actual*/
    public void actualizarHoraActual() {
        /*Simulación de obtener la hora actual (puedes utilizar otras formas más precisas)*/
        this.horaActual = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }
    /* Método para comprobar si la hora actual coincide con la hora de la alarma*/
    public void comprobarAlarma() {
        if (alarmaActivada && horaActual == horaAlarma) {
            System.out.println("¡Alarma sonando!");
        }
    }
    /* Método para obtener la hora actual*/
    public int getHoraActual() {
        return horaActual;
    }
    /* Método para obtener el estado de la alarma*/
    public boolean isAlarmaActivada() {
        return alarmaActivada;
    }
    public static void main(String[] args) {
        /* Ejemplo de uso*/
        Relojdealarma miRelojAlarma = new Relojdealarma();
        /*Establecer la hora de la alarma*/
        miRelojAlarma.setHoraAlarma(8);
        /*Activar la alarma*/
        miRelojAlarma.activarAlarma();
        /*Simular la actualización de la hora actual*/
        miRelojAlarma.actualizarHoraActual();
        /*Comprobar si la alarma debe sonar*/
        miRelojAlarma.comprobarAlarma();
    }
}
