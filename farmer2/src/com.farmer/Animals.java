package com.farmer;

/**
 * Created by dannyolu on 07/12/2016.
 */
public class Animals {

    private String animalName;



    public Animals(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void animalEating() {
        System.out.println("I am a "+animalName+" and I can eat");
    }

    public void animalRuning() {
        System.out.println("I am a "+animalName+" and I can run");
    }


    public void animaJumping() {
        System.out.println("I am a "+animalName+" and I can jump");
    }

    public void animalWalking() {
        System.out.println("I am a "+animalName+" and I can walk");
    }


    public void commandAnimal(String action) {
        if(action.equalsIgnoreCase("run")) {
            animalRuning();
        }else if(action.equalsIgnoreCase("jump")){
            animaJumping();
        }else if(action.equalsIgnoreCase("walk")){
            animalWalking();
        }else if(action.equalsIgnoreCase("eat")){
            animalEating();
        }else{
            System.out.println("There is no such action here");
        }
    }
}
