import org.example.Avion;
import org.example.CalculadorCombustible;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadorCombustibleTest {

    @Test
    public void calcularCombustibleTest(){
        Avion avion = mock(Avion.class);
        //Especifico el funcionamiento que tomara la funcion volar (el valor es aleatorio y no calculado)
        when(avion.volar(5)).thenReturn(50);

        //Instancio la clase del calculador de combustible
        CalculadorCombustible calculadorCombustible = CalculadorCombustible.getInstance();

        //Proceso los datos con el mock creado de avion
        int resultadoReal = calculadorCombustible.calcularCombustible(avion, 5);
        int resultadoEsperado = 50;

        Assertions.assertEquals(resultadoEsperado, resultadoReal);
    }
}
