package org.launchcode.java.studios.class4studio;

import java.util.ArrayList;
import java.util.Date;


public class Menu {

  private Date lastUpdated;
  private ArrayList<MenuItems> menuItems;
  
  public Menu(Date lastUpated, ArrayList<MenuItems> menuItems) {
    this.lastUpdated = lastUpated;
    this.menuItems = menuItems;
  }

  public Date getLastUpdated() {
    return this.lastUpdated;
  }

  public void setLastUpdated() {
    this.lastUpdated = new Date();
  }

  public ArrayList<MenuItems> getMenuItems(){
    return menuItems;
  };

  public void setMenuItems(String menuItem) {
    
  }
}