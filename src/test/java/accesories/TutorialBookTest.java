package accesories;

import accessories.GenreType;
import accessories.LevelType;
import accessories.TutorialBook;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TutorialBookTest {
    private TutorialBook book;

    @Before
    public void before(){
        book = new TutorialBook(10, "This is a book", "A Book", "Some Guy", "Music R US", LevelType.EXPERT, GenreType.FOLK);
    }

    @Test
    public void canChangeSellPrice(){
        book.changeSellPrice(2);
        assertEquals(20, book.getSellPrice(), 0.01);
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(5, book.calculateMarkUp(), 0.01);
    }
}
