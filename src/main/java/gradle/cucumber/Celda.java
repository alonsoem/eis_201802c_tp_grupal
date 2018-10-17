package gradle.cucumber;

public class Celda {
    int posX;
    int posY;


    public Celda(int x, int y)
    {
        posX=x;
        posY=y;

    }

    public int getPosX() {
        return posX;
    }

    public int moverADerecha() {
        return posX+=1;
    }


    public int getPosY() {
        return posY;
    }

    public boolean esVacia()
    {
        return false;
    }


}
