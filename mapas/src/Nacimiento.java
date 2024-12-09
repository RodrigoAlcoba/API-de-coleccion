import javax.print.Doc;
import java.util.Map;

public class Nacimiento {
    public String nombre;
    public Map<Integer,String> doctoresMap;

    public Nacimiento(String nombre, Map<Integer, String> doctoresMap) {
        this.nombre = nombre;
        this.doctoresMap = doctoresMap;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<Integer, String> getDoctoresMap() {
        return doctoresMap;
    }

    public void setDoctoresMap(Map<Integer, String> doctoresMap) {
        this.doctoresMap = doctoresMap;
    }

    @Override
    public String toString() {
        return
                "Nombre del niño : " + nombre + " " +'\n' +
                "Doctores del Parto :" + doctoresMap;
    }
}
