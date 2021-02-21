package items;

import items.noninstruments.GuitarStrings;
import items.noninstruments.MusicStand;
import items.noninstruments.InstrumentBag;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonInstrumentTest{

    private GuitarStrings guitarStrings;
    private MusicStand musicStand;
    private InstrumentBag instrumentBag;

    @Before
    public void before(){
       guitarStrings = new GuitarStrings(1.99, 6.99, "nylon");
       musicStand = new MusicStand(24.00, 30.00, "Thomann");
       instrumentBag = new InstrumentBag(1.99, 6.99, "Guitar");
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(1.99, guitarStrings.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(30.00, musicStand.getSellingPrice(), 0.01);
    }

    @Test
    public void canSetSellingPrice() {
        assertEquals(8.00, instrumentBag.setSellingPrice(8.00), 0.01);
    }


}