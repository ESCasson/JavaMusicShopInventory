import accessories.GenreType;
import accessories.SheetMusic;
import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    private Shop shop;
    private Recorder recorder;
    private Guitar guitar;
    @Before
    public void before(){
        guitar = new Guitar("Tanglewood", "A1 LeftHanded",
                "Sunburst lefthanded electro acoustic", MaterialType.WOOD, "Natural",
                InstrumentType.STRING, 30.00, 5, true, false, RangeType.REGULAR);
        recorder = new Recorder("Blueys", "Starter", "A recorder", MaterialType.PLASTIC, "Black", InstrumentType.WIND,
                15, "descant");
        shop = new Shop();
    }

    @Test
    public void canCountInvertory(){
        assertEquals(0, shop.countInventory());
    }

    @Test
    public void canSetTill(){
        shop.setTill(300);
        assertEquals(300, shop.getTill(), 0.01);
    }

    @Test
    public void canAddInventory(){
        shop.addInventory(recorder);
        assertEquals(1, shop.countInventory());
    }

    @Test
    public void canRemoveInventory(){
        shop.addInventory(recorder);
        shop.addInventory(recorder);
        shop.removeInventory(0);
        assertEquals(1, shop.countInventory());
    }
    @Test
    public void canCalculatePotentialProfit(){
        SheetMusic sheetMusic = new SheetMusic(12, "this is sheet music", "sheet music", "a publisher", GenreType.FOLK);
        shop.addInventory(recorder);
        shop.addInventory(recorder);
        shop.addInventory(guitar);
        shop.addInventory(sheetMusic);
        assertEquals(36, shop.calculatePotentialProfit(), 0.01);

    }

    @Test
    public void canBuyAnItem(){
        shop.setTill(100);
        shop.buyItem(recorder);
        assertEquals(1, shop.countInventory());
        assertEquals(85, shop.getTill(), 0.01);
    }

//    @Test
//    public void canSelectItemIndex(){
//        shop.addInventory(recorder);
//        shop.addInventory(recorder);
//        shop.addInventory(recorder);
//        shop.addInventory(guitar);
//        assertEquals(3, shop.getItemIndex("Sunburst lefthanded electro acoustic"));
//
//    }

}
