package shop;

import items.Item;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Item> stock;

    public Shop() {
        this.stock = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.stock.add(item);
    }

    public void removeItem(Item item) {
        this.stock.remove(item);
    }

    public int itemCountInShop() {
        return this.stock.size();
    }
}
