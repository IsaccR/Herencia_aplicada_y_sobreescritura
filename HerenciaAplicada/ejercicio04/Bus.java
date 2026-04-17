package HerenciaAplicada.ejercicio04;

public class Bus extends Transporte {
    private String ruta;

    public Bus(int capacidad, String ruta) {
        super(capacidad);
        this.ruta = ruta;
    }
 
    public void descripcion() {
        
        super.descripcion();
        System.out.println("Tipo: Bus de pasajeros | Ruta asignada: " + ruta);
    }
}
