import Mundial.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--------------------------------------------------------");
        System.out.println("            ⚽⚽INICIO DEL MUNDIAL 2022⚽⚽            ");
        System.out.println("--------------------------------------------------------");

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

        ArrayList<Equipo> clasificados = new ArrayList();

        //GRUPO A
        Grupo grupoA = new Grupo("Fase de grupos", new ArrayList<Partido>(0));
        //Agregacion de equipos al grupo
        grupoA.setEquipoGrupo(catar);
        grupoA.setEquipoGrupo(ecuador);
        grupoA.setEquipoGrupo(senegal);
        grupoA.setEquipoGrupo(paisesBajos);

        //Partidos grupo A
        grupoA.addPartido(new Partido(new Date(2022, 11, 20), catar, ecuador, new Resultado()));
        grupoA.addPartido(new Partido(new Date(2022, 11, 21), senegal, paisesBajos, new Resultado()));
        grupoA.addPartido(new Partido(new Date(2022, 11, 25), catar, senegal, new Resultado()));
        grupoA.addPartido(new Partido(new Date(2022, 11, 25), paisesBajos, ecuador, new Resultado()));
        grupoA.addPartido(new Partido(new Date(2022, 11, 29), ecuador, senegal, new Resultado()));
        grupoA.addPartido(new Partido(new Date(2022, 11, 29), paisesBajos, catar, new Resultado()));

        System.out.println("\n/------------------------------------------------------/");
        System.out.println("/                        GRUPO A                       /");
        System.out.println("/------------------------------------------------------/\n");
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

        System.out.println("\nPuntuaciones obtenidas:\n");
        for (Equipo equipos : grupoA.getEquipoDelGrupo()) {
            System.out.println(equipos.getNombre() + ": " + equipos.getPuntaje() + " puntos");
        }

        for(int i=0 ; i<2 ; i++){
            grupoA.addEquiposQueAvanzan(grupoA.getEquipoDelGrupo().get(i));
            clasificados.add(grupoA.getEquiposQueAvanzan().get(i));
        }

        //GRUPO B
        Grupo grupoB = new Grupo("Fase de grupos", new ArrayList<Partido>(0));
        grupoB.setEquipoGrupo(inglaterra);
        grupoB.setEquipoGrupo(usa);
        grupoB.setEquipoGrupo(iran);
        grupoB.setEquipoGrupo(gales);

        grupoB.addPartido(new Partido(new Date(2022, 11, 21), inglaterra, iran, new Resultado()));
        grupoB.addPartido(new Partido(new Date(2022, 11, 21), usa, gales, new Resultado()));
        grupoB.addPartido(new Partido(new Date(2022, 11, 25), gales, iran, new Resultado()));
        grupoB.addPartido(new Partido(new Date(2022, 11, 25), inglaterra, usa, new Resultado()));
        grupoB.addPartido(new Partido(new Date(2022, 11, 29), iran, usa, new Resultado()));
        grupoB.addPartido(new Partido(new Date(2022, 11, 29), gales, inglaterra, new Resultado()));

        System.out.println("\n/------------------------------------------------------/");
        System.out.println("/                        GRUPO B                       /");
        System.out.println("/------------------------------------------------------/\n");
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

        System.out.println("\nPuntuaciones obtenidas:\n");
        for (Equipo equipos : grupoB.getEquipoDelGrupo()) {
            System.out.println(equipos.getNombre() + ": " + equipos.getPuntaje() + " puntos");
        }

        for(int i=0 ; i<2 ; i++){
            grupoB.addEquiposQueAvanzan(grupoB.getEquipoDelGrupo().get(i));
            clasificados.add(grupoB.getEquiposQueAvanzan().get(i));
        }

        //GRUPO C
        Grupo grupoC = new Grupo("Fase de grupos", new ArrayList<Partido>(0));
        grupoC.setEquipoGrupo(argentina);
        grupoC.setEquipoGrupo(polonia);
        grupoC.setEquipoGrupo(mexico);
        grupoC.setEquipoGrupo(arabiaSaudita);

        grupoC.addPartido(new Partido(new Date(2022, 11, 22), argentina, arabiaSaudita, new Resultado()));
        grupoC.addPartido(new Partido(new Date(2022, 11, 22), mexico, polonia, new Resultado()));
        grupoC.addPartido(new Partido(new Date(2022, 11, 26), polonia, arabiaSaudita, new Resultado()));
        grupoC.addPartido(new Partido(new Date(2022, 11, 26), argentina, mexico, new Resultado()));
        grupoC.addPartido(new Partido(new Date(2022, 11, 30), polonia, argentina, new Resultado()));
        grupoC.addPartido(new Partido(new Date(2022, 11, 30), arabiaSaudita, mexico, new Resultado()));

        System.out.println("\n/------------------------------------------------------/");
        System.out.println("/                        GRUPO C                       /");
        System.out.println("/------------------------------------------------------/\n");
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

        System.out.println("\nPuntuaciones obtenidas:\n");
        for (Equipo equipos : grupoC.getEquipoDelGrupo()) {
            System.out.println(equipos.getNombre() + ": " + equipos.getPuntaje() + " puntos");
        }

        for(int i=0 ; i<2 ; i++){
            grupoC.addEquiposQueAvanzan(grupoC.getEquipoDelGrupo().get(i));
            clasificados.add(grupoC.getEquiposQueAvanzan().get(i));
        }

        //GRUPO D
        Grupo grupoD = new Grupo("Fase de grupos", new ArrayList<Partido>(0));
        grupoD.setEquipoGrupo(francia);
        grupoD.setEquipoGrupo(australia);
        grupoD.setEquipoGrupo(tunez);
        grupoD.setEquipoGrupo(dinamarca);

        grupoD.addPartido(new Partido(new Date(2022, 11, 22), dinamarca, tunez, new Resultado()));
        grupoD.addPartido(new Partido(new Date(2022, 11, 22), francia, australia, new Resultado()));
        grupoD.addPartido(new Partido(new Date(2022, 11, 26), tunez, australia, new Resultado()));
        grupoD.addPartido(new Partido(new Date(2022, 11, 26), francia, dinamarca, new Resultado()));
        grupoD.addPartido(new Partido(new Date(2022, 11, 30), tunez, francia, new Resultado()));
        grupoD.addPartido(new Partido(new Date(2022, 11, 31), australia, dinamarca, new Resultado()));

        System.out.println("\n/------------------------------------------------------/");
        System.out.println("/                        GRUPO D                       /");
        System.out.println("/------------------------------------------------------/\n");
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

        System.out.println("\nPuntuaciones obtenidas:\n");
        for (Equipo equipos : grupoD.getEquipoDelGrupo()) {
            System.out.println(equipos.getNombre() + ": " + equipos.getPuntaje() + " puntos");
        }

        for(int i=0 ; i<2 ; i++){
            grupoD.addEquiposQueAvanzan(grupoD.getEquipoDelGrupo().get(i));
            clasificados.add(grupoD.getEquiposQueAvanzan().get(i));
        }

        //GRUPO E
        Grupo grupoE = new Grupo("Fase de grupos", new ArrayList<Partido>(0));
        grupoE.setEquipoGrupo(japon);
        grupoE.setEquipoGrupo(espania);
        grupoE.setEquipoGrupo(alemania);
        grupoE.setEquipoGrupo(costaRica);

        grupoE.addPartido(new Partido(new Date(2022, 11, 23), alemania, japon, new Resultado()));
        grupoE.addPartido(new Partido(new Date(2022, 11, 23), espania, costaRica, new Resultado()));
        grupoE.addPartido(new Partido(new Date(2022, 11, 27), japon, costaRica, new Resultado()));
        grupoE.addPartido(new Partido(new Date(2022, 11, 27), espania, alemania, new Resultado()));
        grupoE.addPartido(new Partido(new Date(2022, 12, 01), japon, espania, new Resultado()));
        grupoE.addPartido(new Partido(new Date(2022, 12, 01), costaRica, alemania, new Resultado()));

        System.out.println("\n/------------------------------------------------------/");
        System.out.println("/                        GRUPO E                       /");
        System.out.println("/------------------------------------------------------/\n");
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

        System.out.println("\nPuntuaciones obtenidas:\n");
        for (Equipo equipos : grupoE.getEquipoDelGrupo()) {
            System.out.println(equipos.getNombre() + ": " + equipos.getPuntaje() + " puntos");
        }

        for(int i=0 ; i<2 ; i++){
            grupoE.addEquiposQueAvanzan(grupoE.getEquipoDelGrupo().get(i));
            clasificados.add(grupoE.getEquiposQueAvanzan().get(i));
        }

        //GRUPO F
        Grupo grupoF = new Grupo("Fase de grupos", new ArrayList<Partido>(0));
        grupoF.setEquipoGrupo(marruecos);
        grupoF.setEquipoGrupo(croacia);
        grupoF.setEquipoGrupo(belgica);
        grupoF.setEquipoGrupo(canada);

        grupoF.addPartido(new Partido(new Date(2022, 11, 23), marruecos, croacia, new Resultado()));
        grupoF.addPartido(new Partido(new Date(2022, 11, 23), belgica, canada, new Resultado()));
        grupoF.addPartido(new Partido(new Date(2022, 11, 27), belgica, marruecos, new Resultado()));
        grupoF.addPartido(new Partido(new Date(2022, 11, 27), croacia, canada, new Resultado()));
        grupoF.addPartido(new Partido(new Date(2022, 12, 01), croacia, belgica, new Resultado()));
        grupoF.addPartido(new Partido(new Date(2022, 12, 01), canada, marruecos, new Resultado()));

        System.out.println("\n/------------------------------------------------------/");
        System.out.println("/                        GRUPO F                       /");
        System.out.println("/------------------------------------------------------/\n");
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

        System.out.println("\nPuntuaciones obtenidas:\n");
        for (Equipo equipos : grupoF.getEquipoDelGrupo()) {
            System.out.println(equipos.getNombre() + ": " + equipos.getPuntaje() + " puntos");
        }

        for(int i=0 ; i<2 ; i++){
            grupoF.addEquiposQueAvanzan(grupoF.getEquipoDelGrupo().get(i));
            clasificados.add(grupoF.getEquiposQueAvanzan().get(i));
        }

        //GRUPO G
        Grupo grupoG = new Grupo("Fase de grupos", new ArrayList<Partido>(0));
        grupoG.setEquipoGrupo(brasil);
        grupoG.setEquipoGrupo(suiza);
        grupoG.setEquipoGrupo(camerun);
        grupoG.setEquipoGrupo(serbia);

        grupoG.addPartido(new Partido(new Date(2022, 11, 24), suiza, camerun, new Resultado()));
        grupoG.addPartido(new Partido(new Date(2022, 11, 24), brasil, serbia, new Resultado()));
        grupoG.addPartido(new Partido(new Date(2022, 11, 28), camerun, serbia, new Resultado()));
        grupoG.addPartido(new Partido(new Date(2022, 11, 28), brasil, suiza, new Resultado()));
        grupoG.addPartido(new Partido(new Date(2022, 12, 02), serbia, suiza, new Resultado()));
        grupoG.addPartido(new Partido(new Date(2022, 12, 02), camerun, brasil, new Resultado()));

        System.out.println("\n/------------------------------------------------------/");
        System.out.println("/                        GRUPO G                       /");
        System.out.println("/------------------------------------------------------/\n");
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

        System.out.println("\nPuntuaciones:\n");
        for (Equipo equipos : grupoG.getEquipoDelGrupo()) {
            System.out.println(equipos.getNombre() + ": " + equipos.getPuntaje() + " puntos");
        }

        for(int i=0 ; i<2 ; i++){
            grupoG.addEquiposQueAvanzan(grupoG.getEquipoDelGrupo().get(i));
            clasificados.add(grupoG.getEquiposQueAvanzan().get(i));
        }

        //GRUPO H
        Grupo grupoH = new Grupo("Fase de grupos", new ArrayList<Partido>(0));
        grupoH.setEquipoGrupo(portugal);
        grupoH.setEquipoGrupo(corea);
        grupoH.setEquipoGrupo(uruguay);
        grupoH.setEquipoGrupo(ghana);

        grupoH.addPartido(new Partido(new Date(2022, 11, 24), uruguay, corea, new Resultado()));
        grupoH.addPartido(new Partido(new Date(2022, 11, 24), portugal, ghana, new Resultado()));
        grupoH.addPartido(new Partido(new Date(2022, 11, 28), corea, ghana, new Resultado()));
        grupoH.addPartido(new Partido(new Date(2022, 11, 28), portugal, uruguay, new Resultado()));
        grupoH.addPartido(new Partido(new Date(2022, 12, 02), corea, portugal, new Resultado()));
        grupoH.addPartido(new Partido(new Date(2022, 12, 02), ghana, uruguay, new Resultado()));

        System.out.println("\n/------------------------------------------------------/");
        System.out.println("/                        GRUPO H                       /");
        System.out.println("/------------------------------------------------------/\n");
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

        System.out.println("\nPuntuaciones obtenidas:\n");
        for (Equipo equipos : grupoH.getEquipoDelGrupo()) {
            System.out.println(equipos.getNombre() + ": " + equipos.getPuntaje() + " puntos");
        }

        for(int i=0 ; i<2 ; i++){
            grupoH.addEquiposQueAvanzan(grupoH.getEquipoDelGrupo().get(i));
            clasificados.add(grupoH.getEquiposQueAvanzan().get(i));
        }

        System.out.println("\n--------------------------------------------------------");
        System.out.println("          Equipos que pasan a OCTAVOS DE FINAL:           ");
        System.out.println("--------------------------------------------------------\n");

        for (int i=0;i<clasificados.size();i++) {
            System.out.println(clasificados.get(i).getNombre());
        }

        System.out.println("\n/------------------------------------------------------/");
        System.out.println("/                  OCTAVOS DE FINAL                    /");
        System.out.println("/------------------------------------------------------/\n");
        //OCTAVOS
        Llave octavos = new Llave("Octavos", new ArrayList<Partido>(0));

        //Partidos izquierda
        for (int i = 0; i < clasificados.size(); i+=4) {
            octavos.addPartido(new Partido(new Date(2022,12,03), clasificados.get(i), clasificados.get(i+3), new Resultado()));
        }
        //Partidos derecha
        for (int i = 0; i < clasificados.size()-3; i+=4) {
            octavos.addPartido(new Partido(new Date(2022,12,03), clasificados.get(i+1), clasificados.get(i+2), new Resultado()));
        }

        for (Partido partidos : octavos.getPartidos()) {
            System.out.println(partidos.marcador());
            //System.out.println(partidos.getResultado().ganoLocal());

            if (partidos.getResultado().empate()) {
                octavos.addEquiposQueAvanzan(partidos.getLocal());
            }
            else if (partidos.getResultado().ganoLocal()) {
                octavos.addEquiposQueAvanzan(partidos.getLocal());
            } else {
                octavos.addEquiposQueAvanzan(partidos.getVisitante());
            }
        }

        System.out.println("\nEquipos que pasan a CUARTOS DE FINAL:\n");
        for (int i=0;i<octavos.getEquiposQueAvanzan().size();i++) {
            System.out.println(octavos.getEquiposQueAvanzan().get(i).getNombre());
        }

        System.out.println("\n/------------------------------------------------------/");
        System.out.println("/                  CUARTOS DE FINAL                    /");
        System.out.println("/------------------------------------------------------/\n");
        //CUARTOS
        Llave cuartos = new Llave("Cuartos", new ArrayList<Partido>(0));

        for (int i = 0; i < octavos.getEquiposQueAvanzan().size(); i+=2) {
            cuartos.addPartido(new Partido(new Date(2022, 12, 03),octavos.getEquiposQueAvanzan().get(i), octavos.getEquiposQueAvanzan().get(i+1), new Resultado()));
        }

        for (Partido partidos : cuartos.getPartidos()) {
            System.out.println(partidos.marcador());
            //System.out.println(partidos.getResultado().ganoLocal());

            if (partidos.getResultado().empate()) {
                cuartos.addEquiposQueAvanzan(partidos.getLocal());
            }
            else if (partidos.getResultado().ganoLocal()) {
                cuartos.addEquiposQueAvanzan(partidos.getLocal());
            } else {
                cuartos.addEquiposQueAvanzan(partidos.getVisitante());
            }
        }

        System.out.println("\nEquipos que pasan a la SEMIFINAL:\n");
        for (int i=0;i<cuartos.getEquiposQueAvanzan().size();i++) {
            System.out.println(cuartos.getEquiposQueAvanzan().get(i).getNombre());
        }

        System.out.println("\n/------------------------------------------------------/");
        System.out.println("/                      SEMIFINAL                       /");
        System.out.println("/------------------------------------------------------/\n");
        //SEMIFINAL
        Llave semifinal = new Llave("Semifinal", new ArrayList<Partido>(0));

        for (int i = 0; i < cuartos.getEquiposQueAvanzan().size(); i+=2) {
            semifinal.addPartido(new Partido(new Date(2022, 12, 03),cuartos.getEquiposQueAvanzan().get(i), cuartos.getEquiposQueAvanzan().get(i+1), new Resultado()));
        }

        for (Partido partidos : semifinal.getPartidos()) {
            System.out.println(partidos.marcador());
            //System.out.println(partidos.getResultado().ganoLocal());

            if (partidos.getResultado().empate()) {
                semifinal.addEquiposQueAvanzan(partidos.getLocal());
            }
            else if (partidos.getResultado().ganoLocal()) {
                semifinal.addEquiposQueAvanzan(partidos.getLocal());
            } else {
                semifinal.addEquiposQueAvanzan(partidos.getVisitante());
            }
        }

        System.out.println("\nEquipos que pasan a la FINAL:\n");
        for (int i=0;i<semifinal.getEquiposQueAvanzan().size();i++) {
            System.out.println(semifinal.getEquiposQueAvanzan().get(i).getNombre());
        }

        System.out.println("\n/------------------------------------------------------/");
        System.out.println("/                       FINAL                          /");
        System.out.println("/------------------------------------------------------/\n");
        //FINAL
        Llave laFinal = new Llave("Final", new ArrayList<Partido>(0));

        laFinal.addPartido(new Partido(new Date(2022, 12, 10),semifinal.getEquiposQueAvanzan().get(0), semifinal.getEquiposQueAvanzan().get(1), new Resultado()));

        for (Partido partidos : laFinal.getPartidos()) {
            System.out.println(partidos.marcador());
            //System.out.println(partidos.getResultado().ganoLocal());

            if (partidos.getResultado().empate()) {
                laFinal.addEquiposQueAvanzan(partidos.getLocal());
            }
            else if (partidos.getResultado().ganoLocal()) {
                laFinal.addEquiposQueAvanzan(partidos.getLocal());
            } else {
                laFinal.addEquiposQueAvanzan(partidos.getVisitante());
            }
        }

        System.out.println("\n/------------------------------------------------------/");
        System.out.println("/          🏆GANADOR DE LA COPA MUNDIAL🏆              /");
        System.out.println("/------------------------------------------------------/\n");

        for (int i=0;i<laFinal.getEquiposQueAvanzan().size();i++) {
            System.out.println(laFinal.getEquiposQueAvanzan().get(i).getNombre());
        }

        /*System.out.println("\n/------------------------------------------------------/");
        System.out.println("/                  MÉTODOS TO STRING                   /");
        System.out.println("/------------------------------------------------------/\n");

        System.out.println("\nEquipo--------------------------------------------------\n");
        System.out.println(argentina.toString());

        System.out.println("\nGrupo---------------------------------------------------\n");
        System.out.println(grupoA.toString());

        System.out.println("\nArrayList Clasificados----------------------------------\n");
        System.out.println(clasificados.toString());

        System.out.println("\nOctavos-------------------------------------------------\n");
        System.out.println(octavos.toString());

        System.out.println("\nCuartos-------------------------------------------------\n");
        System.out.println(cuartos.toString());

        System.out.println("\nSemi final----------------------------------------------\n");
        System.out.println(semifinal.toString());

        System.out.println("\nFinal---------------------------------------------------\n");
        System.out.println(laFinal.toString());*/

    }

}