package cl.jpino.wallet.model;

import cl.jpino.wallet.service.Conversion;

public class Euro extends Conversion {
    private double euro;
    private final double VALOR_EURO = 1058.93;

    public Euro(double cantidad,  String moneda) {
        super(cantidad, moneda);
        euro = cantidad / VALOR_EURO;
        setResultado(euro);
    }
}
