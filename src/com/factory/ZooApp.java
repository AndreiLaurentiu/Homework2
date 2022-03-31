package com.factory;

import java.util.Scanner;

public class ZooApp {
    public static void main(String[] args) {
        System.out.println("""
                Hello and welcome to your local virtual zoo!
                Today on display we have a tiger, an owl and a monkey!
                To select witch animal you want to observe just type in its name (tiger/ owl/ monkey).
                The animals can play or make a sound (play/sound).
                After each command please press enter.
                When you are done interacting with an animal type next.
                To close the app type quit.""");

        Scanner scanner = new Scanner(System.in);
        AnimalFactory animalFactory = new AnimalFactory();
        System.out.print("Write your desired animal: ");
        String input1 = scanner.nextLine();
        while (!input1.equalsIgnoreCase("quit")){
            Animal currentAnimal = animalFactory.createAnimal(input1);
            if(currentAnimal == null) {
                System.out.println("Incorrect spelling or the animal is not for display: " + input1 + "\n" +
                        "Try to write again your desired animal.");
                input1 = scanner.nextLine();
                continue;
            }
            System.out.println("What would you like to see from the animal?");
            String input2 = scanner.nextLine();
            while(!input2.equalsIgnoreCase("next")) {
                switch (input2) {
                    case "play" -> currentAnimal.playAround();
                    case "sound" -> currentAnimal.makeSound();
                    case "quit" -> {
                        System.out.println("Have a good day!");
                        return;
                    }
                    default ->
                        System.out.println("Incorrect spelling or the animal can't perform the task!\n" +
                                "Try again to write what the animal should do or next to choose another animal!");
                }
                input2 = scanner.nextLine();
            }
            System.out.print("Write your next desired animal: ");
            input1 = scanner.nextLine();
        }
        System.out.println("Have a good day!");
    }
}
