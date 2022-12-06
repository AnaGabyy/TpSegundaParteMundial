package Garaje.Vehiculos;

public class Vehiculo {

    private int codigoVehiculo;
    private String matricula;
    private String marca;
    private String modelo;
    private int anio;
    private int cantidadRuedas;
    private int kilometraje;

    public Vehiculo(int codigoVehiculo, String matricula, String marca, String modelo, int anio, int cantidadRuedas, int kilometraje) {
        this.codigoVehiculo = codigoVehiculo;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.cantidadRuedas = cantidadRuedas;
        this.kilometraje = kilometraje;
    }

    public int getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public void setCodigoVehiculo(int codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    //ArrayList<Vehiculo> vehiculosRecibidos;
    /*public int calcularKilometraje(){
        for (Vehiculo vehiculo : kilometraje) {

        }
    }*/

}
