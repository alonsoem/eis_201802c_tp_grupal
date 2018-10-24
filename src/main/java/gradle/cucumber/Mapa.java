package gradle.cucumber;

import javafx.util.Pair;

import static java.lang.Integer.parseInt;

public class Mapa {

    private Celda[][] celdas = new Celda[1][1];
    private Pair<Integer, Integer> ubicacionBomberman;
    private Bomberman bomberman;
    private Celda bombas;


    public Mapa(int lado) {
        //creo un mapa cuadrado de lado x lado celdas impares            OK
        celdas = new Celda[lado][lado];
        completarConCeldasVacias();
    }

    public void colocarBomberman(Bomberman unBomberman) {
        ubicacionBomberman = new Pair<>(5, 5);
        bomberman = unBomberman;

    }

    public void completarConCeldasVacias() {
        //Recorre todas las celdas del mapa y le pone una pared.
        int i;
        int j;

        for (i = 1; i < celdas.length; i++) {
            for (j = 0; j < celdas[i].length; j++) {
                celdas[i][j] = new Celda(i, j);
            }
        }
    }



    public void moverBomberman(Direccion unaDireccion) {
        ubicacionBomberman = celdaEnUbicacion(unaDireccion.mover(ubicacionBomberman)).ocupar(this);
    }

    private Celda celdaEnUbicacion(Pair<Integer, Integer> ubicacion) {
        //Retorna la ubicacion destino de bomberman de realizar el movimiento
        return celdas[ubicacion.getKey()][ubicacion.getValue()];
    }

    public Pair<Integer, Integer> ubicacionBomberman() {
        return ubicacionBomberman;
    }



    public void ocuparCelda(Celda unaCelda) {
        celdas[unaCelda.ubicacion().getKey()][unaCelda.ubicacion().getValue()] = unaCelda;
    }

    public Bomberman obtenerBomberman() {
        return bomberman;
    }

    public void soltarBomba()
    {
        ocuparCelda(new CeldaBomba(ubicacionBomberman));
        bombas=celdas[ubicacionBomberman.getKey()][ubicacionBomberman.getValue()];
    }

    public void explotarBombas() {
        //Explota las celdas alcanzadas por las bombas
        ondaExpansivaNS();
        ondaExpansivaEO();

    }

    private void ondaExpansivaEO() {
        int j;

        for (j = bombas.ubicacion().getValue()-3; j < bombas.ubicacion().getValue()+3+1; j++) {
            celdas[j][bombas.ubicacion().getKey()]=celdas[j][bombas.ubicacion().getKey()].explotar();
        }
    }
    private void ondaExpansivaNS() {
        int i;

        for (i = bombas.ubicacion().getKey()-3; i< bombas.ubicacion().getKey()+3+1; i++) {
            celdas[bombas.ubicacion().getValue()][i]=celdas[bombas.ubicacion().getValue()][i].explotar();
        }
    }

    public Celda obtenerCelda(int x, int y) {
        return celdas[x][y];
    }
}
