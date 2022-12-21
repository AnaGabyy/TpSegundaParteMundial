package Mundial;

import java.util.Comparator;

public class ComparatorEquipo implements Comparator<Equipo> {

    @Override
    public int compare(Equipo equipo1, Equipo equipo2) {
        //Si el 1er objeto es mayor al 2do me retorna un positivo
        //Si el 2do es mayor al 1ero retorna un negativo
        //Si son iguales retorna 0
        int respuesta = 0;
        if (equipo1.getPuntaje() > equipo2.getPuntaje()){
            respuesta = 1;
        } else if (equipo1.getPuntaje() < equipo2.getPuntaje()) {
            respuesta = -1;

        }else {
            respuesta = 0;
        }

        return respuesta;
    }

}
