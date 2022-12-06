package Mundial;

import java.util.ArrayList;

public class Grupo extends EtapaMundial{

    private ArrayList<Partido>grupos;
    private int puntaje;
    private ArrayList<Equipo>equiposQueAvanzan;

    public Grupo(String descripcionEtapa) {
        super(descripcionEtapa);
        this.grupos = grupos;
        this.puntaje = 0;
        this.equiposQueAvanzan = equiposQueAvanzan;
    }

    //Getters y setters
    public ArrayList<Partido> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Partido> grupos) {
        grupos = grupos;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {

        for (int i = 0; i < getPartidos().size(); i++) {
            if (getPartidos().get(i).getResultado().ganoLocal()){

                equiposQueAvanzan.add(getPartidos().get(i).getLocal());
                setPuntaje(3);

            } else if (getPartidos().get(i).getResultado().empate()) {
                equiposQueAvanzan.add(getPartidos().get(i).getLocal());
                setPuntaje(1);

            } else {
                equiposQueAvanzan.add(getPartidos().get(i).getVisitante());
                setPuntaje(3);
            }
        }

        return equiposQueAvanzan;
    }

    @Override
    public void setEquiposQueAvanzan(ArrayList<Equipo> equiposQueAvanzan) {
        this.equiposQueAvanzan = equiposQueAvanzan;
    }

    @Override
    public void addEquiposQueAvanzan(Equipo equiposQueAvanzan){
        this.equiposQueAvanzan.add(equiposQueAvanzan);
    }



}
