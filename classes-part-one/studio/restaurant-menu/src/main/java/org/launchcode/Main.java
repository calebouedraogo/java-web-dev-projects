package org.launchcode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu myMenu = new Menu();

        MenuItem item1 = new MenuItem(12.99, "Caesar Salad", "Appetizer", true);
        MenuItem item2 = new MenuItem(24.99, "Steak", "Main Course", false);
        MenuItem item3 = new MenuItem(7.99, "Chocolate Cake", "Dessert", true);

        myMenu.addItem(item1);
        myMenu.addItem(item2);
        myMenu.addItem(item3);

        // This will print full menu
        myMenu.printMenu();

        // This will add a duplicate item and attempt removal
        MenuItem duplicateItem = new MenuItem(12.99, "Caesar Salad", "Appetizer", true);
        myMenu.addItem(duplicateItem);

        // This removes item1
        myMenu.removeItem(item1);

        // This will print menu after modifications
        myMenu.printMenu();

    }
}
