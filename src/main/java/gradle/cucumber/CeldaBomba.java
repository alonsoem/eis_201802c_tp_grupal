package gradle.cucumber;

import javafx.util.Pair;

public class CeldaBomba extends Celda{

    public CeldaBomba(Pair<Integer,Integer> ubicacion) {
        super(ubicacion.getKey(),ubicacion.getValue());
    }

    public Pair<Integer, Integer> ocupar(Mapa mapa){
        return mapa.ubicacionBomberman();
    }
    public Celda explotar()
    {
        return new Celda(ubicacion);

    }


}
