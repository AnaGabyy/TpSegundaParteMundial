package Mundial;

import java.util.ArrayList;

public class Llave extends EtapaMundial{

    public Llave(String descripcionEtapa, ArrayList<Partido> partidos) {
        super(descripcionEtapa, partidos);
    }

    @Override
    public void addEquiposQueAvanzan(Equipo equiposQueAvanzan) {
        this.getEquiposQueAvanzan().add(equiposQueAvanzan);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
