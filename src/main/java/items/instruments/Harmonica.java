package items.instruments;

import items.Instrument;
import items.InstrumentType;

public class Harmonica extends Instrument {

    private String harmonicaType;


    public Harmonica(double buyingPrice, double sellingPrice, InstrumentType instrumentType, String brand, String harmonicaType) {
        super(buyingPrice, sellingPrice, instrumentType, brand);
        this.harmonicaType = harmonicaType;
    }

    public String getHarmonicaType() {
        return harmonicaType;
    }

    public String play(){
        return "plays Once upon a time in the west ";
    }


}
