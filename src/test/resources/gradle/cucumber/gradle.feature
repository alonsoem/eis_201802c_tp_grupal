Feature: Gradle-Cucumber integration

  Scenario:  Bomberman Se mueve a una celda contigua y la celda esta vacia
    Given Un mapa
    Given una celda vacia a derecha
    When cuando se mueve a una celda vacia
    Then Bomberman cambia su posicion


  Scenario:  Bomberman Se mueve a una celda contigua y la celda esta ocupada por una pared
    Given Un mapa
    Given una celda ocupada por una pared a derecha
    When cuando se mueve a una celda ocupada por una pared
    Then Bomberman NO cambia su posicion
