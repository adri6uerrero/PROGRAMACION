package Sobrecarga;

public class Empleado {
    private String nombre;
    private double salario;
    private String departamento;
    
    /*constructor general*/
    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }
    /*constructor para nombre y salario*/
    public Empleado(String nombre, double salario) {
        this(nombre, salario, "Sin departamento");
    }
    /*constructor sin ningunos valores*/
    public Empleado() {
        this("Sin nombre", 0.0, "Sin departamento");
    }
    /*getters y setters*/
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    /*metodo para imprimir nombre,salario y depto*/
    public void imprimirInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Departamento: " + departamento);
    }

    
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Belén", 2500.0, "Administracion");
        /*lo pongo vacio el empleado 2 para ver si se pone sin datos*/
        Empleado empleado2 = new Empleado();
        System.out.println("Empleada 1:");
        empleado1.imprimirInfo();
        System.out.println("\nEmpleado 2:");
        empleado2.imprimirInfo();
    }
}
