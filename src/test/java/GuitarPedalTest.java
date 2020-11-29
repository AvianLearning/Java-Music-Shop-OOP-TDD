import org.junit.Before;
import org.junit.Test;
import stock.GuitarPedal;

import static org.junit.Assert.assertEquals;

public class GuitarPedalTest {

    GuitarPedal guitarPedal;

    @Before
    public void setUp() {
        guitarPedal = new GuitarPedal("Distortion pedal", 40.00, 66.00, "Electro Harmonix", "Big Muff");
    }

    @Test
    public void canGetDescription() {
        assertEquals("Distortion pedal", guitarPedal.getDescription());
    }

    @Test
    public void canGetMake() {
        assertEquals("Electro Harmonix", guitarPedal.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Big Muff", guitarPedal.getModel());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(40.00, guitarPedal.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetRetailPrice() {
        assertEquals(66.00, guitarPedal.getRetailPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(26.00, guitarPedal.calculateMarkup(), 0.01);
    }
}
