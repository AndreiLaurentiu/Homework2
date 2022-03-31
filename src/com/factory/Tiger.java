package com.factory;

public class Tiger implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Raaahhh");
    }

    @Override
    public void playAround() {
        System.out.println("The tiger throws away the bone!");
    }
}
