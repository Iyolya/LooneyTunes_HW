package items.noninstruments;

import items.Item;

public class InstrumentBag extends Item {

    private String intrumentType;

    public InstrumentBag(double buyingPrice, double sellingPrice, String intrumentType) {
        super(buyingPrice, sellingPrice);
        this.intrumentType = intrumentType;
    }
}
