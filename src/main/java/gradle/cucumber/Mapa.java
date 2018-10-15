package gradle.cucumber;

public class Mapa {
    int alto;
    int ancho;
    int posXBomberman;
    int posYBomberman;

    public void Mapa(){
        alto=10;
        ancho=10;
    }

    public void colocarBomberman(Bomberman bomberman) {
        posXBomberman=1;
        posYBomberman=1;


    }

    public void moverADerecha(Bomberman bomberman) {
        if (esVaciaADerecha())
        {
            posXBomberman=posXBomberman+1;
        }
    }

    public boolean esVaciaADerecha() {
        return true;
    }

    public int posicionXBomberman() {
        return posXBomberman;
    }

    public int posicionYBomberman() {
        return posYBomberman;
    }

    public boolean estaOcupadaConParedADerecha() {
        return true;
    }
}

