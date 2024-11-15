package dominio;

public class Conductor extends Persona{

    private Vehiculo vehiculo;

    public Conductor(int id, String nombre, String telefono) {
        super(id, nombre, telefono);
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
