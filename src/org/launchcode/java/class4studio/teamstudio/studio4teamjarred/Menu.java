package org.launchcode.java.studios.class4studio.teamstudio.studio4teamjarred;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {

    private Date lastUpdated = new Date();

//TODO: should menu items even be in this class?

    private ArrayList<MenuItem> menuItems = new ArrayList<>();

//TODO: make this constructor make sense (maybe constructor just lastUpdated?)

    public Menu(){
        this.menuItems = menuItems;
        this.lastUpdated = new Date();

    }

//TODO: find out how to separate menu items into their respective categories when printing out menu

    @Override
    public String toString() {
        return String.format("Welcome to the Restaurant!\n" +
                "Appetizers: %s\n" +
                "Mains: \n" +
                "Desserts: \n" +
                "Menu last updated: %s", menuItems, lastUpdated);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Menu)) {
            return false;
        }
        Menu menu = (Menu) obj;
        return Objects.equals(menuItems, menu.menuItems) && Objects.equals(lastUpdated, menu.lastUpdated);
    }

    public void addNewMenuItem(MenuItem item) {
        for(MenuItem dish : this.menuItems)
            if (item.equals(dish)) {
                System.out.println("Duplicate item.");
                return;
        } menuItems.add(item);
    }

    public void removeFromMenu(MenuItem item) {
        for (MenuItem dish : this.menuItems)
            if (dish.equals(item)) {
                menuItems.remove(dish);
        } else {
            break;
        }
    }

    public void printMenu() {
        System.out.println(this.toString());
    }

    public void printMenuItem(MenuItem item) {
        for (MenuItem dish : this.menuItems)
            if (item.equals(dish)) {
                System.out.println(dish.toString());
            } else {
                System.out.println("No such item");
            }
    }

}
