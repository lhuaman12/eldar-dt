import domain.operaciones.Operacion;
import domain.tarjeta.Tarjeta;
import domain.tasas.Tasa;
import domain.tasas.TasaVisa;
import exceptions.OperationException;

import java.time.YearMonth;

public class Main {
    public static void main(String[] args) {
        Tasa tasaVisa = new TasaVisa();
        Tarjeta tarjeta = new Tarjeta("Visa", "12345678945", "Luis Huaman", YearMonth.of(2031, 3), tasaVisa);
        Tarjeta tarjeta2 = new Tarjeta("Visa", "12345678945", "Luis Huaman", YearMonth.of(2031, 3), tasaVisa);
        Operacion operacion = new Operacion(tarjeta);

        System.out.println("Datos de la tarjeta: " + tarjeta.toString());
        System.out.println("La tarjeta es válida: " + tarjeta.esTarjetaValida());
        if(tarjeta.equals(tarjeta2)){
            System.out.println("La tarjeta 1 es igual a la tarjeta 2");
        }
        try {
            // Calcular la tasa de operación
            Double tasaDeOperacion = operacion.calcularTasaDeOperacionValidado(1000024.45);
            System.out.println("La tasa de operación es: " + tasaDeOperacion);
        } catch (OperationException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error en los argumentos: " + e.getMessage());
        }
    }
}