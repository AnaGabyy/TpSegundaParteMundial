import java.util.ArrayList;

public class Grupo extends EtapaMundial{

    private ArrayList<Partido> Grupos;

    private ArrayList<Equipo> equiposQueAvanzan;

    public Grupo(String descripcionEtapa) {
        super(descripcionEtapa);
    }

    public ArrayList<Partido> getGrupos() {
        return Grupos;
    }

    public void setGrupos(ArrayList<Partido> grupos) {
        Grupos = grupos;
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


}
