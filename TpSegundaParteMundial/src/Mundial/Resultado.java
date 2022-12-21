package Mundial;
public class Resultado {

    private int golesLocal;
    private int golesVisitante;

    public Resultado() {
        this.golesLocal = (int)(Math.random()*7);
        this.golesVisitante = (int)(Math.random()*7);
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = (int)(Math.random()*7);
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = (int)(Math.random()*7);
    }

    public boolean ganoLocal() {
        if (this.golesLocal > this.golesVisitante) {
            return true;
        } else {
            return false;
        }
    }

    public boolean empate() {
        if (this.golesLocal == this.golesVisitante) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "golesLocal=" + golesLocal +
                ", golesVisitante=" + golesVisitante +
                '}';
    }
}
