package com.eldar.apitarjeta.request;

public class ObtenerTasaRequest {
    private String marca;
    private Double monto;

    public ObtenerTasaRequest(String marca, Double monto) {
        this.marca = marca;
        this.monto = monto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
}
