package items.instruments;

import items.Instrument;
import items.InstrumentType;

public class Drum extends Instrument {

    private String drumType;


    public Drum(double buyingPrice, double sellingPrice, InstrumentType instrumentType, String brand, String drumType) {
        super(buyingPrice, sellingPrice, instrumentType, brand);
        this.drumType = drumType;
    }

    public String getDrumType() {
        return drumType;
    }

    public String play(){
        return "BaDumTss";
    }


}
