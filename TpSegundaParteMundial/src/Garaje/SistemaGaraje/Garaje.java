package Garaje.SistemaGaraje;
import Garaje.Vehiculos.Moto;
import Garaje.Vehiculos.Vehiculo;
import Mundial.Equipo;

import java.util.ArrayList;

public class Garaje {

    private String nombre;
    private double precioCambioRueda;
    private int capacidadMaximaVehiculos;
    private ArrayList<Vehiculo>vehiculosRecibidos = new ArrayList<>();

    public Garaje(String nombre, double precioCambioRueda, int capacidadMaximaVehiculos) {
        this.nombre = nombre;
        this.precioCambioRueda = precioCambioRueda;
        this.capacidadMaximaVehiculos = capacidadMaximaVehiculos;
        this.vehiculosRecibidos = vehiculosRecibidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void abrirGaraje(){
        System.out.println("El garaje " + "'" + getNombre() + "'" + " está abierto");
    }

    public double getPrecioCambioRueda() {
        return precioCambioRueda;
    }

    public void setPrecioCambioRueda(double precioCambioRueda) {
        this.precioCambioRueda = precioCambioRueda;
    }

    public int getCapacidadMaximaVehiculos() {
        return capacidadMaximaVehiculos;
    }

    public void setCapacidadMaximaVehiculos(int capacidadMaximaVehiculos) {
        this.capacidadMaximaVehiculos = capacidadMaximaVehiculos;
    }

    public void avisoLugarDisponible(){

        if (getCapacidadMaximaVehiculos() > getVehiculosRecibidos().size()){
            System.out.println("Hay lugar disponible");
        }else {
            System.out.println("No hay lugar disponible");
        }

    }

    public ArrayList<Vehiculo> getVehiculosRecibidos() {
        return vehiculosRecibidos;
    }

    public void setVehiculosRecibidos(ArrayList<Vehiculo> vehiculosRecibidos) {
        this.vehiculosRecibidos = vehiculosRecibidos;
    }


    public void addVehiculosRecibidos(Vehiculo vehiculosRecibidos){

        if (getCapacidadMaximaVehiculos() > getVehiculosRecibidos().size()){
            this.vehiculosRecibidos.add(vehiculosRecibidos);

        }else {
            System.out.println("No hay lugar disponible");
        }

    }

    public void retirarVehiculo(Vehiculo vehiculosRecibidos){
        this.vehiculosRecibidos.remove(vehiculosRecibidos);
    }

    public int contarVehiculosRecibidos(){
        return vehiculosRecibidos.size();
    }

    public double precioTotalCambioRuedas() {
        int motos = 0;
        int carros = 0;

        for (Vehiculo vehiculos : getVehiculosRecibidos()) {

            if (vehiculos.getCantidadRuedas() == 2) {
                motos++;
            }
            if (vehiculos.getCantidadRuedas() == 4) {
                carros++;
            }
        }
        motos = motos * 2;
        carros = carros * 4;

        return (motos + carros) * getPrecioCambioRueda();
    }

    public double calcularKilometraje(){

        double sumaKilometraje = 0;
        for (Vehiculo vehiculo : getVehiculosRecibidos()) {
            sumaKilometraje = sumaKilometraje + vehiculo.getKilometraje();
        }
        double promedioKilometraje = sumaKilometraje / getVehiculosRecibidos().size();

        return promedioKilometraje;
    }

    public void cerrarGaraje(){
        System.out.println("El garaje " + "'" + getNombre() + "'" + " está cerrado");
    }

    @Override
    public String toString() {
        return "Garaje[" +
                "nombre='" + nombre + '\'' +
                ", precioCambioRueda=" + precioCambioRueda +
                ", capacidadMaximaVehiculos=" + capacidadMaximaVehiculos +
                ", vehiculosRecibidos=" + vehiculosRecibidos +
                ']';
    }
}
