package org.launchcode.java.studios.class4studio.teamstudio.studio4teamjarred;

public class Main {

    public static void main(String[] args) {
	// write your code here
    MenuItem fries = new MenuItem("fries","crispy fried potatoes", 3.99, 0);
    MenuItem vanillaIceCream = new MenuItem("vanilla ice cream", "handmade with real vanilla beans", 4.9, 2);
    Menu newMenu = new Menu();
    newMenu.addNewMenuItem(fries);
    newMenu.addNewMenuItem(vanillaIceCream);
    newMenu.printMenu();
    System.out.println(fries.verbose());
    }
}
