package behaviour;

import items.InstrumentType;

public interface ISell {

    InstrumentType getInstrumentType();
    double getBuyingPrice();
    double getSellingPrice();
}