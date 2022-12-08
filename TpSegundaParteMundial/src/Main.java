import Mundial.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------------\nInicio del mundial 2022\n-------------------------");

        //Equipos
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
        Equipo corea = new Equipo("Corea del Sur");
        Equipo uruguay = new Equipo("Uruguay");
        Equipo ghana = new Equipo("Ghana");



        //GRUPO A
        Grupo grupoA = new Grupo("Fase de grupos", new ArrayList<Partido>(0));
        //Agregacion de equipos al grupo
        grupoA.setEquipoGrupo(catar);
        grupoA.setEquipoGrupo(ecuador);
        grupoA.setEquipoGrupo(senegal);
        grupoA.setEquipoGrupo(paisesBajos);

        //Partidos grupo A
        grupoA.addPartido(new Partido(new Date(2022, 11, 20), catar, ecuador, new Resultado(0, 2)));
        grupoA.addPartido(new Partido(new Date(2022, 11, 21), senegal, paisesBajos, new Resultado(0, 2)));
        grupoA.addPartido(new Partido(new Date(2022, 11, 25), catar, senegal, new Resultado(1, 3)));
        grupoA.addPartido(new Partido(new Date(2022, 11, 25), paisesBajos, ecuador, new Resultado(1, 1)));
        grupoA.addPartido(new Partido(new Date(2022, 11, 29), ecuador, senegal, new Resultado(1, 2)));
        grupoA.addPartido(new Partido(new Date(2022, 11, 29), paisesBajos, catar, new Resultado(2, 0)));

        //Nombre de equipos que conforman el grupo A
        System.out.println("\nResultados del Grupo A:\n");
        for (Partido partidos : grupoA.getPartidos()) {
            System.out.println(partidos.marcador());
        }

        for (Partido partidos : grupoA.getPartidos()) {

            if (partidos.getResultado().ganoLocal())
                partidos.getLocal().setPuntaje(3);
            else if (partidos.getResultado().empate()) {
                partidos.getLocal().setPuntaje(1);
                partidos.getVisitante().setPuntaje(1);
            } else {
                partidos.getVisitante().setPuntaje(3);
            }

            Collections.sort(grupoA.getEquipoDelGrupo(), new ComparatorEquipo());
            Collections.reverse(grupoA.getEquipoDelGrupo());
        }

        System.out.println("\nPuntuaciones del Grupo A:\n");
        for (Equipo equipos : grupoA.getEquipoDelGrupo()) {
            System.out.println(equipos.getNombre() + ": " + equipos.getPuntaje() + " puntos");
        }

        for(int i=0 ; i<2 ; i++){
            grupoA.addEquiposQueAvanzan(grupoA.getEquipoDelGrupo().get(i));
        }
        System.out.println("--------------------------");


        //GRUPO B
        Grupo grupoB = new Grupo("Fase de grupos", new ArrayList<Partido>(0));
        grupoB.setEquipoGrupo(inglaterra);
        grupoB.setEquipoGrupo(usa);
        grupoB.setEquipoGrupo(iran);
        grupoB.setEquipoGrupo(gales);

        grupoB.addPartido(new Partido(new Date(2022, 11, 21), inglaterra, iran, new Resultado(6, 2)));
        grupoB.addPartido(new Partido(new Date(2022, 11, 21), usa, gales, new Resultado(1, 1)));
        grupoB.addPartido(new Partido(new Date(2022, 11, 25), gales, iran, new Resultado(0, 2)));
        grupoB.addPartido(new Partido(new Date(2022, 11, 25), inglaterra, usa, new Resultado(0, 0)));
        grupoB.addPartido(new Partido(new Date(2022, 11, 29), iran, usa, new Resultado(0, 1)));
        grupoB.addPartido(new Partido(new Date(2022, 11, 29), gales, inglaterra, new Resultado(0, 3)));

        //Nombre de equipos que conforman el grupo B
        System.out.println("\nResultados del Grupo B:\n");
        for (Partido partidos : grupoB.getPartidos()) {
            System.out.println(partidos.marcador());
        }

        for (Partido partidos : grupoB.getPartidos()) {

            if (partidos.getResultado().ganoLocal())
                partidos.getLocal().setPuntaje(3);
            else if (partidos.getResultado().empate()) {
                partidos.getLocal().setPuntaje(1);
                partidos.getVisitante().setPuntaje(1);
            } else {
                partidos.getVisitante().setPuntaje(3);
            }

            Collections.sort(grupoB.getEquipoDelGrupo(), new ComparatorEquipo());
            Collections.reverse(grupoB.getEquipoDelGrupo());
        }

        System.out.println("\nPuntuaciones del Grupo B:\n");
        for (Equipo equipos : grupoB.getEquipoDelGrupo()) {
            System.out.println(equipos.getNombre() + ": " + equipos.getPuntaje() + " puntos");
        }

        for(int i=0 ; i<2 ; i++){
            grupoB.addEquiposQueAvanzan(grupoB.getEquipoDelGrupo().get(i));
        }
        System.out.println("--------------------------");



        //GRUPO C
        Grupo grupoC = new Grupo("Fase de grupos", new ArrayList<Partido>(0));
        grupoC.setEquipoGrupo(argentina);
        grupoC.setEquipoGrupo(polonia);
        grupoC.setEquipoGrupo(mexico);
        grupoC.setEquipoGrupo(arabiaSaudita);

        grupoC.addPartido(new Partido(new Date(2022, 11, 22), argentina, arabiaSaudita, new Resultado(1, 2)));
        grupoC.addPartido(new Partido(new Date(2022, 11, 22), mexico, polonia, new Resultado(1, 0)));
        grupoC.addPartido(new Partido(new Date(2022, 11, 26), polonia, arabiaSaudita, new Resultado(2, 0)));
        grupoC.addPartido(new Partido(new Date(2022, 11, 26), argentina, mexico, new Resultado(2, 0)));
        grupoC.addPartido(new Partido(new Date(2022, 11, 30), polonia, argentina, new Resultado(0, 2)));
        grupoC.addPartido(new Partido(new Date(2022, 11, 30), arabiaSaudita, mexico, new Resultado(1, 2)));

        //Nombre de equipos que conforman el grupo C
        System.out.println("\nResultados del Grupo C :\n");
        for (Partido partidos : grupoC.getPartidos()) {
            System.out.println(partidos.marcador());
        }

        for (Partido partidos : grupoC.getPartidos()) {

            if (partidos.getResultado().ganoLocal())
                partidos.getLocal().setPuntaje(3);
            else if (partidos.getResultado().empate()) {
                partidos.getLocal().setPuntaje(1);
                partidos.getVisitante().setPuntaje(1);
            } else {
                partidos.getVisitante().setPuntaje(3);
            }

            Collections.sort(grupoC.getEquipoDelGrupo(), new ComparatorEquipo());
            Collections.reverse(grupoC.getEquipoDelGrupo());
        }

        System.out.println("\nPuntuaciones del Grupo C:\n");
        for (Equipo equipos : grupoC.getEquipoDelGrupo()) {
            System.out.println(equipos.getNombre() + ": " + equipos.getPuntaje() + " puntos");
        }

        for(int i=0 ; i<2 ; i++){
            grupoC.addEquiposQueAvanzan(grupoC.getEquipoDelGrupo().get(i));
        }
        System.out.println("--------------------------");


        //GRUPO D
        Grupo grupoD = new Grupo("Fase de grupos", new ArrayList<Partido>(0));
        grupoD.setEquipoGrupo(francia);
        grupoD.setEquipoGrupo(australia);
        grupoD.setEquipoGrupo(tunez);
        grupoD.setEquipoGrupo(dinamarca);

        grupoD.addPartido(new Partido(new Date(2022, 11, 22), dinamarca, tunez, new Resultado(0, 0)));
        grupoD.addPartido(new Partido(new Date(2022, 11, 22), francia, australia, new Resultado(4, 1)));
        grupoD.addPartido(new Partido(new Date(2022, 11, 26), tunez, australia, new Resultado(0, 1)));
        grupoD.addPartido(new Partido(new Date(2022, 11, 26), francia, dinamarca, new Resultado(2, 1)));
        grupoD.addPartido(new Partido(new Date(2022, 11, 30), tunez, francia, new Resultado(1, 0)));
        grupoD.addPartido(new Partido(new Date(2022, 11, 31), australia, dinamarca, new Resultado(1, 0)));

        //Nombre de equipos que conforman el grupo D
        System.out.println("\nResultados del Grupo D:\n");
        for (Partido partidos : grupoD.getPartidos()) {
            System.out.println(partidos.marcador());
        }

        for (Partido partidos : grupoD.getPartidos()) {

            if (partidos.getResultado().ganoLocal())
                partidos.getLocal().setPuntaje(3);
            else if (partidos.getResultado().empate()) {
                partidos.getLocal().setPuntaje(1);
                partidos.getVisitante().setPuntaje(1);
            } else {
                partidos.getVisitante().setPuntaje(3);
            }

            Collections.sort(grupoD.getEquipoDelGrupo(), new ComparatorEquipo());
            Collections.reverse(grupoD.getEquipoDelGrupo());
        }

        System.out.println("\nPuntuaciones del Grupo D:\n");
        for (Equipo equipos : grupoD.getEquipoDelGrupo()) {
            System.out.println(equipos.getNombre() + ": " + equipos.getPuntaje() + " puntos");
        }

        for(int i=0 ; i<2 ; i++){
            grupoD.addEquiposQueAvanzan(grupoD.getEquipoDelGrupo().get(i));
        }
        System.out.println("--------------------------");


        //GRUPO E
        Grupo grupoE = new Grupo("Fase de grupos", new ArrayList<Partido>(0));
        grupoE.setEquipoGrupo(japon);
        grupoE.setEquipoGrupo(espania);
        grupoE.setEquipoGrupo(alemania);
        grupoE.setEquipoGrupo(costaRica);

        grupoE.addPartido(new Partido(new Date(2022, 11, 23), alemania, japon, new Resultado(1, 2)));
        grupoE.addPartido(new Partido(new Date(2022, 11, 23), espania, costaRica, new Resultado(7, 0)));
        grupoE.addPartido(new Partido(new Date(2022, 11, 27), japon, costaRica, new Resultado(0, 1)));
        grupoE.addPartido(new Partido(new Date(2022, 11, 27), espania, alemania, new Resultado(2, 1)));
        grupoE.addPartido(new Partido(new Date(2022, 12, 01), japon, espania, new Resultado(2, 1)));
        grupoE.addPartido(new Partido(new Date(2022, 12, 01), costaRica, alemania, new Resultado(2, 4)));

        //Nombre de equipos que conforman el grupo E
        System.out.println("\nResultados del Grupo E:\n");
        for (Partido partidos : grupoE.getPartidos()) {
            System.out.println(partidos.marcador());
        }

        for (Partido partidos : grupoE.getPartidos()) {

            if (partidos.getResultado().ganoLocal())
                partidos.getLocal().setPuntaje(3);
            else if (partidos.getResultado().empate()) {
                partidos.getLocal().setPuntaje(1);
                partidos.getVisitante().setPuntaje(1);
            } else {
                partidos.getVisitante().setPuntaje(3);
            }

            Collections.sort(grupoE.getEquipoDelGrupo(), new ComparatorEquipo());
            Collections.reverse(grupoE.getEquipoDelGrupo());
        }

        System.out.println("\nPuntuaciones del Grupo E:\n");
        for (Equipo equipos : grupoE.getEquipoDelGrupo()) {
            System.out.println(equipos.getNombre() + ": " + equipos.getPuntaje() + " puntos");
        }

        for(int i=0 ; i<2 ; i++){
            grupoE.addEquiposQueAvanzan(grupoE.getEquipoDelGrupo().get(i));
        }
        System.out.println("--------------------------");


        //GRUPO F
        Grupo grupoF = new Grupo("Fase de grupos", new ArrayList<Partido>(0));
        grupoF.setEquipoGrupo(marruecos);
        grupoF.setEquipoGrupo(croacia);
        grupoF.setEquipoGrupo(belgica);
        grupoF.setEquipoGrupo(canada);

        grupoF.addPartido(new Partido(new Date(2022, 11, 23), marruecos, croacia, new Resultado(0, 0)));
        grupoF.addPartido(new Partido(new Date(2022, 11, 23), belgica, canada, new Resultado(1, 0)));
        grupoF.addPartido(new Partido(new Date(2022, 11, 27), belgica, marruecos, new Resultado(0, 2)));
        grupoF.addPartido(new Partido(new Date(2022, 11, 27), croacia, canada, new Resultado(4, 1)));
        grupoF.addPartido(new Partido(new Date(2022, 12, 01), croacia, belgica, new Resultado(0, 0)));
        grupoF.addPartido(new Partido(new Date(2022, 12, 01), canada, marruecos, new Resultado(1, 2)));

        //Nombre de equipos que conforman el grupo F
        System.out.println("\nResultados del Grupo F:\n");
        for (Partido partidos : grupoF.getPartidos()) {
            System.out.println(partidos.marcador());
        }

        for (Partido partidos : grupoF.getPartidos()) {

            if (partidos.getResultado().ganoLocal())
                partidos.getLocal().setPuntaje(3);
            else if (partidos.getResultado().empate()) {
                partidos.getLocal().setPuntaje(1);
                partidos.getVisitante().setPuntaje(1);
            } else {
                partidos.getVisitante().setPuntaje(3);
            }

            Collections.sort(grupoF.getEquipoDelGrupo(), new ComparatorEquipo());
            Collections.reverse(grupoF.getEquipoDelGrupo());
        }

        System.out.println("\nPuntuaciones del Grupo F:\n");
        for (Equipo equipos : grupoF.getEquipoDelGrupo()) {
            System.out.println(equipos.getNombre() + ": " + equipos.getPuntaje() + " puntos");
        }

        for(int i=0 ; i<2 ; i++){
            grupoF.addEquiposQueAvanzan(grupoF.getEquipoDelGrupo().get(i));
        }
        System.out.println("--------------------------");


        //GRUPO G
        Grupo grupoG = new Grupo("Fase de grupos", new ArrayList<Partido>(0));
        grupoG.setEquipoGrupo(brasil);
        grupoG.setEquipoGrupo(suiza);
        grupoG.setEquipoGrupo(camerun);
        grupoG.setEquipoGrupo(serbia);
        grupoG.addPartido(new Partido(new Date(2022, 11, 24), suiza, camerun, new Resultado(1, 0)));
        grupoG.addPartido(new Partido(new Date(2022, 11, 24), brasil, serbia, new Resultado(2, 0)));
        grupoG.addPartido(new Partido(new Date(2022, 11, 28), camerun, serbia, new Resultado(3, 3)));
        grupoG.addPartido(new Partido(new Date(2022, 11, 28), brasil, suiza, new Resultado(1, 0)));
        grupoG.addPartido(new Partido(new Date(2022, 12, 02), serbia, suiza, new Resultado(2, 3)));
        grupoG.addPartido(new Partido(new Date(2022, 12, 02), camerun, brasil, new Resultado(1, 0)));

        //Nombre de equipos que conforman el grupo G
        System.out.println("\nResultados del Grupo G:\n");
        for (Partido partidos : grupoG.getPartidos()) {
            System.out.println(partidos.marcador());
        }

        for (Partido partidos : grupoG.getPartidos()) {

            if (partidos.getResultado().ganoLocal())
                partidos.getLocal().setPuntaje(3);
            else if (partidos.getResultado().empate()) {
                partidos.getLocal().setPuntaje(1);
                partidos.getVisitante().setPuntaje(1);
            } else {
                partidos.getVisitante().setPuntaje(3);
            }

            Collections.sort(grupoG.getEquipoDelGrupo(), new ComparatorEquipo());
            Collections.reverse(grupoG.getEquipoDelGrupo());
        }

        System.out.println("\nPuntuaciones del Grupo G:\n");
        for (Equipo equipos : grupoG.getEquipoDelGrupo()) {
            System.out.println(equipos.getNombre() + ": " + equipos.getPuntaje() + " puntos");
        }

        for(int i=0 ; i<2 ; i++){
            grupoG.addEquiposQueAvanzan(grupoG.getEquipoDelGrupo().get(i));
        }
        System.out.println("--------------------------");


        //GRUPO H
        Grupo grupoH = new Grupo("Fase de grupos", new ArrayList<Partido>(0));
        grupoH.setEquipoGrupo(portugal);
        grupoH.setEquipoGrupo(corea);
        grupoH.setEquipoGrupo(uruguay);
        grupoH.setEquipoGrupo(ghana);

        grupoH.addPartido(new Partido(new Date(2022, 11, 24), uruguay, corea, new Resultado(0, 1)));
        grupoH.addPartido(new Partido(new Date(2022, 11, 24), portugal, ghana, new Resultado(3, 2)));
        grupoH.addPartido(new Partido(new Date(2022, 11, 28), corea, ghana, new Resultado(2, 3)));
        grupoH.addPartido(new Partido(new Date(2022, 11, 28), portugal, uruguay, new Resultado(2, 0)));
        grupoH.addPartido(new Partido(new Date(2022, 12, 02), corea, portugal, new Resultado(2, 1)));
        grupoH.addPartido(new Partido(new Date(2022, 12, 02), ghana, uruguay, new Resultado(0, 2)));

        //Nombre de equipos que conforman el grupo H
        System.out.println("\nResultados del Grupo H:\n");
        for (Partido partidos : grupoH.getPartidos()) {
            System.out.println(partidos.marcador());
        }

        for (Partido partidos : grupoH.getPartidos()) {

            if (partidos.getResultado().ganoLocal())
                partidos.getLocal().setPuntaje(3);
            else if (partidos.getResultado().empate()) {
                partidos.getLocal().setPuntaje(1);
                partidos.getVisitante().setPuntaje(1);
            } else {
                partidos.getVisitante().setPuntaje(3);
            }

            Collections.sort(grupoH.getEquipoDelGrupo(), new ComparatorEquipo());
            Collections.reverse(grupoH.getEquipoDelGrupo());
        }

        System.out.println("\nPuntuaciones del Grupo H:\n");
        for (Equipo equipos : grupoH.getEquipoDelGrupo()) {
            System.out.println(equipos.getNombre() + ": " + equipos.getPuntaje() + " puntos");
        }

        for(int i=0 ; i<2 ; i++){
            grupoH.addEquiposQueAvanzan(grupoH.getEquipoDelGrupo().get(i));
        }
        System.out.println("--------------------------");



        System.out.println("Equipos que avanzan: ");

        System.out.println("\n------fin------");



    }

}