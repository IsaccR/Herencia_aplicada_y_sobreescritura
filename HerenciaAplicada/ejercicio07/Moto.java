package HerenciaAplicada.ejercicio07;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, int velocidad, int cilindrada) {
        super(marca, velocidad);
        this.cilindrada = cilindrada;
    }

   
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Motocicleta | Cilindrada: " + cilindrada + " cc");
    }
}