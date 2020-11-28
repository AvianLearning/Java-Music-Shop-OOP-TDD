import instruments.Synthesizer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SynthTest {

    Synthesizer synthesizer;

    @Before
    public void setUp() {
        synthesizer = new Synthesizer("Synth", 1000.00, 1399.00, "keyboard", "Black", "Plastic", "Roland", "Jupiter 80", 76);
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(76, synthesizer.getNumberOfKeys());
    }

    @Test
    public void canHearSynthPlay() {
        assertEquals("Squelch, whirrr, beep beep whooshhhhh", synthesizer.play());
    }

}
