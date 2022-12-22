package Garaje.Vehiculos;

public class Auto extends Vehiculo{

    private int cantidadPuertas;

    public Auto(int codigoVehiculo, String matricula, String marca, String modelo, int anio, int cantidadRuedas, double kilometraje, int cantidadPuertas) {
        super(codigoVehiculo, matricula, marca, modelo, anio, cantidadRuedas, kilometraje);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + "Auto[" +
                "cantidadPuertas=" + cantidadPuertas +
                ']';
    }
}
