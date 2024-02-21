package Sobrecarga;

public class Coche {
    private String marca;
    private String modelo;
    private int año;
    private String color;

    // Constructor con todos los parámetros
    public Coche(String marca, String modelo, int año, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
    }

    // Constructor con marca, modelo y año/*Constructor para marca, modelo y año que deja el color sin color*/
    public Coche(String marca, String modelo, int año) {
        this(marca, modelo, año, "Sin color");
    }

    /*Constructor con marca y modelo/*Constructor para marca y modelo que deja el año y el color sin datos*/
    public Coche(String marca, String modelo) {
        this(marca, modelo, 0, "Sin color");
    }

    /*constructo vacio que pone la marca, modelo, año y color sin datos*/
    public Coche() {
        this("Sin marca", "Sin modelo", 0, "Sin color");
    }

    /*getters y setters*/
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
    public static void main(String[] args) {
        Coche coche1 = new Coche("Porsche", "911 GT3 rs", 2005, "Azul");
        Coche coche2 = new Coche();
        System.out.println("Primer coche:");
        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());
        System.out.println("Año: " + coche1.getAño());
        System.out.println("Color: " + coche1.getColor());
        System.out.println("\nSegundo coche:");
        System.out.println("Marca: " + coche2.getMarca());
        System.out.println("Modelo: " + coche2.getModelo());
        System.out.println("Año: " + coche2.getAño());
        System.out.println("Color: " + coche2.getColor());
    }
}
