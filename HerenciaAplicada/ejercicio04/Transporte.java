package HerenciaAplicada.ejercicio04;

public class Transporte {
    protected int capacidad;

    public Transporte(int capacidad) {
        this.capacidad = capacidad;
    }

    public void descripcion() {
        System.out.println("Vehículo de transporte con capacidad para " + capacidad + " personas.");
    }
}
