package gradle.cucumber;

public class CeldaVacia extends Celda{

    public CeldaVacia(int x, int y)
    {
        super(x,y);
    }

    public boolean esVacia()
    {
        return true;
    }
}
