package com.indev.blackfriday;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Product> products;
    private Boolean isAblackFriday=false;

    public Company() {
        products=new ArrayList<Product>();
    }

    public float sells(String capsule) throws RuntimeException {

Product product=getProductByName(capsule);
        System.out.println("nf"+isAblackFriday);
        if(!isAblackFriday) {
            if (product.getQuantity() >= 5) {
                float poucentage = (float) ((float) 5 * (product.getPrice() * 20.0 / 100));

                product.setQuantity(product.getQuantity() - 5);
                products.set(getidProductinArray(capsule), product);
                Product product2 = new ProductsSells(5, capsule, product.getPrice());
                products.add(product2);
                return 5 * product.getPrice() + poucentage;
            } else {
                throw new RuntimeException(" ");
            }
        }
        else
        {
            if (product.getQuantity() >= 5) {
                System.out.println("heeere");
                float poucentage = (float) ((float) 10 * (product.getPrice() * 10.0 / 100));
                System.out.println("black"+poucentage);
                product.setQuantity(product.getQuantity() - 10);
                products.set(getidProductinArray(capsule), product);
                Product product2 = new ProductsSells(10, capsule, product.getPrice());
                products.add(product2);
                return 10 * product.getPrice() + poucentage;
            } else {
                throw new RuntimeException(" ");
            }
        }

    }

    public void stock(int i, String capsule, int i1) {
        Product product=new ProductStock(i,capsule,i1);
        products.add(product);

    }

    public Company to(int i) {

        return this;

    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        float pr=0;
        int somme=0;
        for (Product p: products)
        {

            System.out.println(p.getClass().getName());


            somme+=p.getPrice()*p.getQuantity()+p.getPoucentage();

            System.out.println(somme);
        }


        return somme;
    }

    public Company blackFriday() {
        this.isAblackFriday=true;
        return this;
    }
    public Product getProductByName(String nameP)
    {
        Product product=new Product();
        for (Product p: products)
        {

            if(p.getProductName().equals(nameP))
            {
                product.setProductName(p.getProductName());
                product.setPrice(p.getPrice());
                product.setQuantity(p.getQuantity());
                break;

            }
        }
        return product;
    }
    public int getidProductinArray(String nameP)
    {
      int i=-1,k=-1;
        for (Product p: products)
        {
            i++;
            if(p.getProductName().equals(nameP))
            {
                    k =i;
                break;

            }
        }
        return k;
    }
}
