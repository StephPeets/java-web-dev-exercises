package org.launchcode.java.class4studio.jarredmenu.company;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private String name;
    private String category;
    private String description;
    private Date dateAdded;
    private Double price;

    public MenuItem(String name, String category, String description, Double price, Date dateAdded){
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.dateAdded = new Date();

    }

    public MenuItem(){

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof MenuItem)) {
            return false;
        }
        MenuItem menuItem = (MenuItem) obj;
        return Objects.equals(name, menuItem.name) && Objects.equals(category, menuItem.category) && Objects.equals(description, menuItem.description) && Objects.equals(dateAdded, menuItem.dateAdded) && Objects.equals(price, menuItem.price);
    }

    public String simpleMenuItem() {
        return
            getName() + " $" + getPrice() + "\n" +
            getDescription() + "\n";
            // text literals
    }
    

    @Override
    public String toString() {
        return            
            "Menu item: " + getName() + "\n" +
            "Category: " + getCategory() + "\n" +
            "Description: " + getDescription() + "\n" +
            "Date added: " + getDateAdded() + "\n" +
            "Price: " + getPrice() + "\n";
    }
    
    public String getName() {
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }
    public String getDescription(){
        return this.description;
    }
    public Date getDateAdded(){
        return this.dateAdded;
    }
    public Double getPrice(){
        return this.price;
    }

    public void setName(String aName){
        this.name = aName;
    }
    public void setCategory(String aCategory){
        this.category = aCategory;
    }
    public void setDescription(String aDescription){
        this.description = aDescription;
    }
    public void setDateAdded(Date aDateAdded){
        this.dateAdded = aDateAdded;
    }
    public void setPrice(Double aPrice){
        this.price = aPrice;
    }
}
