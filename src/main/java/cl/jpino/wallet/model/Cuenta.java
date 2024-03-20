package cl.jpino.wallet.model;

import cl.jpino.wallet.controller.interfaces.ITransaccion;

public class Cuenta implements ITransaccion {
    private int numeroCuenta;
    private double saldo;
    private Usuario usuario;

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public boolean retirarDinero() {
        return false;
    }

    @Override
    public double ingresarDinero() {
        return 0;
    }

    @Override
    public double consultarSaldo() {
        return 0;
    }
}
