package shop;

import items.noninstruments.InstrumentBag;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ShopTest {
    private Shop shop;
    private InstrumentBag accordionBag;
    private InstrumentBag guitarBag;
    private InstrumentBag drumCover;

    @Before
    public void before() {
        shop = new Shop();
        accordionBag = new InstrumentBag(30.99, 50.00, "Accordion");
        guitarBag = new InstrumentBag(26.99, 33.99, "Guitar");
        drumCover = new InstrumentBag(26.99, 33.99, "Drum");
    }

    @Test
    public void canAddItem() {
        shop.addItem(accordionBag);
        shop.addItem(guitarBag);
        shop.addItem(drumCover);
        assertEquals(3, shop.itemCountInShop());

    }

    @Test
    public void canRemoveItem() {
        shop.addItem(accordionBag);
        shop.addItem(guitarBag);
        shop.addItem(drumCover);
        shop.removeItem(drumCover);
        assertEquals(2, shop.itemCountInShop());
    }

}