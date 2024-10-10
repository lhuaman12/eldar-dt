import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> my_array = List.of("FirstWord", "SecondWord", "THIRDWORD");
        List<String> my_array2 = List.of("a FirstWord   ", " SecondW  ord", " ThirdWord       ");
        /*
         Asumo que puede venir espacios de por medio y costados como "First Word" o " FirstWord  "
         por lo tanto para que sea consistente los elimino y solo queden los elementos separados entre un espacio
         */
        // Solucion funcional y corta
        String output1 = my_array.stream().map(palabra->palabra.toLowerCase().replace(" ", "")).collect(Collectors.joining(" "));
        String ouput2 = my_array2.stream().map(palabra->palabra.toLowerCase().replace(" ", "")).collect(Collectors.joining(" "));

        System.out.println(output1);
        System.out.println(ouput2);

        // La solucion manual seria recorrer como array cada elemento y modificarlo uno por uno, pero como la restriccion es 10 elementos no afecta el rendimiento
    }
}