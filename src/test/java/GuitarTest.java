import instruments.Guitar;
import instruments.InstrumentType;
import instruments.MaterialType;
import instruments.RangeType;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class GuitarTest {
    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Tanglewood", "A1 LeftHanded",
                "Sunburst lefthanded electro acoustic", MaterialType.WOOD, "Natural",
                InstrumentType.STRING, 15.00, 5, true, false, RangeType.REGULAR);
    }

    @Test
    public void canGetMake(){
        assertEquals("Tanglewood", guitar.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("A1 LeftHanded", guitar.getModel());
    }

    @Test
    public void canGetDescription(){
        assertEquals("Sunburst lefthanded electro acoustic", guitar.getDescription());
    }


    @Test
    public void canGetMaterial(){
        assertEquals("WOOD", guitar.getMaterial().toString());
    }

    @Test
    public void canGetColour(){
        assertEquals("Natural", guitar.getColour());
    }


    @Test
    public void canGetInstrumentType(){
        assertEquals("Natural", guitar.getColour());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(15.00, guitar.getBuyPrice(), 0.01);
    }
    @Test
    public void canGetSellPrice(){
        assertEquals(15*1.5, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(5, guitar.getNumberOfStrings());
    }

    @Test
    public void canGetIsAcoustic(){
        assertEquals(true, guitar.isAcoustic());
    }

    @Test
    public void canGetIsElectric(){
        assertEquals(false, guitar.isElectric());
    }

    @Test
    public void canGetRangeType(){
    assertEquals("REGULAR", guitar.getRangeType().toString());
    }

    @Test
    public void canReturnPlay(){
        assertEquals("Twang", guitar.play());
    }

    @Test
    public void canChangeSellPrice(){
        guitar.changeSellPrice(2);
        assertEquals(30, guitar.getSellPrice(), 0.01 );
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(7.5, guitar.calculateMarkUp(), 0.01);
    }
}
