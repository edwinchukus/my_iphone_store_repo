package com.farmer;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Animals animal = new Animals("Cattle");
        animal.animalEating();
        animal.animalRuning();
        animal.animaJumping();
        animal.animalWalking();
        animal.commandAnimal("walk");


    }
}
