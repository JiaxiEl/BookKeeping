package com.chrisJx;

import java.util.Date;

public class Item {
    private String itemName;
    private float cost;
    private Date date;

    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public String getItemName(){
        return this.itemName;
    }
    public void setCost(float cost){
        this.cost = cost;
    }
    public float getCost(){
        return this.cost;
    }
    public void setDate(Date date){this.date = date;}
    public Date getDate(){
        return this.date;
    }
}
