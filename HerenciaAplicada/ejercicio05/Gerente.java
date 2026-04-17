package HerenciaAplicada.ejercicio05;

public class Gerente extends Empleado {
    private double bonoAdicional;

    public Gerente(String nombre, double salario, double bonoAdicional) {
        super(nombre, salario);
        this.bonoAdicional = bonoAdicional;
    }

    
    public double calcularSalario() {
        
        return super.calcularSalario() + bonoAdicional;
    }

    
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Bono adicional: Q" + bonoAdicional);
        System.out.println("Salario Total (con bono): Q" + calcularSalario());
    }
}
