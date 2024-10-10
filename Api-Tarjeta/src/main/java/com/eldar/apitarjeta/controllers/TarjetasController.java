package com.eldar.apitarjeta.controllers;

import com.eldar.apitarjeta.response.ObtenerTasaResponse;
import com.eldar.apitarjeta.service.TarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/public/tarjetas")
public class TarjetasController {

    @Autowired
    TarjetaService tarjetaService;

    //TODO: falta securizar
    //TODO: validaciones de request param
    @GetMapping("/tasa")
    public ResponseEntity<ObtenerTasaResponse> obtenerTasa(@RequestParam(value = "marca", required = true) String marca,
                                                           @RequestParam(value = "monto", required = true) Double monto){
        ObtenerTasaResponse response = tarjetaService.calcularTasa(marca, monto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
