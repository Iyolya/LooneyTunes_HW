package instrumentTests;
import items.InstrumentType;
import items.instruments.Accordion;
import items.instruments.Drum;
import items.instruments.Guitar;
import items.instruments.Harmonica;
import items.instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {
    private Accordion Accordion;
    private Drum drum;
    private Guitar guitar;
    private Harmonica harmonica;
    private Piano piano;


    @Before
    public void before() {
        harmonica = new Harmonica(10.99, 20.99, InstrumentType.HARMONICA, "Hammond", "G");
        piano = new Piano(900.00, 1300.00, InstrumentType.PIANO, "Fazioli", "Upright");
    }

    @Test
    public void canGetHarmonicaType() {
        assertEquals("G", harmonica.getHarmonicaType());
    }

    @Test
    public void canGetBrand() {
        assertEquals("Fazioli", piano.getBrand());
    }

    @Test
    public void instrumentWorksProperly() {
        assertEquals("plays Clair de Lune", piano.play());
    }

    @Test
    public void checkBuyingPrice() {
        assertEquals(900.00, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void checkSellingPrice() {
        assertEquals(1300.00, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canChangeSellingPrice() {
        assertEquals(1150.00, piano.setSellingPrice(1150.00), 0.01);
    }


}
