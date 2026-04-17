package HerenciaAplicada.ejercicio05;

public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " | Salario Base: Q" + salario);
    }
}