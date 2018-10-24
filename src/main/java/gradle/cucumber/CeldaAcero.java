package gradle.cucumber;

import javafx.util.Pair;

public class CeldaAcero extends Celda {
    public CeldaAcero(int x, int y) {
        super(x,y);
    }

    public Pair<Integer, Integer> ocupar(Mapa mapa)
    {
        return mapa.ubicacionBomberman();
    }

    public Celda explotar()
    {
        return this;
    }



}
