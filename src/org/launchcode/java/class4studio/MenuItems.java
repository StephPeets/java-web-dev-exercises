package org.launchcode.java.studios.class4studio;

import java.util.Date;


public class MenuItems {
  String description;
  String category;
  Double price;
  Date dateCreated;
  boolean isNew;

  public MenuItems() {

  }

  public MenuItems(String description, String category, Double price, Date dateCreated){
    this.description = description;
    this.category = category;
    this.price = price;
    this.dateCreated = dateCreated;
    this.isNew = true;

  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Double getPrice() {
    return this.price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Date getDateCreated() {
    return this.dateCreated;
  }

  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  public boolean isIsNew() {
    return this.isNew;
  }

  public boolean getIsNew() {
    return this.isNew;
  }

  public void setIsNew(boolean isNew) {
    
    this.isNew = isNew;
  }


}

     

