package com.eldar.apitarjeta.service;

import com.eldar.apitarjeta.domain.operaciones.Operacion;
import com.eldar.apitarjeta.domain.tarjeta.Tarjeta;
import com.eldar.apitarjeta.domain.tarjeta.TarjetasFactory;
import com.eldar.apitarjeta.exceptions.TasaNotFoundException;
import com.eldar.apitarjeta.response.ObtenerTasaResponse;
import org.springframework.stereotype.Service;

@Service
public class TarjetasServiceImpl implements TarjetaService{
    public ObtenerTasaResponse calcularTasa(String marca,Double monto){
        try {
            Tarjeta tarjetaVacia = TarjetasFactory.crearTarjeta(marca, "", "", null);
            Operacion operacion = new Operacion(tarjetaVacia);
            Double tasa = operacion.consultaTasaDeOperacion(monto);
            return new ObtenerTasaResponse(tasa, monto, marca);
        }
        catch(Exception e) {
            throw new TasaNotFoundException(e.getMessage());
        }


    }
}
