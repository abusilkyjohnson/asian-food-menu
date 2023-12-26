package com.example.chinesefood;

// our model
public class IndividualDish {

    int itemImG;
    String itemName, itemDetail;

    public IndividualDish(int itemImG, String itemName, String itemDetail) {
        this.itemImG = itemImG;
        this.itemName = itemName;
        this.itemDetail = itemDetail;
    }

    public int getItemImG() {
        return itemImG;
    }

    public void setItemImG(int itemImG) {
        this.itemImG = itemImG;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDetail() {
        return itemDetail;
    }

    public void setItemDetail(String itemDetail) {
        this.itemDetail = itemDetail;
    }
}
