package com.facade;

public abstract class Laptop {
    private int serialNumber;
    private int price;

    public Laptop(int serialNumber, int price) {
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public Laptop() {
    }

    public int getSerialNumber(){
        return serialNumber;
    };
    public int getPrice(){
        return price;
    };

    public abstract void calculateModelType();

}
