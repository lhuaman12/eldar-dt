package com.eldar.apitarjeta.response;

public class ObtenerTasaResponse {
    private Double tasa;
    private Double monto;
    private String marca;

    public ObtenerTasaResponse(Double tasa, Double monto, String marca) {
        this.tasa = tasa;
        this.monto = monto;
        this.marca = marca;
    }
    public ObtenerTasaResponse() {
    }

    public Double getTasa() {
        return tasa;
    }

    public void setTasa(Double tasa) {
        this.tasa = tasa;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
