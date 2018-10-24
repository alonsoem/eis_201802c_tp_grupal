package gradle.cucumber;

import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.util.Pair;

public class Bomberman {
    private Boolean estaVivo=true;

    public Bomberman()
    {   //Crea un bomberman y seteo el mapa en el que esta ubicado y lo coloco
    }

    public void morir()
    {
        estaVivo=false;
    }
    public Boolean estaVivo(){
        return estaVivo;
    }


}
