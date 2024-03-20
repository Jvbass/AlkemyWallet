package cl.jpino.wallet.service;

public class Conversion {
    private double cantidad;
    private double resultado;
    private String moneda; //  USD Euro /

    public Conversion (double cantidad,  String moneda) {
        this.cantidad = cantidad;
        this.moneda = moneda;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void mostrarResultado(){
        System.out.println("Tu saldo en "+ moneda +" es: "+resultado);
    }
}
