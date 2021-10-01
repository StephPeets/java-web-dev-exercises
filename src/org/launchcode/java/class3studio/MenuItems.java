package org.launchcode.java.class3studio;

import java.util.Date;


public class MenuItems {
  String description;
  String category;
  Double price;
  Date dateCreated;
  boolean isNew;

  public MenuItems(String description, String category, Double price, Date dateCreated, boolean isNew){
    this.description = description;
    this.category = category;
    this.price = price;
    this.dateCreated = dateCreated;
    this.isNew = isNew;

  }

  public String getDescription() {
    return this.description;
  }

  public String getCategory() {
    return this.category;
  }

  public Double getPrice() {
    return this.price;
  }

  public Date getDateCreated() {
    return this.dateCreated;
  }

  public boolean isNew() {
    return this.isNew;
  }

}

     

