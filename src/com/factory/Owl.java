package com.factory;

public class Owl implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Hoo-hoo-hoooo");
    }

    @Override
    public void playAround() {
        System.out.println("The owl spinns its head at 360 degress!");
    }
}
