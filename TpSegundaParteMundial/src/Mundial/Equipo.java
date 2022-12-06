package Mundial;

import java.util.ArrayList;
public class Equipo {

    private String nombre;
    private ArrayList<Partido>partidosJugados;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.partidosJugados = partidosJugados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Partido> getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(ArrayList<Partido> partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public void addPartidosJugados(Partido partidosJugados){
        this.partidosJugados.add(partidosJugados);
    }
}
