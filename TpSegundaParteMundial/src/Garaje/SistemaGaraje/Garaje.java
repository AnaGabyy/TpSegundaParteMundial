package Garaje.SistemaGaraje;

import Garaje.Vehiculos.Vehiculo;

import java.util.ArrayList;

public class Garaje {

    private String nombre;
    private double precioCambioRueda;
    private int capacidadMaximaVehiculos;
    private ArrayList<Vehiculo>vehiculosRecibidos;

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
        System.out.println("Está abierto el garaje");
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

        if (getCapacidadMaximaVehiculos() < capacidadMaximaVehiculos){
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

    public void ingresarVehiculo(Vehiculo vehiculosRecibidos){

        if (getCapacidadMaximaVehiculos() < capacidadMaximaVehiculos){
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

    /*public void precioTotalCambioRuedas(){
        for (int i = 0; i < vehiculosRecibidos.size(); i++) {

        }
    }*/

    /*public void calcularKilometraje(){
        int sumaKilometraje = 0;
        for (Vehiculo vehiculo : vehiculosRecibidos) {
            sumaKilometraje = sumaKilometraje + vehiculosRecibidos.getKilometraje();
        }

        double promedioKilometraje = sumaKilometraje /vehiculosRecibidos.size();
    }*/


    public void cerrarGaraje(){
        System.out.println("Está cerrado el garaje");
    }


}
