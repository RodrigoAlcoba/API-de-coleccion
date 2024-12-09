import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws miexcepcion {

        Doctores doctor = new Doctores(0, "Jose");
        Doctores doctores2 = new Doctores(2, "Jane");
        Doctores doctores3 = new Doctores(3, "Bob");
        Doctores doctores4 = new Doctores(4, "Luis");

        Map<Integer, String> doctores = new HashMap<>();

        doctores.put(doctor.getId(), doctor.nombreDoctor);
        doctores.put(doctores2.getId(), doctores2.nombreDoctor);
        doctores.put(doctores3.getId(), doctores3.nombreDoctor);
        doctores.put(doctores4.getId(), doctores4.nombreDoctor);

        Nacimiento nacimiento = new Nacimiento("Josesito", doctores);

        System.out.println(nacimiento);


        if (doctor.getId() == 0) {
            throw new miexcepcion("Holanda");
        }
    }
}