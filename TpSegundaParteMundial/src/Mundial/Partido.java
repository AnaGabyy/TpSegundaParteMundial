package Mundial;

import java.util.Date;

public class Partido {

    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;


    //constructor
    public Partido(Date fecha, Equipo local, Equipo visitante, Resultado resultado) {
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
        this.resultado = resultado;
    }

    public Partido (Date fecha, Equipo local, Equipo visitante){

    }

    //getters y setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public String marcador(){
        return String.format("%s (%d) - (%d) %s",
                getLocal().getNombre(),
                getResultado().getGolesLocal(),
                getResultado().getGolesVisitante(),
                getVisitante().getNombre()
        );
    }

    @Override
    public String toString() {
        return "Partido{" +
                "fecha=" + fecha +
                ", local=" + local.getNombre() +
                ", visitante=" + visitante.getNombre() +
                '}';
    }
}
