package cl.jpino.wallet.service;

import cl.jpino.wallet.controller.interfaces.ITransaccion;
import cl.jpino.wallet.model.Usuario;

public class Cuenta implements ITransaccion {
    private int numeroCuenta;
    private double saldo;
    private Usuario usuario;

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public Cuenta() {

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public boolean retirarDinero(double montoRetiro) {
        if (saldo <= 0) {
            System.out.println("No tienes saldo suficiente para retirar dinero");
            return false;
        }else {
            double saldoActual = this.saldo - montoRetiro;
            setSaldo(saldoActual);
        }
        System.out.println("Retiro exitoso");
        return true;
    }

    @Override
    public double ingresarDinero(double montoIngreso) {
        if (montoIngreso <= 0) {
            System.out.println("No puedes ingresar un monto negativo o igual a 0");
            return 0;
        }
            else {
                double saldoActual = this.saldo + montoIngreso;
                setSaldo(saldoActual);
            }
        return 0;
    }

    @Override
    public double consultarSaldo() {
        return this.saldo;
    }
}
