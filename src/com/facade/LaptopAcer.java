package com.facade;

public class LaptopAcer extends Laptop{
    public LaptopAcer(int serialNumber, int price) {
        super(serialNumber, price);
    }

    public LaptopAcer() {
    }

    @Override
    public void calculateModelType() {
        System.out.println("Laptop Acer " + String.valueOf(getSerialNumber())
                + String.valueOf(getPrice()));
    }
}
