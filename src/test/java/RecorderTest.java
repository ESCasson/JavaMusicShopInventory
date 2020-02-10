import instruments.InstrumentType;
import instruments.MaterialType;
import instruments.Recorder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecorderTest {

    private Recorder recorder;

    @Before
    public void before(){
        recorder = new Recorder("Tanglewood", "A1 LeftHanded",
                "Sunburst lefthanded electro acoustic", MaterialType.WOOD, "Natural",
                InstrumentType.WIND, 12, "Descant");
    }

    @Test
    public void canGetMake(){
        assertEquals("Tanglewood", recorder.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("A1 LeftHanded", recorder.getModel());
    }

    @Test
    public void canGetDescription(){
        assertEquals("Sunburst lefthanded electro acoustic", recorder.getDescription());
    }


    @Test
    public void canGetMaterial(){
        assertEquals("WOOD", recorder.getMaterial().toString());
    }

    @Test
    public void canGetColour(){
        assertEquals("Natural", recorder.getColour());
    }


    @Test
    public void canGetInstrumentType(){
        assertEquals("Natural", recorder.getColour());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(12, recorder.getBuyPrice(), 0.01);
    }
    @Test
    public void canGetSellPrice(){
        assertEquals(12*1.5, recorder.getSellPrice(), 0.01);
    }

    @Test
    public void canReturnPlay(){
        assertEquals("toot toot", recorder.play());
    }

    @Test
    public void canChangeSellPrice(){
        recorder.changeSellPrice(2);
        assertEquals(24, recorder.getSellPrice(), 0.01 );
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(6, recorder.calculateMarkUp(), 0.01);
    }

    @Test
    public void canGetRange(){
        assertEquals("Descant", recorder.getRange());
    }

}
