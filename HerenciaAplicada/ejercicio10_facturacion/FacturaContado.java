package HerenciaAplicada.ejercicio10_facturacion;

public class FacturaContado extends Factura {
    private double descuento;

    public FacturaContado(int numero, Cliente cliente, double total, double descuento) {
        super(numero, cliente, total);
        this.descuento = descuento;
    }

    public double calcularTotal() {
        return super.calcularTotal() - descuento;
    }

    
    public void mostrarFactura() {
        super.mostrarFactura();
        System.out.println("Tipo: Contado | Descuento: Q" + descuento);
        System.out.println("TOTAL A PAGAR: Q" + calcularTotal());
    }
}
