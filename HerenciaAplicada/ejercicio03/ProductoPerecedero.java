package HerenciaAplicada.ejercicio03;

public class ProductoPerecedero extends Producto {
    private int diasParaVencer;

    public ProductoPerecedero(String nombre, double precio, int diasParaVencer) {
        super(nombre, precio);
        this.diasParaVencer = diasParaVencer;
    }

    
    public boolean estaVencido() {
        return diasParaVencer <= 0;
    }

    
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Estado: " + (estaVencido() ? "VENCIDO" : "Vigente (" + diasParaVencer + " días restantes)"));
    }
}

