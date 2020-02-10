import instruments.InstrumentType;
import instruments.Keyboard;
import instruments.MaterialType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

        private Keyboard keyboard;

        @Before
        public void before(){
            keyboard = new Keyboard("Tanglewood", "A1 LeftHanded",
                    "Sunburst lefthanded electro acoustic", MaterialType.WOOD, "Natural",
                    InstrumentType.PERCUSSION, 200, 8);
        }

        @Test
        public void canGetMake(){
            assertEquals("Tanglewood", keyboard.getMake());
        }

        @Test
        public void canGetModel(){
            assertEquals("A1 LeftHanded", keyboard.getModel());
        }

        @Test
        public void canGetDescription(){
            assertEquals("Sunburst lefthanded electro acoustic", keyboard.getDescription());
        }


        @Test
        public void canGetMaterial(){
            assertEquals("WOOD", keyboard.getMaterial().toString());
        }

        @Test
        public void canGetColour(){
            assertEquals("Natural", keyboard.getColour());
        }


        @Test
        public void canGetInstrumentType(){
            assertEquals("Natural", keyboard.getColour());
        }

        @Test
        public void canGetBuyPrice(){
            assertEquals(200, keyboard.getBuyPrice(), 0.01);
        }
        @Test
        public void canGetSellPrice(){
            assertEquals(200*1.5, keyboard.getSellPrice(), 0.01);
        }

        @Test
        public void canReturnPlay(){
            assertEquals("Plinky Plonky", keyboard.play());
        }

        @Test
        public void canChangeSellPrice(){
            keyboard.changeSellPrice(2);
            assertEquals(400, keyboard.getSellPrice(), 0.01 );
        }

        @Test
        public void canGetMarkUp(){
            assertEquals(100, keyboard.calculateMarkUp(), 0.01);
        }
    }


