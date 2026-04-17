package HerenciaAplicada.ejercicio02;

public class Cuenta {
    protected double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
    }

    public void retirar(double monto) {
        saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }
}
