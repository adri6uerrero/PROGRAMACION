package Sobrecarga;

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    /*Constructor con los datos*/
    public Estudiante(String nombre, int edad, double promedioAcademico) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedioAcademico;
    }

    // Constructor con nombre y edad/*Constructor para nombre y edad que pone el promedio en 0*/
    public Estudiante(String nombre, int edad) {
        this(nombre, edad, 0);
    }

    // Constructor sin parámetros/*Constructor vacio que pone todo en 0 o sin nombre*/
    public Estudiante() {
        this("Sin nombre", 0, 0);
    }

    /*getters y setters*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedioAcademico() {
        return promedio;
    }

    public void setPromedioAcademico(double promedioAcademico) {
        this.promedio = promedioAcademico;
    }

    
    
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Belén", 19, 8.5);
        Estudiante estudiante2 = new Estudiante();
        System.out.println("Primer estudiante:");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Promedio: " + estudiante1.getPromedioAcademico());
        System.out.println("\nSegundo estudiante:");
        System.out.println("Nombre: " + estudiante2.getNombre());
        System.out.println("Edad: " + estudiante2.getEdad());
        System.out.println("Promedio: " + estudiante2.getPromedioAcademico());
    }
}
