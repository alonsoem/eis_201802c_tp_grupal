package gradle.cucumber;

import javafx.util.Pair;

public class CeldaPared extends Celda {
    public CeldaPared(int x, int y) {
        super(x,y);
    }

    public Pair<Integer, Integer> ocupar(Mapa mapa)
    {
        return mapa.ubicacionBomberman();
    }
    public Celda explotar()
    {
        return new Celda(miUbicacion);
    }

    @Override
    public boolean equals(Object obj){

        return obj.getClass().equals(this.getClass());
    }

}
