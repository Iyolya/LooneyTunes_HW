package items.instruments;

import items.Instrument;
import items.InstrumentType;

public class Piano extends Instrument {

    private String pianoType;


    public Piano(double buyingPrice, double sellingPrice, InstrumentType instrumentType, String brand, String pianoType) {
        super(buyingPrice, sellingPrice, instrumentType, brand);
        this.pianoType = pianoType;
    }

    public String getPianoType() {
        return pianoType;
    }

    public String play(){
        return "plays Clair de Lune";
    }


}
