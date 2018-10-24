package gradle.cucumber;

import javafx.util.Pair;

public class Este extends Direccion {
    public Este(){

    }

    public Pair<Integer, Integer> mover(Pair<Integer, Integer> ubicacion) {
        return new Pair<>(ubicacion.getKey()+1,ubicacion.getValue());

    }
}
