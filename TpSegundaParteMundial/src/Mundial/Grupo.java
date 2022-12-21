package Mundial;

import java.util.ArrayList;

public class Grupo extends EtapaMundial{

    private ArrayList<Equipo>equiposDelGrupo = new ArrayList<>();

    public Grupo(String descripcionEtapa, ArrayList<Partido> partidos) {
        super(descripcionEtapa, partidos);
    }

    public void setEquipoGrupo(Equipo equipo){
        this.equiposDelGrupo.add(equipo);
    }

    public ArrayList<Equipo> getEquipoDelGrupo(){
        return equiposDelGrupo;
    }

    @Override
    public void addEquiposQueAvanzan(Equipo equiposQueAvanzan) {
        this.getEquiposQueAvanzan().add(equiposQueAvanzan);
    }

    @Override
    public String toString() {
        return super.toString() +"Grupo[" +
                "equiposDelGrupo=" + equiposDelGrupo +
                ']';
    }
}
