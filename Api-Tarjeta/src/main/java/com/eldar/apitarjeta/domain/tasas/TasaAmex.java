package com.eldar.apitarjeta.domain.tasas;

public class TasaAmex implements Tasa{
    @Override
    public Double calcularTasa() {
        return 27*0.5;
    }
}
