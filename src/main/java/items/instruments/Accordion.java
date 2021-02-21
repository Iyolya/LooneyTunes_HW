package items.instruments;

import items.Instrument;
import items.InstrumentType;

public class Accordion extends Instrument {

    private String accordionType;


    public Accordion(double buyingPrice, double sellingPrice, InstrumentType instrumentType, String brand, String accordionType) {
        super(buyingPrice, sellingPrice, instrumentType, brand);
        this.accordionType = accordionType;
    }

    public String getAccordionType() {
        return accordionType;
    }

    public String play(){
        return "plays Sous le ciel de Paris ";
    }


}