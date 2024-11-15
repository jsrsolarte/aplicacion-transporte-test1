package dominio;

import dominio.excepciones.CapacidadExcedidaException;

public class Viaje {
    private Usuario usuario;
    private Vehiculo vehiculo;
    private int pasajeros;
    private int minutos;
    private int calificacion;

    public Viaje(Usuario usuario, Vehiculo vehiculo, int pasajeros) throws CapacidadExcedidaException {
        this.usuario = usuario;
        this.vehiculo = vehiculo;
        this.pasajeros = pasajeros;

        validarCapacidad();
    }

    private void validarCapacidad() throws CapacidadExcedidaException {
        if (pasajeros > vehiculo.capacidadPasajeros){
            throw new CapacidadExcedidaException("Capacidad excedida");
        }
    }

}
