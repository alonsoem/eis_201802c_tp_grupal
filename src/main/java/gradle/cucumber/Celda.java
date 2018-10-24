package gradle.cucumber;

import javafx.util.Pair;

public class Celda {

    protected Pair<Integer,Integer> ubicacion;

    public Celda (int x, int y){
        ubicacion=new Pair<>(x,y);
    }
    public Celda (Pair<Integer,Integer> ubicacion){
        ubicacion = ubicacion;
    }

    public Pair<Integer, Integer> ocupar(Mapa mapa){
        return new Pair<>(ubicacion.getKey(),ubicacion.getValue());

    }

    public Pair<Integer,Integer> ubicacion(){
        return ubicacion;
    }
    public Celda explotar()
    {
        return this;
    }

}
