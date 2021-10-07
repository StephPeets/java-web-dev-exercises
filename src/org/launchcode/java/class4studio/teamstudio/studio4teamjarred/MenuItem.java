package org.launchcode.java.studios.class4studio.teamstudio.studio4teamjarred;

import java.util.*;

public class MenuItem {
    private String name;
    private final String[] categories = {"appetizers", "mains", "desserts"};
    private String description;
    private final Date DATE_ADDED;
    private Double price;
    String category;


    public MenuItem(String name, String description, Double price, int catIndex){
        this.name = name;
        this.description = description;
        this.price = price;
        DATE_ADDED = new Date();
        this.category = categories[catIndex];
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof MenuItem)) {
            return false;
        }
        MenuItem menuItem = (MenuItem) obj;
        return Objects.equals(name, menuItem.name) && Objects.equals(category, menuItem.category) && Objects.equals(description, menuItem.description) && Objects.equals(price, menuItem.price);
    }

    @Override
    public String toString() {
        
         String menuItemAndPrice = 
            this.getName() + "\n" + 
            this.getPrice() + "\n";
        
        return menuItemAndPrice;
    }
    

    public String verbose() {
        return
            "Menu item: " + getName() + "\n" +
            "Category: " + getCategory() + "\n" +
            "Description: " + getDescription() + "\n" +
            "Date added: " + this.DATE_ADDED + "\n" +
            "Price: " + getPrice() + "\n";
    }

    public String[] getCategories() {
        return categories;
    }



    public Date getDATE_ADDED() {
        return DATE_ADDED;
    }

    public String getName() {
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public Double getPrice(){
        return this.price;
    }
    public String getCategory(){
        return this.category;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPrice(Double price){ this.price = price; }



}
