package com.eldar.apitarjeta.domain.operaciones;


import com.eldar.apitarjeta.domain.tarjeta.Tarjeta;
import com.eldar.apitarjeta.exceptions.OperationException;
import com.eldar.apitarjeta.exceptions.TarjetaInvalidaException;

public class Operacion {
    private Tarjeta tarjeta;
    private final Double montoMinimo = 1000.0;

    public Operacion(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    private void validarOperacion(Double montoIngresado) throws TarjetaInvalidaException {
        if(tarjeta == null){
            throw new NullPointerException("La tarjeta no existe");
        }
        if(!tarjeta.esTarjetaValida()){
            throw new TarjetaInvalidaException("Tarjeta invalida");
        }
        // Esto lo deje como opcional
        if(tarjeta.obtenerTasa()>100.0){
            throw new IllegalArgumentException("La tasa es mayor que 100");
        }
        // TODO: validacion de numeros
        if(montoIngresado<montoMinimo){
            throw new IllegalArgumentException("Monto inferior al minimo");
        }
    }


    public Double calcularTasaDeOperacionValidado(Double montoIngresado) throws OperationException {
        try {
            validarOperacion(montoIngresado);
            return montoIngresado*tarjeta.obtenerTasa();
        }
        catch(TarjetaInvalidaException e1){
            throw new OperationException("Operacion fallida :" + e1.getMessage());
        }

    }

    public Double consultaTasaDeOperacion(Double monto){
        if(monto<montoMinimo){
            throw new IllegalArgumentException("Monto inferior al minimo");
        }
        return monto*tarjeta.obtenerTasa();
    }
}
