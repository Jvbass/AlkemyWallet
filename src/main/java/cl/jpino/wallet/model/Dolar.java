package cl.jpino.wallet.model;

import cl.jpino.wallet.service.Conversion;

public class Dolar extends Conversion {
    private double usd;
    private final double VALOR_DOLAR = 974.93;

    public Dolar(double cantidad,  String moneda) {
        super(cantidad, moneda);
        usd = cantidad / VALOR_DOLAR;
        setResultado(usd);
    }
}
