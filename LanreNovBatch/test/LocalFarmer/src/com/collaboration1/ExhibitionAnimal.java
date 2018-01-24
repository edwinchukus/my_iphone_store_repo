package com.collaboration1;


import java.util.Scanner;

/**
 * Created by LanreSarumi on 08/12/2016.
 */
public class ExhibitionAnimal {

    public static void main(String [] args){

        String FarmAnimals[];
        FarmAnimals = new String[3];
        FarmAnimals[0] = "Goat";
        FarmAnimals[1] = "Cattle";
        FarmAnimals[2] = "Sheep";
    }


    public static void select(){
        System.out.println("Please select farm Animal");

        Scanner scanner = new Scanner(System.in);
        String FarmAnimal = scanner.nextLine();


        if (FarmAnimal.contains("Goat")) {
            System.out.println(FarmAnimal + " is jumping");
            System.out.println(FarmAnimal + " is walking");
            System.out.println(FarmAnimal + " is running");
            System.out.println(FarmAnimal + " is eating");


        }else if (FarmAnimal.contains("Sheep"))  {
            System.out.println(FarmAnimal + " is jumping");
            System.out.println(FarmAnimal + " is walking");
            System.out.println(FarmAnimal + " is running");
            System.out.println(FarmAnimal + " is eating");


        }else if (FarmAnimal.contains("Cattle")) {
        System.out.println(FarmAnimal + " is jumping");
        System.out.println(FarmAnimal + " is walking");
        System.out.println(FarmAnimal + " is running");
        System.out.println(FarmAnimal + " is eating");

        }
    }
}





