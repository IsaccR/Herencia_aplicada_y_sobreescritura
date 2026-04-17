package HerenciaAplicada.ejercicio08;

public class Figura {
    protected String tipo;

    public Figura(String tipo) {
        this.tipo = tipo;
    }

    public double calcularArea() {
        return 0; 
    }

    public void mostrarInfo() {
        System.out.println("Figura: " + tipo + " | Área calculada: " + calcularArea());
    }
}
