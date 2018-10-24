package gradle.cucumber;

import javafx.util.Pair;

public class Norte extends Direccion {

    public Pair<Integer, Integer> mover(Pair<Integer, Integer> ubicacion) {
        return new Pair<>(ubicacion.getKey(),ubicacion.getValue()-1);

    }
}
