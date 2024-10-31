package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public boolean isNewItem() {
        return isNew;
    }

    public void printItem() {
        System.out.println("Category: " + category);
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
        System.out.println("New Item: " + (isNew ? "Yes" : "No"));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MenuItem menuItem = (MenuItem) obj;
        return description.equals(menuItem.description) && category.equals(menuItem.category);
    }
}
