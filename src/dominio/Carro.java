package dominio;

import dominio.interfaces.Conducible;

public class Carro extends Vehiculo {

    private String color;

    public Carro(int id, String marca, String modelo, String placa, int capacidadPasajeros, Conductor conductor, String color) {
        super(id, marca, modelo, placa, capacidadPasajeros, conductor);
        this.color = color;
    }

    @Override
    public String obtenerTipo() {
        return "Carro";
    }

    @Override
    public double calcularTarifa(int minutos) {
        return minutos * 3000;
    }

    @Override
    public void iniciarViaje() {
        System.out.println("Viaje en carro iniciado");
    }

    @Override
    public void terminarViaje() {
        System.out.println("Viaje en carro terminado");
    }
}
