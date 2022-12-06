package Mundial;

import java.util.ArrayList;

public class Llave extends EtapaMundial{

    private ArrayList<Partido>llaves;
    private ArrayList<Equipo>equiposQueAvanzan;

    public Llave(String descripcionEtapa) {
        super(descripcionEtapa);
        this.llaves = llaves;
        this.equiposQueAvanzan = equiposQueAvanzan;
    }

    public ArrayList<Partido> getLlaves() {
        return llaves;
    }

    public void setLlaves(ArrayList<Partido> llaves) {
        this.llaves = llaves;
    }

    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        for (int i = 0; i < getPartidos().size(); i++) {
            if (getPartidos().get(i).getResultado().ganoLocal()){

                equiposQueAvanzan.add(getPartidos().get(i).getLocal());

            } else if (getPartidos().get(i).getResultado().empate()) {
                equiposQueAvanzan.add(getPartidos().get(i).getLocal());

            } else {
                equiposQueAvanzan.add(getPartidos().get(i).getVisitante());

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
