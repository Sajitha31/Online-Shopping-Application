package com.project.myshoppingapp;

public class Product {

    private String productName;
    private String productId;
    private int productPrice;
    private int productImage;
    private int productQty;
    private String productDes;

    public Product(String productName, String productId, int productPrice, int productImage, int productQty, String productDes){
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.productImage = productImage;
        this.productQty = productQty;
        this.productDes = productDes;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public int getProductQty() {
        return productQty;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

    public String getProductDes() {
        return productDes;
    }

    public void setProductDes(String productDes) {
        this.productDes = productDes;
    }
}
