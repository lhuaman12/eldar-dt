package domain.tarjeta;

import domain.tasas.TasaAmex;
import domain.tasas.TasaVisa;

import java.time.YearMonth;

public class TarjetasFactory {
    public static Tarjeta crearTarjeta(String marca, String numero, String cardHolder, YearMonth fechaVencimiento) {
        switch (marca.toUpperCase()) {
            case "VISA":
                return new Tarjeta("Visa", numero, cardHolder, fechaVencimiento, new TasaVisa());
            case "AMEX":
                return new Tarjeta("Amex", numero, cardHolder, fechaVencimiento, new TasaAmex());
//            case "NARA":
//                return new Tarjeta("Nara", numero, cardHolder, fechaVencimiento, new TasaNara());
            default:
                throw new IllegalArgumentException("Marca de tarjeta desconocida");
        }
    }
}
