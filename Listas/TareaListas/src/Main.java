import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {

        List<Vuelo> vuelos = new ArrayList<>();
        List<Vuelo> llegadas = new ArrayList<>();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");

        Vuelo vuelo1 = new Vuelo("AAL 933", "New York", "Santiago", df.parse("2021-08-29 05:39"), 62);
        Vuelo vuelo2 = new Vuelo("LAT 755", "Sao Paulo", "Santiago", df.parse("2021-08-31 04:45"), 47);

        vuelos.add(vuelo1);
        vuelos.add(vuelo2);

        vuelos.forEach(System.out::println);

        vuelos.sort((v1, v2) -> vuelo2.getFechayHora().compareTo(vuelo1.getFechayHora()));

        vuelos.forEach(System.out::println);

    }

}