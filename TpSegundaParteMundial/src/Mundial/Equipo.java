package Mundial;

import java.util.ArrayList;

public class Equipo{

    private String nombre;
    private int puntaje;
    private ArrayList<Partido>partidosJugados;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.puntaje = puntaje;
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

    public void setPuntaje(int x){
       this.puntaje = sumaPuntaje(x);

    }

    public int getPuntaje(){
        return this.puntaje;
    }

    private int sumaPuntaje(int x){
        return this.puntaje + x;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", puntaje=" + puntaje +
                ", partidosJugados=" + partidosJugados +
                '}';
    }

}
