package items;

import behaviour.IPlay;
import items.Item;

public class Instrument extends Item implements IPlay {
    private InstrumentType instrumentType;
    private String brand;


    public Instrument(double buyingPrice, double sellingPrice, InstrumentType instrumentType, String brand) {
        super(buyingPrice, sellingPrice);
        this.instrumentType = instrumentType;
        this.brand = brand;
    }


    public String getBrand() {
        return brand;
    }
    public String play() {
        return "";
    }
}

