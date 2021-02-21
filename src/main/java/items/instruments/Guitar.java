package items.instruments;

import items.Instrument;
import items.InstrumentType;

public class Guitar extends Instrument {

    private String guitarType;


    public Guitar(double buyingPrice, double sellingPrice, InstrumentType instrumentType, String brand, String guitarType) {
        super(buyingPrice, sellingPrice, instrumentType, brand);
        this.guitarType = guitarType;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public String play(){
        return "plays something from Hendrix";
    }


}
