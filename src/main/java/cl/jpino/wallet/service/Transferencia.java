package cl.jpino.wallet.service;

import cl.jpino.wallet.controller.interfaces.ITransaccion;

public class Transferencia implements ITransaccion {

    @Override
    public boolean retirarDinero(double montoRetiro) {
        return false;
    }

    @Override
    public double ingresarDinero(double montoIngreso) {
        return 0;
    }

    @Override
    public double consultarSaldo() {
        return 0;
    }
}
