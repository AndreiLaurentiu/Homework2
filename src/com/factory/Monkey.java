package com.factory;

public class Monkey implements Animal{

    @Override
    public void makeSound() {
        System.out.println("U-a-a-a");
    }

    @Override
    public void playAround() {
        System.out.println("The monkey jumps on the tallest branch!");
    }
}
