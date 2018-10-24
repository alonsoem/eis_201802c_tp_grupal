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
        return new Celda(ubicacion);
    }


    @Override
    public boolean equals(Object obj) {
        CeldaPared p= (CeldaPared)obj;

        return p.getClass().equals(this.getClass());

    }
}
