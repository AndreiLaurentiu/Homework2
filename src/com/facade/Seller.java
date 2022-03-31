package com.facade;

public class Seller {
    private final Laptop acer;
    private final Laptop asus;

    public Seller(Laptop acer, Laptop asus) {
        this.acer = acer;
        this.asus = asus;
    }

    public void acerSale(){
        acer.calculateModelType();
    }

    public void asusSale(){
        asus.calculateModelType();
    }
}
