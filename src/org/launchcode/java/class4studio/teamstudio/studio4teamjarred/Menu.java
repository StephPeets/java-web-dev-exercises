package org.launchcode.java.class4studio.teamstudio.studio4teamjarred;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated = new Date();

    public Menu(ArrayList<MenuItem> menuItems){
        this.menuItems = menuItems;
        this.lastUpdated = new Date();

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

    public void printWholeMenu() {
        System.out.println(this.menuItems);
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
