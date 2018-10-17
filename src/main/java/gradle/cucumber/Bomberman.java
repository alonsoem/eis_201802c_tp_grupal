package gradle.cucumber;

public class Bomberman {
    Celda celda;



    public Bomberman() {


    }

    public void moverADerecha(Mapa mapa) {
        mapa.moverADerecha(this);
    }
    public void cambiarACelda(Celda unaCelda)
    {
        celda=unaCelda;
    }

    public Celda getCelda() {
        return celda;
    }
}
