package org.launchcode;

import java.util.Date;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private Date addDate;
//    private boolean isNew = isItemNew(addDate);
//    private String newItem;

    public MenuItem(String name, double price, String description, String category, Date date) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.addDate = date;
//        if (isNew) this.newItem = "New Menu Item";
    }

//    public boolean isItemNew(Date addDate) {
//        Date todayDate = new Date();
//        return addDate.getDate() + 10 >= todayDate.getDate() + 3;
//    }



    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Date getAddDate() {
        return addDate;
    }

}


