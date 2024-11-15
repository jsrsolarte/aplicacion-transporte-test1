package dominio;

public class Usuario extends Persona{

    private String correo;

    public Usuario(int id, String nombre, String telefono, String correo) {
        super(id, nombre, telefono);
        this.correo = correo;
    }

}
