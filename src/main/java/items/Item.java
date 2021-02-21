package items;


public abstract class Item {
    private double buyingPrice;
    private double sellingPrice;


    public Item(double buyingPrice, double sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
        return sellingPrice;
    }
}

