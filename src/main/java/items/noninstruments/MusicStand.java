package items.noninstruments;

import items.Item;

public class MusicStand extends Item {

    private String brand;

    public MusicStand(double buyingPrice, double sellingPrice, String brand) {
        super(buyingPrice, sellingPrice);
        this.brand = brand;
    }
}