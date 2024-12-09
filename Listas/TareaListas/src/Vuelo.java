import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vuelo {

    private String nombre;
    private String Origen;
    private String Destino;
    private Date FechayHora;
    private int numeroPasajero;

    public Vuelo(String nombre, String origen, String destino, Date fechayHora, int numeroPasajero) {
        this.nombre = nombre;
        Origen = origen;
        Destino = destino;
        FechayHora = fechayHora;
        this.numeroPasajero = numeroPasajero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String origen) {
        Origen = origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public Date getFechayHora() {
        return FechayHora;
    }

    public void setFechayHora(Date fechayHora) {
        FechayHora = fechayHora;
    }

    public int getNumeroPasajero() {
        return numeroPasajero;
    }
    public void setNumeroPasajero(int numeroPasajero) {
        this.numeroPasajero = numeroPasajero;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "nombre='" + nombre + '\'' +
                ", Origen='" + Origen + '\'' +
                ", Destino='" + Destino + '\'' +
                ", FechayHora=" + FechayHora +
                ", numeroPasajero=" + numeroPasajero +
                '}';
    }
}
