import org.junit.Before;
import org.junit.Test;
import stock.GuitarStringType;
import stock.PacketOfGuitarStrings;

import static org.junit.Assert.assertEquals;

public class PacketOfGuitarStringsTest {

    PacketOfGuitarStrings packetOfGuitarStrings;

    @Before
    public void setUp() {
        packetOfGuitarStrings = new PacketOfGuitarStrings("Guitar strings", 4.00, 5.99);
    }

    @Test
    public void packetOfStringsStartsEmpty() {
        assertEquals(0, packetOfGuitarStrings.getStrings().size());
    }

    @Test
    public void canAddStringsToPacket() {
        packetOfGuitarStrings.addStrings(GuitarStringType.LOW_E);
        packetOfGuitarStrings.addStrings(GuitarStringType.A);
        packetOfGuitarStrings.addStrings(GuitarStringType.D);
        packetOfGuitarStrings.addStrings(GuitarStringType.G);
        packetOfGuitarStrings.addStrings(GuitarStringType.B);
        packetOfGuitarStrings.addStrings(GuitarStringType.HIGH_E);
        assertEquals(6, packetOfGuitarStrings.getStrings().size());
    }

    @Test
    public void canFindGaugeOfTopEString() {
        packetOfGuitarStrings.addStrings(GuitarStringType.HIGH_E);
        assertEquals(10, packetOfGuitarStrings.getStrings().get(0).getGauge());
    }

}

