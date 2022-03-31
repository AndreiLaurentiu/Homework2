package com.facade;

public class LaptopAsus extends Laptop {

    public LaptopAsus(int serialNumber, int price) {
        super(serialNumber, price);
    }

    public LaptopAsus() {
    }

    @Override
    public void calculateModelType() {
        System.out.println("Laptop Asus " + String.valueOf(getSerialNumber())
        + String.valueOf(getPrice()));
    }


}
