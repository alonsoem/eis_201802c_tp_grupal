package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicStepdefs {
    Mapa mapa;
    Bomberman b;

    @Given("Un mapa")
    public void creoUnMapaVacio() throws Throwable {
        mapa = new Mapa();
    }

    @Given("Un bomberman en el mapa")
    public void unBombermanEnElMapa() throws Throwable {
        b = new Bomberman();
        mapa.colocarBomberman(b);
    }

    @Given("una celda vacia a derecha")
    public boolean tengoUnaCeldaVaciaADerecha() throws Throwable {
        return mapa.esVaciaADerecha();
    }

    @When ("cuando se mueve a una celda vacia")
    public void moverseAUnaCelda(){
        b.moverADerecha(mapa);
    }

    @Then( "Bomberman cambia su posicion")
    public void bombermanTienePosicionNueva(){
        assertEquals(2, mapa.posicionXBomberman());
        assertEquals(1, mapa.posicionYBomberman());
    }

    @Given("^una celda ocupada por una pared a derecha$")
    public boolean celdaConPared() throws Throwable {
        return mapa.estaOcupadaConParedADerecha();
    }

    @When ("cuando se mueve a una celda ocupada por una pared")
    public void moverseAUnaCeldaOcupada(){
        b.moverADerecha(mapa);

    }

    @Then("^Bomberman NO cambia su posicion$")
    public void bombermanNOCambiaSuPosicion(){
        assertEquals(1, mapa.posicionXBomberman());
        assertEquals(1, mapa.posicionYBomberman());
    }

}
