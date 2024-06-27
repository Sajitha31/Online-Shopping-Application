package com.project.myshoppingapp;

public class Cart {

    private String iName ;
    private int iPrice;
    private int iImg;

    public Cart(String name, int price, int img) {
        this.iName = iName;
        this.iPrice = iPrice;
        this.iImg = iImg;
    }

    public String getiName() {
        return iName;
    }

    public int getiPrice() {
        return iPrice;
    }

    public int getiImg() {
        return iImg;
    }
}
