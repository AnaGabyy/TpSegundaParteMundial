package Garaje.SistemaGaraje;
import Garaje.Vehiculos.Auto;
import Garaje.Vehiculos.Moto;

public class GarajeTest {

    public static void main(String[] args) {

        Garaje garaje = new Garaje("Casa Garage", 180,10);
        System.out.println("\n/------------------------------------------------------/");
        System.out.println("/                    SISTEMA GARAJE                    /");
        System.out.println("/------------------------------------------------------/\n");
        garaje.abrirGaraje();

        //CARROS 12 ruedas
        Auto carro1 = new Auto(5445, "H214e", "Ford", "Ford fiesta", 2017, 4, 65, 4);
        Auto carro2 = new Auto(5445, "Go78A", "BMW", "BMW X6", 2020, 4, 100, 4);
        Auto carro3 = new Auto(5445, "FF609", "Mercedes-Benz", "GLE SUV", 2021, 4, 100, 4);

        //MOTOS 8 ruedas
        Moto moto1 = new Moto(1221,"AE45W", "Honda", "CB500F", 2021, 2, 480, 470);
        Moto moto2 = new Moto(1221,"1QASX", "Suzuki", "GSX S 750", 2019, 2, 225, 750);
        Moto moto3 = new Moto(1221,"904GF", "Yamaha", "WR450F", 2018, 2, 300, 450);
        Moto moto4 = new Moto(1221,"756TY", "Yamaha", "YZF-R6", 2020, 2, 200, 450);

        //Añado los vehiculos a vehiculosRecibidos y validará si hay espacio disponible o no, dependiendo de eso agrega o deja de agregar
        garaje.addVehiculosRecibidos(carro1);
        garaje.addVehiculosRecibidos(carro2);
        garaje.addVehiculosRecibidos(carro3);
        garaje.addVehiculosRecibidos(moto1);
        garaje.addVehiculosRecibidos(moto2);
        garaje.addVehiculosRecibidos(moto3);
        garaje.addVehiculosRecibidos(moto4);

        //Muestro cantidad de vehiculos
        System.out.println("\n-------------------------------------------------------");
        System.out.println("\nVehículos dentro del garaje: " + garaje.contarVehiculosRecibidos());

        //Retirar vehiculo
        System.out.println("\n-------------------------------------------------------");
        System.out.println("\nRetiro de vehiculo: " + moto4.getModelo());
        garaje.retirarVehiculo(moto4);

        System.out.println("\n-------------------------------------------------------");
        System.out.println("\nVehículos dentro del garaje: " + garaje.contarVehiculosRecibidos());

        System.out.println("\n-------------------------------------------------------");
        System.out.println("\nCalculo del precio total si hay cambio de todas las ruedas de todos los vehiculos: ");
        System.out.println(garaje.precioTotalCambioRuedas());

        System.out.println("\n-------------------------------------------------------");
        System.out.println("\nCalculo del kilometraje medio de todos los vehiculos: ");
        System.out.println(garaje.calcularKilometraje());

        System.out.println("\n-------------------------------------------------------");
        garaje.cerrarGaraje();

        System.out.println("\n/------------------------------------------------------/");
        System.out.println("/                  MÉTODOS TO STRING                   /");
        System.out.println("/------------------------------------------------------/\n");

        System.out.println(garaje.toString());

        System.out.println("\n-------------------------------------------------------");
        System.out.println(moto1.toString());
        System.out.println(moto2.toString());
        System.out.println(moto3.toString());
        System.out.println(moto4.toString());


        System.out.println("\n-------------------------------------------------------");
        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
        System.out.println(carro3.toString());


    }
}
