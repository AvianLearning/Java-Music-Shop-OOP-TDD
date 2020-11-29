import org.junit.Before;
import org.junit.Test;
import stock.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp() {
        sheetMusic = new SheetMusic("Sheet music", 5.00, 7.95, "Piano Exam Pieces 2021 & 2022, Grade 4", "ABRSM");
    }

    @Test
    public void canGetTitle() {
        assertEquals("Piano Exam Pieces 2021 & 2022, Grade 4", sheetMusic.getTitle());
    }

    @Test
    public void canGetPublisher() {
        assertEquals("ABRSM", sheetMusic.getPublisher());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(2.95, sheetMusic.calculateMarkup(), 0.01);
    }
}
