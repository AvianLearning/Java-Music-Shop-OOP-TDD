import instruments.Sythesizer;
import org.junit.Before;
import org.junit.Test;
import sun.awt.image.VSyncedBSManager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SynthTest {

    Sythesizer sythesizer;

    @Before
    public void setUp() {
        sythesizer = new Sythesizer("keyboard", "Black", "Plastic", "Roland", "Jupiter 80", 76);
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(76, sythesizer.getNumberOfKeys());
    }

    @Test
    public void canHearSynthPlay() {
        assertEquals("Squelch, whirrr, beep beep whooshhhhh", sythesizer.play());
    }

}
