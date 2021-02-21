package items.noninstruments;

import items.Item;

public class GuitarStrings extends Item {

    private String material;

    public GuitarStrings(double buyingPrice, double sellingPrice, String material) {
        super(buyingPrice, sellingPrice);
        this.material = material;
    }
}