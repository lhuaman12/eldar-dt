package com.eldar.apitarjeta.domain.tasas;

public class TasaVisa implements Tasa{
    @Override
    public Double calcularTasa() {
        return 20.0/12;
    }
}
