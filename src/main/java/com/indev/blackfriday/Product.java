package com.indev.blackfriday;

public class Product {
    private int prix ;
    private String productName;
    private int quantity;

    public Product(int prix, String productName, int quantity) {
        this.prix = prix;
        this.productName = productName;
        this.quantity = quantity;
    }

    public int getPrix() {
        return prix;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
