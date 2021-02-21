package items;


public abstract class Item {
    public Item(double buyingPrice, double sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    protected double buyingPrice;
    protected double sellingPrice;


    }

