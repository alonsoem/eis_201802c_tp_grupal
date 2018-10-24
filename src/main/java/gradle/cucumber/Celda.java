package gradle.cucumber;

import javafx.util.Pair;

public class Celda {

    protected Pair<Integer,Integer> miUbicacion;

    public Celda (int x, int y){
        miUbicacion=new Pair<>(x,y);
    }

    public Celda (Pair<Integer,Integer> ubicacion){
        miUbicacion = ubicacion;
    }

    public Pair<Integer, Integer> ocupar(Mapa mapa){
        return new Pair<>(miUbicacion.getKey(),miUbicacion.getValue());

    }

    public Pair<Integer,Integer> ubicacion(){
        return miUbicacion;
    }
    public Celda explotar()
    {
        return this;
    }



    @Override
    public boolean equals(Object obj){

        return obj.getClass().equals(this.getClass());
    }

}
