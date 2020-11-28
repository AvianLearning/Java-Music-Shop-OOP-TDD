import instruments.Tuba;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TubaTest {

    Tuba tuba;

    @Before
    public void setUp() {
        tuba = new Tuba("brass", "Golden", "brass", "Yamaha", "YBB- 641", 4);
    }

    @Test
    public void canGetNumberOfValves() {
        assertEquals(4, tuba.getNumberOfValves());
    }

    @Test
    public void canHearTubaPlay() {
        assertEquals("Pum pum pum pumpedy rum pum pum", tuba.play());
    }
}
