package gradle.cucumber;

import javafx.util.Pair;

public class CeldaEnemigo extends Celda {

    public CeldaEnemigo(int x, int y)
    {
        super (x,y);
    }

    public Pair<Integer, Integer> ocupar(Mapa mapa){
        mapa.obtenerBomberman().morir();
        return new Pair<>(mapa.ubicacionBomberman().getKey(),mapa.ubicacionBomberman().getValue());

    }
    public Celda explotar()
    {
        return new Celda(ubicacion);
    }


}
