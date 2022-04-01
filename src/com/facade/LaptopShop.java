package com.facade;

import java.util.Scanner;

public class LaptopShop {
    public static void main(String[] args) {
        LaptopAcer laptopAcer = new LaptopAcer(123, 2500);
        LaptopAsus laptopAsus = new LaptopAsus(234, 3000);
        Seller seller = new Seller(laptopAcer, laptopAsus);

        System.out.println("""
                Welcome to your online Laptop shop!
                For today, we have have for sale Acer and Asus laptops.
                To inspect the information about each type, just type acer or asus.
                Write quit to exit the app.""");

        Scanner scanner = new Scanner(System.in);
        System.out.println("What brand of laptop would you like to see?");
        String input = scanner.nextLine();
        while(!input.equalsIgnoreCase("quit")){
            switch (input){
                case "asus" -> seller.asusSale();
                case "acer" -> seller.acerSale();
                default -> System.out.println("No such laptop in store!");
            }
            System.out.println("What brand would you like to see next?");
            input = scanner.nextLine();
        }
        System.out.println("Come again!");
    }
}
