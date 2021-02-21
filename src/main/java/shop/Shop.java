package shop;

import items.Item;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Item> stock;

    public Shop(ArrayList<Item> stock) {
        this.stock = stock;
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
