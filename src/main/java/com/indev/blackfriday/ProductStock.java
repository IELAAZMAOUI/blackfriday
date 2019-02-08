package com.indev.blackfriday;

public class ProductStock extends Product {
    private static float poucentage=0;

    public ProductStock(int i, String capsule, int i1) {
        super(  i,   capsule,   i1);
    }


    public float getPoucentage() {

        return poucentage;
    }
}
