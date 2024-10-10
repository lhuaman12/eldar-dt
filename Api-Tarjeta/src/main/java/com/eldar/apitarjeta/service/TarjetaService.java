package com.eldar.apitarjeta.service;

import com.eldar.apitarjeta.response.ObtenerTasaResponse;

public interface TarjetaService {
    public ObtenerTasaResponse calcularTasa(String marca,Double monto);
}
