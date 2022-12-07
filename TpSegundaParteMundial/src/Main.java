import Mundial.Equipo;
import Mundial.Grupo;
import Mundial.Partido;
import Mundial.Resultado;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Equipo paisesBajos = new Equipo("Paises Bajos");
        Equipo senegal = new Equipo("Senegal");
        Equipo ecuador = new Equipo("Ecuador");
        Equipo catar = new Equipo("Catar");

        Equipo inglaterra = new Equipo("Inglaterra");
        Equipo usa = new Equipo("Estados Unidos");
        Equipo iran = new Equipo("Irán");
        Equipo gales = new Equipo("Gales");

        Equipo argentina = new Equipo("Argentina");
        Equipo polonia = new Equipo("Polonia");
        Equipo mexico = new Equipo("México");
        Equipo arabiaSaudita = new Equipo("Arabia Saudita");

        Equipo francia = new Equipo("Francia");
        Equipo australia = new Equipo("Australia");
        Equipo tunez = new Equipo("Tunez");
        Equipo dinamarca = new Equipo("Dinamarca");

        Equipo japon = new Equipo("Japón");
        Equipo espania = new Equipo("España");
        Equipo alemania = new Equipo("Alemania");
        Equipo costaRica = new Equipo("Costa Rica");

        Equipo marruecos = new Equipo("Marruecos");
        Equipo croacia = new Equipo("Croacia");
        Equipo belgica = new Equipo("Bélgica");
        Equipo canada = new Equipo("Canadá");

        Equipo brasil = new Equipo("Brasil");
        Equipo suiza = new Equipo("Suiza");
        Equipo camerun = new Equipo("Camerún");
        Equipo serbia = new Equipo("Serbia");

        Equipo portugal = new Equipo("Portugal");
        Equipo corea = new Equipo("Corea");
        Equipo uruguay = new Equipo("Uruguay");
        Equipo ghana = new Equipo("Ghana");



        Grupo grupoA = new Grupo("Fase de grupos", new ArrayList<Partido>(0));
        //Agregacion de equipos al grupo
        grupoA.setEquipoGrupo(catar); grupoA.setEquipoGrupo(ecuador); grupoA.setEquipoGrupo(senegal); grupoA.setEquipoGrupo(paisesBajos);

        //Nombre de equipos que conforman el grupo A
        System.out.println("Grupo A conformado por: \n");
        for (Equipo equipos: grupoA.getEquipoDelGrupo()){
            System.out.println(equipos.getNombre());
        }

        //Partidos grupo A
        grupoA.addPartido(new Partido(new Date(2022,10,02), catar, ecuador, new Resultado(0,1)));
        grupoA.addPartido(new Partido(new Date(2022,10,03), senegal, paisesBajos, new Resultado(0,1)));
        grupoA.addPartido(new Partido(new Date(2022,10,04), catar, senegal, new Resultado(0,1)));
        grupoA.addPartido(new Partido(new Date(2022,10,05), paisesBajos, ecuador, new Resultado(1,1)));
        grupoA.addPartido(new Partido(new Date(2022,10,06), ecuador, senegal, new Resultado(1,2)));
        grupoA.addPartido(new Partido(new Date(2022,10,07), paisesBajos, catar, new Resultado(2,0)));

        for (Partido ejemplo: grupoA.getPartidos()) {

            if(ejemplo.getResultado().ganoLocal())
                ejemplo.getLocal().setPuntaje(3);
            else if (ejemplo.getResultado().empate())
            {
                ejemplo.getLocal().setPuntaje(1);
                ejemplo.getVisitante().setPuntaje(1);
            }
            else
                ejemplo.getVisitante().setPuntaje(3);
        }

        System.out.println("----------------------------------------");
        System.out.println(catar.getNombre() + " Tiene: " + catar.getPuntaje());
        System.out.println(ecuador.getNombre() + " Tiene: " + ecuador.getPuntaje());
        System.out.println(senegal.getNombre() + " Tiene: " + senegal.getPuntaje());
        System.out.println(paisesBajos.getNombre() + " Tiene: " + paisesBajos.getPuntaje());




        Grupo grupoB = new Grupo("Fase de grupos", new ArrayList<Partido>(0));

        //Setear los equipos en los grupos
        grupoB.addPartido(new Partido(new Date(2022,10,8), inglaterra, iran, new Resultado(6,2)));
        grupoB.addPartido(new Partido(new Date(2022,10,9), usa, gales, new Resultado(1,1)));
        grupoB.addPartido(new Partido(new Date(2022,10,10), gales, iran, new Resultado(0,2)));
        grupoB.addPartido(new Partido(new Date(2022,10,11), inglaterra, usa, new Resultado(1,2)));
        grupoB.addPartido(new Partido(new Date(2022,10,12), iran, usa, new Resultado(0,1)));
        grupoB.addPartido(new Partido(new Date(2022,10,13), gales, inglaterra, new Resultado(0,3)));

        //grupoB.getEquiposQueAvanzan();



        System.out.println("------fin------");





    }
}