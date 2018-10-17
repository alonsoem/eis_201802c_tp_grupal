Feature: Gradle-Cucumber integration

  Scenario:  Bomberman Se mueve a una celda contigua y la celda esta vacia
    Given Un mapa
    Given Un bomberman en el mapa
    Given una celda vacia a derecha
    When cuando se mueve a una celda vacia
    Then Bomberman cambia su posicion


