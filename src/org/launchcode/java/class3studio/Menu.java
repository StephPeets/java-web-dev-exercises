package org.launchcode.java.class3studio;

import java.util.Date;
import java.util.ArrayList;

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

  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public ArrayList<MenuItems> getMenuItems(){
    return menuItems;
  };

  public void setMenuItems(String menuItem) {
    
  }
}