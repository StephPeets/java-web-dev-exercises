package org.launchcode.java.class4studio.jarredmenu.company;
import java.util.ArrayList;
import java.util.Date;

public class RestaurantMenu {
    private ArrayList<MenuItem> itemsOnMenu = new ArrayList<>();

    public RestaurantMenu(ArrayList<MenuItem> itemsOnMenu, ArrayList<MenuItem> newMenuItems, Date lastUpdated){
        this.itemsOnMenu = itemsOnMenu;

    }

    public RestaurantMenu(){

    }
    public ArrayList<MenuItem> getItemsOnMenu(){
        return this.itemsOnMenu;
    }

    public Date getLastUpdated(){
        return new Date();
    }

    public void setItemsOnMenu(MenuItem aMenuItem){
        this.itemsOnMenu.add(aMenuItem);

    }

    public String isNewItem(MenuItem item) {
        if (item.getIsNew() == true) {
            return "New Item";
        }
    }

    public void addToMenuItem(MenuItem item) {
        for(MenuItem dish : this.itemsOnMenu)
            if (item.equals(dish)) {
                System.out.println("Duplicate item.");
                return;
        } itemsOnMenu.add(item);
    }

    public void removeFromMenu(Menu item) {
        for (MenuItem dish : this.itemsOnMenu)
            if (item.equals(dish)) {
                itemsOnMenu.remove(item);
        } else {
            break;
        }
    }

    public void printWholeMenu() {
        System.out.println(this.itemsOnMenu);
    }

    public void printMenuItem(MenuItem item) {
        for (MenuItem dish : this.itemsOnMenu)
            if (item.equals(dish)) {
                System.out.println(dish.toString());
            } else {
                System.out.println("No such item");
            }
    }

}
