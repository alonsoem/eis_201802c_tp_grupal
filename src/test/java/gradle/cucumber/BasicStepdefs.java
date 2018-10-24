package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javafx.util.Pair;

import static org.junit.jupiter.api.Assertions.*;

public class BasicStepdefs {
    Mapa mapa;
    Bomberman b;


    @Given("^Un mapa de lado (\\d+) con celdas vacias$")
    public void unMapaDeLado(int lado) throws Throwable {
        mapa = new Mapa(lado);
    }

    @Given("^Bomberman en una celda del mapa$")
    public void bombermanEnUnaCeldaDelMapa() throws Throwable {
        b = new Bomberman();
        mapa.colocarBomberman(b);

    }


    @When ("cuando se mueve a la celda contigua")
    public void cuandoSeMueveAUnaCeldaContiguaVacia()
    {
        mapa.moverBomberman(new Este());

    }



    @Then( "Bomberman cambia su posicion")
    public void bombermanCambiaSuPosicion()
    {
        assertEquals(new Pair<>(6,5),mapa.ubicacionBomberman());
    }


    @Given("^una celda contigua pared$")
    public void unaCeldaContiguaPared() throws Throwable {
        mapa.ocuparCelda(new CeldaPared(6,5));
    }

    @Then("^Bomberman NO cambia su posicion$")
    public void bombermanNOCambiaSuPosicion() throws Throwable {
        assertEquals(new Pair<>(5,5), mapa.ubicacionBomberman());
    }

    @Given("^una celda contigua con enemigo$")
    public void unaCeldaContiguaConEnemigo() throws Throwable {
        mapa.ocuparCelda(new CeldaEnemigo(6,5));
    }

    @Then("^Bomberman muere$")
    public void bombermanMuere() throws Throwable {
        assertFalse(b.estaVivo());
    }

    @Given("^celdas con paredes a su alrededor$")
    public void celdasConParedesASuAlrededor() throws Throwable {
        mapa.ocuparCelda(new CeldaPared(6,5));
        mapa.ocuparCelda(new CeldaPared(7,5));
        mapa.ocuparCelda(new CeldaPared(5,4));
        mapa.ocuparCelda(new CeldaPared(1,1));
    }

    @When("^cuando Bomberman suelta una bomba$")
    public void cuandoBombermanSueltaUnaBomba() throws Throwable {
        mapa.soltarBomba();
    }



    @When("^luego de N segundos las bombas explotan$")
    public void luegoDeNSegundosLasBombasExplotan() throws Throwable {
       mapa.explotarBombas();
    }

    @Then("^celdas con paredes se rompen$")
    public void celdasConParedesSeRompen() throws Throwable {
        assertEquals(mapa.obtenerCelda(1,1),new CeldaPared(1,1));
        assertEquals(mapa.obtenerCelda(5,4),new Celda(5,4));
        assertEquals(mapa.obtenerCelda(6,5),new Celda(6,5));
        assertEquals(mapa.obtenerCelda(7,5),new Celda(7,5));

    }
}
