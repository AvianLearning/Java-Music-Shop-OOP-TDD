import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Fender", "Telecaster", "stringed", "Cherry Red", "Wood", 6);
    }

    @Test
    public void canGetGuitarMake() {
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void canGetGuitarModel() {
        assertEquals("Telecaster", guitar.getModel());
    }

    @Test
    public void canGetNumberStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canGetGuitarColour() {
        assertEquals("Cherry Red", guitar.getColour());
    }

    @Test
    public void canGetGuitarType() {
        assertEquals("stringed", guitar.getType());
    }

    @Test
    public void canGetGuitarMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void canHearGuitarPlay() {
        assertEquals("Kerrrraaang!", guitar.play());
    }
}

