import org.example.Avion;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvionTest {

    // clase de prueba que extienda la clase abstracta "Avion"
    private static class AvionDePrueba extends Avion {
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

    @Test
    public void testVolar() {
        // avión de prueba con una capacidad de combustible de 1000 y un consumo de 10
        Avion avion = new AvionDePrueba(1000, 10);

        // Se prueba que el avión puede volar 100 km
        Assertions.assertEquals(900, avion.volar(10));

        // Se prueba que el avión no puede volar más allá de su capacidad de combustible
        Assertions.assertEquals(0, avion.volar(100));
    }
}
