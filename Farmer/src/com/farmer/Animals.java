package com.farmer;

/**
 * Created by dannyolu on 07/12/2016.
 */
public class Animals {

    private String animalName;
    private String buyerDemand;
    private String animalEat;
    private String animalRun;
    private String animalWalk;
    private String animalJump;
    private String Cattle;
    private String Sheep;


    public Animals(String animalName) {
        this.animalName = animalName;

    }

    public String getAnimalName() {
        return animalName;
    }

    public void animalEating() {
        System.out.println("Eating");
    }

    public void animalRuning() {
        System.out.println("Running");
    }

    public void animalWalking() {
        System.out.println("Walking");
    }

    public void animaJumping() {
        System.out.println("Jumping");
    }


    public void buyerVisitFarm() {
        if (buyerDemand == Cattle) {
            System.out.println("My name is Cattle and i can talk");
        } else if (buyerDemand == Cattle) {
            System.out.println("My name is Cattle and i can run");
        } else if (buyerDemand == Cattle) {
            System.out.println("My name is Cattle and i can walk");
        } else if (buyerDemand == Cattle) {
            System.out.println("My name is Cattle and i can jump");
        } else {
            System.out.println("Other action");
        }
    }
}
