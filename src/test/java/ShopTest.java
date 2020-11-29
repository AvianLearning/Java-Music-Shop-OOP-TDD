import instruments.Guitar;
import instruments.Synthesizer;
import instruments.Tuba;
import instruments.Xylophone;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import stock.GuitarPedal;
import stock.PacketOfGuitarStrings;
import stock.SheetMusic;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Synthesizer synthesizer;
    Tuba tuba;
    Xylophone xylophone;
    GuitarPedal guitarPedal;
    PacketOfGuitarStrings packetOfGuitarStrings;
    SheetMusic sheetMusic;

    @Before
    public void setUp() {
        shop = new Shop("Ray's Music Exchange");
        guitar = new Guitar("Guitar", 500.00, 700.00, "stringed", "Cherry Red", "Wood", "Fender", "Telecaster", 6);
        synthesizer = new Synthesizer("Synth", 1000.00, 1399.00, "keyboard", "Black", "Plastic", "Roland", "Jupiter 80", 76);
        tuba = new Tuba("Tuba", 6000.00, 7699.00,"brass", "Golden", "brass", "Yamaha", "YBB- 641", 4);
        xylophone = new Xylophone("Xylophone", 220.00, 299.99, "percussion", "Brown", "African Padauk wood", "WHD", "Orchestral", 37);
        guitarPedal = new GuitarPedal("Distortion pedal", 40.00, 66.00, "Electro Harmonix", "Big Muff");
        packetOfGuitarStrings = new PacketOfGuitarStrings("Guitar strings", 4.00, 5.99);
        sheetMusic = new SheetMusic("Sheet music", 5.00, 7.95, "Piano Exam Pieces 2021 & 2022, Grade 4", "ABRSM");
    }

    @Test
    public void checkStockStartsEmpty() {
        assertEquals(0, shop.getNumberOfItemsInStock());
    }

    @Test
    public void checkCanAddItemsToStock() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(synthesizer);
        assertEquals(2, shop.getNumberOfItemsInStock());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(synthesizer);
        shop.removeItemFromStock(guitar);
        assertEquals(1, shop.getNumberOfItemsInStock());
    }
}
