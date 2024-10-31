package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    public Menu() {
        this.items = new ArrayList<>();
        this.lastUpdated = new Date();
    }

    public void addItem(MenuItem item) {
        if (findItem(item) == -1) {
            items.add(item);
            lastUpdated = new Date();
        } else {
            System.out.println("Warning: Duplicate item detected. Item not added.");
        }
    }

    public void removeItem(MenuItem item) {
        if (items.remove(item)) {
            lastUpdated = new Date();
        } else {
            System.out.println("Item not found on the menu.");
        }
    }

    public void printMenu() {
        System.out.println("Menu (Last Updated: " + lastUpdated + "):");
        for (MenuItem item : items) {
            item.printItem();
            System.out.println();
        }
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    private int findItem(MenuItem item) {
        return items.indexOf(item);
    }

}
