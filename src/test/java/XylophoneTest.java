import instruments.Xylophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class XylophoneTest {

    Xylophone xylophone;

    @Before
    public void setUp() {
        xylophone = new Xylophone("Xylophone", 220.00, 299.99, "percussion", "Brown", "African Padauk wood", "WHD", "Orchestral", 37);
    }

    @Test
    public void canGetNumberOfBars() {
        assertEquals(37, xylophone.getNumberOfBars());
    }

    @Test
    public void canHearXylophonePlay() {
        assertEquals("Plinkety plinkety plonk plonk", xylophone.play());
    }
}
