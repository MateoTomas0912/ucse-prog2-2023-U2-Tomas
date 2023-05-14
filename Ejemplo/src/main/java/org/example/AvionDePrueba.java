package org.example;

import org.example.Avion;

// clase de prueba que extienda la clase abstracta "Avion"
public class AvionDePrueba extends Avion {
        public AvionDePrueba(int capacidadCombustible, int consumoCombustible) {
            super(capacidadCombustible, consumoCombustible);
        }

        // método abstracto "volar" de la clase "Avion"
        public int volar(int distancia) {
            int combustibleConsumido = distancia * this.getConsumoCombustible();
            if (combustibleConsumido >= this.getCapacidadCombustible()) {
                return 0;
            }
            return this.getCapacidadCombustible() - combustibleConsumido;
        }

}
