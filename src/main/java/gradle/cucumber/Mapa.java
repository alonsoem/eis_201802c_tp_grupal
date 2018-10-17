package gradle.cucumber;

import java.util.ArrayList;
import java.util.List;

public class Mapa {
    Bomberman bomberman;
    List<Celda> celdas = new ArrayList<Celda>();



    public Mapa(){
        celdas.add (new CeldaVacia(1,1));
        celdas.add (new CeldaVacia(2,1));
    }

    public void colocarBomberman(Bomberman bomberman) {
        bomberman.cambiarACelda (celdas.get(1));
        bomberman=bomberman;
    }

    public void moverADerecha(Bomberman bomberman) {
        if (esVaciaADerecha())
        {
            bomberman.cambiarACelda(obtenerCeldaADerecha(bomberman.getCelda()));
        }
    }

    public boolean esVaciaADerecha() {

        return obtenerCeldaADerecha(bomberman.getCelda()).esVacia(); //retorna una celda que esta a la derecha de Bomberman

    }

    private Celda obtenerCeldaADerecha(Celda celdaBomberman) {

        return celdas.get(1);
    }

    public int posicionXBomberman() {
        return bomberman.getCelda().getPosX();
    }

    public int posicionYBomberman() {
        return bomberman.getCelda().getPosY();
    }

    public boolean estaOcupadaConParedADerecha() {
        return true;
    }
}

