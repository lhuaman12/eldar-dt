package com.eldar.apitarjeta.domain.tarjeta;

import com.eldar.apitarjeta.domain.tasas.Tasa;

import java.time.LocalDate;
import java.time.YearMonth;

public class Tarjeta {
    private String marca;
    private String numeroDeTarjeta;
    private String cardHolder; // Nombre y apellido
    private YearMonth fechaDeExpiracion;
    private Tasa tasa;

    public Boolean esTarjetaValida(){
        LocalDate today = LocalDate.now();
        // Comparo a fecha de hoy con la fecha de expiracion al final de ese mes
        return !today.isAfter(fechaDeExpiracion.atEndOfMonth());
    }
    public Double obtenerTasa(){
        return tasa.calcularTasa();
    }
    @Override
    public String toString() {
        return "Tarjeta{" +
                "marca='" + this.marca + '\'' +
                ", numeroDeTarjeta=" + this.numeroDeTarjeta +
                ", cardHolder='" + this.cardHolder + '\'' +
                ", fechaDeExpiracion=" + this.fechaDeExpiracion +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tarjeta tarjeta = (Tarjeta) obj;
        return this.numeroDeTarjeta.equals(tarjeta.getNumeroDeTarjeta()) &&
                this.marca.equals(tarjeta.getMarca()) &&
                this.fechaDeExpiracion.equals(tarjeta.getFechaDeExpiracion()) &&
                this.cardHolder.equals(tarjeta.getCardHolder());
    }

    public Tarjeta(String marca, String numeroDeTarjeta, String cardHolder, YearMonth fechaDeExpiracion, Tasa tasa) {
        this.marca = marca;
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.cardHolder = cardHolder;
        this.fechaDeExpiracion = fechaDeExpiracion;
        this.tasa = tasa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroDeTarjeta() {
        return numeroDeTarjeta;
    }

    public void setNumeroDeTarjeta(String numeroDeTarjeta) {
        this.numeroDeTarjeta = numeroDeTarjeta;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public YearMonth getFechaDeExpiracion() {
        return fechaDeExpiracion;
    }

    public void setFechaDeExpiracion(YearMonth fechaDeExpiracion) {
        this.fechaDeExpiracion = fechaDeExpiracion;
    }

    public Tasa getTasa() {
        return tasa;
    }

    public void setTasa(Tasa tasa) {
        this.tasa = tasa;
    }
}
