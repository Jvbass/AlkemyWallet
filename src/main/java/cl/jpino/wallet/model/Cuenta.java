package cl.jpino.wallet.model;

import cl.jpino.wallet.controller.interfaces.ITransaccion;
import cl.jpino.wallet.model.Usuario;

public class Cuenta implements ITransaccion {
    private int numeroCuenta;
    private double saldo;
    private Usuario usuario;

    public Cuenta(int numeroCuenta, double saldo, Usuario usuario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.usuario = usuario;
    }

    public Cuenta() {

    }

    @Override
    public boolean retirarDinero(double montoRetiro) {
        if (saldo <= 0) {
            System.out.println("No tienes saldo suficiente para retirar dinero");
            return false;
        }else {
            this.saldo = this.saldo - montoRetiro;
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
                this.saldo = this.saldo + montoIngreso;
            }
        System.out.println("Ingreso exitoso");
        return this.saldo;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }
}
