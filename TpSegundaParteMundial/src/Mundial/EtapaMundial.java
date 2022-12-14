package Mundial;

import java.util.ArrayList;

public class EtapaMundial {
    private String descripcionEtapa;
    private ArrayList<Partido>partidos;
    private ArrayList<Equipo>equiposQueAvanzan = new ArrayList<>();

    public EtapaMundial(String descripcionEtapa, ArrayList<Partido> partidos) {
        this.descripcionEtapa = descripcionEtapa;
        this.partidos = partidos;
    }

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Equipo> getEquiposQueAvanzan(){
        return equiposQueAvanzan;
    }

    public void setEquiposQueAvanzan(ArrayList<Equipo> equiposQueAvanzan) {
        this.equiposQueAvanzan = equiposQueAvanzan;
    }

    public void addPartido(Partido partido){
        this.partidos.add(partido);
    }

    public void addEquiposQueAvanzan(Equipo equiposQueAvanzan) {
        this.getEquiposQueAvanzan().add(equiposQueAvanzan);
    }

    @Override
    public String toString() {
        return "EtapaMundial[" +
                "descripcionEtapa='" + descripcionEtapa + '\'' +
                ", partidos=" + partidos +
                ", equiposQueAvanzan=" + equiposQueAvanzan +
                ']';
    }
}
