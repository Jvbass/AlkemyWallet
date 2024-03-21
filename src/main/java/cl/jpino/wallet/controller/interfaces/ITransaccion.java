package cl.jpino.wallet.controller.interfaces;

public interface ITransaccion {
    public boolean retirarDinero(double montoRetiro);
    public double ingresarDinero(double montoIngreso);
    public double consultarSaldo();

}
