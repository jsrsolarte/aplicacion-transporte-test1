package dominio;

public class Moto extends Vehiculo {

    public Moto(int id, String marca, String modelo, String placa, int capacidadPasajeros, Conductor conductor) {
        super(id, marca, modelo, placa,capacidadPasajeros, conductor);
    }

    @Override
    public String obtenerTipo() {
        return "Moto";
    }

    @Override
    public double calcularTarifa(int minutos) {
        return minutos * 2000;
    }

    @Override
    public String obtenerDescripcion(){
        return "Moto -> Id: "+ id + ", Marca: " + marca + ", Modelo: " + modelo + ", Placa: " + placa ;
    }

    @Override
    public void iniciarViaje() {
        System.out.println("Iniciando viaje en Moto");
    }

    @Override
    public void terminarViaje() {
        System.out.println("Viaje en moto finalizado");
    }
}
