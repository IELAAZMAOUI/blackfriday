package com.indev.blackfriday;

public class Product {

    private String productName;
    private int quantity;
    private int price ;

    public Product(int quantity, String productName, int price) {
        this.price = price;
        this.productName = productName;
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int prix) {
        this.price = prix;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product( ) {

    }

    public float getPoucentage() {
        return 0;
    }
}
