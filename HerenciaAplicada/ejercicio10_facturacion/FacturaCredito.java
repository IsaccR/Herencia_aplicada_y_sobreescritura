package HerenciaAplicada.ejercicio10_facturacion;

public class FacturaCredito extends Factura {
    private double recargo;
    private int cuotas;

    public FacturaCredito(int numero, Cliente cliente, double total, double recargo, int cuotas) {
        super(numero, cliente, total);
        this.recargo = recargo;
        this.cuotas = cuotas;
    }

    public double calcularTotal() {
        return super.calcularTotal() + recargo;
    }
 
    public void mostrarFactura() {
        super.mostrarFactura();
        System.out.println("Tipo: Crédito | Recargo: Q" + recargo + " | Cuotas: " + cuotas);
        System.out.println("Pago por cuota: Q" + (calcularTotal() / cuotas));
        System.out.println("TOTAL A PAGAR: Q" + calcularTotal());
    }
}