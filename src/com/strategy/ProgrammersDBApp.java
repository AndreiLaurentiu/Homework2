package com.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProgrammersDBApp {
    public static void main(String[] args) {
        Intern intern = new Intern();
        Junior junior = new Junior();
        SeniorProgrammer seniorProgrammer = new SeniorProgrammer();
        LeadProgrammer leadProgrammer = new LeadProgrammer();
        ArrayList<Programmer> programmers = new ArrayList<Programmer>(Arrays.asList(new CppProgrammer("Radu", 3000, intern, "c++"),
                new JavaProgrammer("Liviu", 4500, junior, "java"),
                new CppProgrammer("Cristi", 9000, seniorProgrammer, "c++"),
                new JavaProgrammer("Marius", 12000, leadProgrammer, "java")));

        System.out.println("""
                This is the database with all the working programmers as of right now.
                You can interrogate, promote and see the current tasks for each individual
                To exit the app write quit. To promote and see the current tasks write in the name of the individual.""");

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first command?");
        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("quit")) {
            switch (input) {
                case "interrogate":
                    for (Programmer programmer : programmers)
                        System.out.println(programmer);
                    break;
                case "promote":
                    System.out.println("Who should get promoted?");
                    input = scanner.nextLine();
                    boolean foundProgrammer = false;
                    for (Programmer programmer : programmers) {
                        if (input.equalsIgnoreCase(programmer.getName())) {
                            foundProgrammer = true;
                            System.out.println("Current role is: " + programmer.getRole());
                            input = scanner.nextLine();
                            switch (input) {
                                case "Junior" -> programmer.promote(new Junior());
                                case "SeniorProgrammer" -> programmer.promote(new SeniorProgrammer());
                                case "LeadProgrammer" -> programmer.promote(new LeadProgrammer());
                                default -> System.out.println("Invalid promotion! Please try again.");
                            }
                        }
                    }
                    if (!foundProgrammer)
                        System.out.println("No programmer with this name!");
                    break;
                case "current tasks":
                    System.out.println("Whose tasks would you like to see?");
                    input = scanner.nextLine();
                    boolean foundProgrammer2 = false;
                    for (Programmer programmer : programmers) {
                        if (input.equalsIgnoreCase(programmer.getName())) {
                            foundProgrammer2 = true;
                            System.out.println(input + ": " + programmer.tasks());
                        }
                    }
                    if (!foundProgrammer2)
                        System.out.println("No programmer with this name!");
                    break;

                default:
                    System.out.println("No such command to available!");

            }
            System.out.println("What command would you like to execute next?");
            input = scanner.nextLine();
        }
        System.out.println("Goodbye!");
    }
}