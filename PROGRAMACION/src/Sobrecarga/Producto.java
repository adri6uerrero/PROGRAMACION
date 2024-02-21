package Sobrecarga;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadStock;

    /*constructor en general*/
    public Producto(String nombre, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    /*Constructor para nombre y precio que deja el stock en 0*/
    public Producto(String nombre, double precio) {
        this(nombre, precio, 0);
    }

    /*Constructor vacio sin valores que deja en 0 y sin nombre el producto*/
    public Producto() {
        this("Sin nombre", 0.0, 0);
    }

    /*getters y setters*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }


    
    
    public static void main(String[] args) {
        Producto producto1 = new Producto("PRIME", 3.5, 4000);
        Producto producto2 = new Producto();
        System.out.println("Primer producto:");
        System.out.println("Nombre: " + producto1.getNombre());
        System.out.println("Precio: " + producto1.getPrecio());
        System.out.println("Stock: " + producto1.getCantidadStock());
        /*En este ejemplo pongo todo vacio para ver si me lo pone en 0 y sin nombre automaticamente*/
        System.out.println("\nSegundo producto:");
        System.out.println("Nombre: " + producto2.getNombre());
        System.out.println("Precio: " + producto2.getPrecio());
        System.out.println("Stock: " + producto2.getCantidadStock());
    }
}
