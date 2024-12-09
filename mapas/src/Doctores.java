public class Doctores {
    public int id;
    public String nombreDoctor;

    public Doctores(int id, String nombreDoctor) {
        this.id = id;
        this.nombreDoctor = nombreDoctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    @Override
    public String toString() {
        return "Doctores{" +
                "nombreDoctor='" + nombreDoctor + '\'' +
                '}';
    }
}
