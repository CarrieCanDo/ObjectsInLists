package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalList {

    public static void main(String[] args) {
        // Create a list to store Animal objects
        List<Animal> animals = new ArrayList<>();

        // Instantiate Scanner to scan text from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {
            System.out.print("Please enter a name: ");
            String animalName = scanner.nextLine();

            // Break the loop if the user enters nothing
            if (animalName.isEmpty()) {
                break;
            }

            System.out.print("Is it a dog? Yes or no: ");
            String isDogInput = scanner.nextLine();
            boolean isDog = isDogInput.equalsIgnoreCase("yes");

            // Create Animal object and add to the list
            Animal animal = new Animal(animalName, isDog);
            animals.add(animal);
        }

        System.out.println();
        // Print the list of animals using the toString method
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " is a dog = " + animal.isDog());
        }

        // Close the scanner
        scanner.close();
    }
}


