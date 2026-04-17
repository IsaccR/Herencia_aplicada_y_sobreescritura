package HerenciaAplicada.ejercicio02;

public class CuentaCorriente extends Cuenta {
    private double limiteSobregiro;

    public CuentaCorriente(double saldo, double limiteSobregiro) {
        super(saldo);
        this.limiteSobregiro = limiteSobregiro;
    }

    
    public void retirar(double monto) {
        
        if (saldo - monto >= -limiteSobregiro) {
            super.retirar(monto);
            System.out.println("Retiro exitoso. Saldo actual: $" + saldo);
        } else {
            System.out.println("Error: Saldo insuficiente. Supera el límite de sobregiro ($" + limiteSobregiro + ")");
        }
    }
}
