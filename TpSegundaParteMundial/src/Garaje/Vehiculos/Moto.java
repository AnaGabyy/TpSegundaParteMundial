package Garaje.Vehiculos;

public class Moto extends Vehiculo{

    private double cilindrada;

    public Moto(int codigoVehiculo, String matricula, String marca, String modelo, int anio, int cantidadRuedas, int kilometraje, double cilindrada) {
        super(codigoVehiculo, matricula, marca, modelo, anio, cantidadRuedas, kilometraje);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
}
