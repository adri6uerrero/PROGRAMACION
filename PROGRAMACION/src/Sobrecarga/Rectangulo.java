package Sobrecarga;

public class Rectangulo {
    private double ancho;
    private double altura;

    /*Constructor con ancho y alto*/
    public Rectangulo(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }

    /*Constructor del ancho que pone la altura como 0 para iniciar*/
    public Rectangulo(double ancho) {
        this(ancho, 0);
    }

    /*Constructor vacio que pone la altura y el ancho en 0 para empezar*/
    public Rectangulo() {
        this(0, 0); 
    }

    /*getters y setters*/
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /*metodo que calcula el area*/
    public double calcularArea() {
        return ancho * altura;
    }


    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(5, 10);
        /*si solo lo pongo asi () o con un solo dato me devuelve el area en 0*/
        Rectangulo rectangulo2 = new Rectangulo(7);
        System.out.println("Área del primer rectangulo: " + rectangulo1.calcularArea());
        System.out.println("Área del segundo rectangulo: " + rectangulo2.calcularArea());
    }
}
