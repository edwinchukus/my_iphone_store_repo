package com.company;

import animal.database.Animal;
import animal.database.AnimalNames;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Animal farm by George Owell?");
        System.out.println("Here is the list of all our animals");
        AnimalNames names = new AnimalNames();

        for(String key: names.getAllAnimalNames()){
            System.out.println(key);
        }

        System.out.println("Please select fromn any of the animal above");

        Scanner scan = new Scanner(System.in);
        String selectedAniamlName  = scan.nextLine();

        Animal animal = new Animal(selectedAniamlName);

        animal.getScanner(scan);


        animal.performAction();
    }
}
