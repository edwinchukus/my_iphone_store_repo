package com.farmer;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Animals animalOne = new Animals("Cattle");
        animalOne.animalEating();
        animalOne.animalRuning();
        animalOne.animaJumping();
        animalOne.animalWalking();
        animalOne.buyerVisitFarm();

        Animals animalTwo = new Animals("Sheep");
        animalTwo.animalEating();
        animalTwo.animalRuning();
        animalTwo.animaJumping();
        animalTwo.animalWalking();
        animalTwo.buyerVisitFarm();

        Animals animalThree = new Animals("Goat");
        animalThree.animalEating();
        animalThree.animalRuning();
        animalThree.animaJumping();
        animalThree.animalWalking();
        animalThree.buyerVisitFarm();
    }
}
