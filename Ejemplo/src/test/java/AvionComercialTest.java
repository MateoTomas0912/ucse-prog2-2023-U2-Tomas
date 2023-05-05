import org.example.AvionComercial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvionComercialTest {
    @Test
    public void testVolar(){
        //Avion comercial
        AvionComercial avionComercial = new AvionComercial(1000, 10);

        // el avión puede volar 100 km
        Assertions.assertEquals(100, avionComercial.volar(10));
    }
}
