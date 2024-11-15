package dominio;

public abstract class Persona {
    protected int id;
    protected String nombre;
    protected String telefono;

    public Persona(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}
