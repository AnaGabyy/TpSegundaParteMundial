package Mundial;

import java.util.ArrayList;

public abstract class EtapaMundial {
    private String descripcionEtapa;
    private ArrayList<Partido>partidos;
    private ArrayList<Equipo>equiposQueAvanzan;

    public EtapaMundial(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
        this.partidos = partidos;
        this.equiposQueAvanzan = equiposQueAvanzan;
    }


    //Getters y setters
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

    public abstract ArrayList<Equipo> getEquiposQueAvanzan();

    public void setEquiposQueAvanzan(ArrayList<Equipo> equiposQueAvanzan) {
        this.equiposQueAvanzan = equiposQueAvanzan;
    }

    public void addPartido(Partido partido){
        this.partidos.add(partido);
    }

    public void addEquiposQueAvanzan(Equipo equiposQueAvanzan){
        this.equiposQueAvanzan.add(equiposQueAvanzan);
    }

}
