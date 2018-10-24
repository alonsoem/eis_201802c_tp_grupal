package gradle.cucumber;

import javafx.util.Pair;

public class Oeste extends Direccion {

    public Pair<Integer, Integer> mover(Pair<Integer, Integer> ubicacion) {
        return new Pair<>(ubicacion.getKey()-1,ubicacion.getValue());

    }
}
