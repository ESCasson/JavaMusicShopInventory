package accesories;

import accessories.GenreType;
import accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    private SheetMusic sheetMusic;
    @Before
    public void before(){
        sheetMusic  = new SheetMusic(13,"30 pages of great music", "Great Music", "Music R US", GenreType.FOLK);

    }
    @Test
    public void canGetDescription(){
        assertEquals("30 pages of great music", sheetMusic.getDescription());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(13, sheetMusic.getBuyPrice(), 0.01);
    }

    @Test public void canGetSellPrice(){
        assertEquals(13*1.5, sheetMusic.getSellPrice(), 0.01);
    }

    @Test public void canGetTitle(){
        assertEquals("Great Music", sheetMusic.getTitle());
    }

    @Test public void canGetPublisher(){
        assertEquals("Music R US", sheetMusic.getPublisher());
    }

    @Test public void canGetGenre(){
        assertEquals("Pop", sheetMusic.getGenre());
    }

    @Test public void canChangeSellPrice(){
        sheetMusic.changeSellPrice(2);
        assertEquals(26, sheetMusic.getSellPrice(), 0.01);
    }

    @Test public void canGetMarkUp(){
        assertEquals(6.5, sheetMusic.calculateMarkUp(), 0.01);
    }
}
