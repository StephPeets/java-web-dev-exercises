package org.launchcode.java.class4studio.jarredmenu.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

    RestaurantMenu menu = new RestaurantMenu();
    MenuItem fry = new MenuItem("fries", "appetizer", "crispy fried potatoes", 4.0, new Date());
    
    System.out.println(fry.toString());
    System.out.println(fry.toString());
    }
}
