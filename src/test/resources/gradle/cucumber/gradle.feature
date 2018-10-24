Feature: Gradle-Cucumber integration

  Scenario:  Bomberman Se mueve a una celda contigua y la celda esta vacia
    Given Un mapa de lado 9 con celdas vacias
    Given Bomberman en una celda del mapa
    When cuando se mueve a la celda contigua
    Then Bomberman cambia su posicion

  Scenario:  Bomberman Se mueve a una celda contigua y la celda es pared
    Given Un mapa de lado 9 con celdas vacias
    Given Bomberman en una celda del mapa
    Given una celda contigua pared
    When cuando se mueve a la celda contigua
    Then Bomberman NO cambia su posicion

  Scenario:  Bomberman Se mueve a una celda contigua y hay un enemigo
    Given Un mapa de lado 9 con celdas vacias
    Given una celda contigua con enemigo
    Given Bomberman en una celda del mapa
    When cuando se mueve a la celda contigua
    Then Bomberman muere


  Scenario:  Bomberman suelta bomba donde se encuentra y rompe aquellas paredes a un radio de 3 casilleros.
    Given Un mapa de lado 9 con celdas vacias
    Given Bomberman en una celda del mapa

    Given celdas con paredes a su alrededor
    When cuando Bomberman suelta una bomba
    When luego de N segundos las bombas explotan
    Then celdas con paredes se rompen