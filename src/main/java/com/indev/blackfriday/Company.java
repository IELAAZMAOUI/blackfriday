package com.indev.blackfriday;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Product> products;

    public Company() {
        products=new ArrayList<Product>();
    }

    public float sells(String capsule) {
        return 0;
    }

    public void stock(int i, String capsule, int i1) {
        Product product=new Product(i,capsule,i1);
        products.add(product);

    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        int somme=0;
        for (Product p: products)
        {
            somme+=p.getPrix()*p.getQuantity();
        }


        return somme;
    }

    public Company blackFriday() {
        return this;
    }
}
