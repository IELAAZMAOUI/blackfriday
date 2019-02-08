package com.indev.blackfriday;

public class ProductsSells extends Product {
    private float poucentage;
    private  Boolean BlackBriday=false;
    public ProductsSells(int i, String capsule, int i1) {
        super(  i,   capsule,   i1);
    }
    public void setPoucentage(float poucentage) {
        this.poucentage = poucentage;
    }

    public float getPoucentage() {

        float poucentage= (float) ((float) 5*(this.getPrice()*20.0/100));
        if(this.getBlackBriday()) poucentage= (float) ((float) 10*(this.getPrice()*10.0/100));
        return poucentage;
    }

    public Boolean getBlackBriday() {
        return BlackBriday;
    }

    public void setBlackBriday(Boolean blackBriday) {
        BlackBriday = blackBriday;
    }
}
