package Mundial;

import java.util.ArrayList;

public class Grupo extends EtapaMundial{

    private ArrayList<Equipo>equiposDelGrupo = new ArrayList<>();
    private ArrayList<Equipo>equiposQueAvanzan = new ArrayList<>();

    public Grupo(String descripcionEtapa, ArrayList<Partido> partidos) {
        super(descripcionEtapa, partidos);
        this.equiposQueAvanzan = equiposQueAvanzan;
    }

    public void setEquipoGrupo(Equipo equipo){
        this.equiposDelGrupo.add(equipo);
    }

    public ArrayList<Equipo> getEquipoDelGrupo(){
        return equiposDelGrupo;
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
        return "Grupo{" +
                "equiposDelGrupo=" + equiposDelGrupo +
                ", equiposQueAvanzan=" + equiposQueAvanzan +
                '}';
    }
}
