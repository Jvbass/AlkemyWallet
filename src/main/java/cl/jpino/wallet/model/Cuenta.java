package cl.jpino.wallet.model;

public class Cuenta {
    private int numeroCuenta;
    private double saldo;
    private Usuario usuario;

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }


}
