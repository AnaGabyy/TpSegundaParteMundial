package Mundial;

import java.util.ArrayList;

public class Llave extends EtapaMundial{

    private ArrayList<Partido>llaves;
    private ArrayList<Equipo>equiposQueAvanzan;

    public Llave(String descripcionEtapa, ArrayList<Partido> partidos, ArrayList<Partido> llaves) {
        super(descripcionEtapa, partidos);
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

    @Override
    public String toString() {
        return "Llave{" +
                "llaves=" + llaves +
                ", equiposQueAvanzan=" + equiposQueAvanzan +
                '}';
    }
}
