package animal.database;

import java.util.Scanner;

/**
 * Created by dotcom on 10/12/16.
 */
public class Animal {


    private String aniamlName;
    private Scanner scanner;

    public Animal(String aniamlName) {
        this.aniamlName = aniamlName;
    }


    public void walk(){
        System.out.println("This is a "+aniamlName);
        AnimalNames names = new AnimalNames();
        double animalPrice  = names.getAnimalPrice(aniamlName);
        System.out.println("I can walk and my price is "+animalPrice);
    }

    public void eat(){
        System.out.println("This is a "+aniamlName);
        AnimalNames names = new AnimalNames();
        double animalPrice  = names.getAnimalPrice(aniamlName);
        System.out.println("I can eat and my price is "+animalPrice);
    }

    public void jump(){
        System.out.println("This is a "+aniamlName);
        AnimalNames names = new AnimalNames();
        double animalPrice  = names.getAnimalPrice(aniamlName);
        System.out.println("I can jump and my price is "+animalPrice);
    }


    public void performAction(){
        Action action = new Action(scanner);
        String myAction = action.getAction();
        if(myAction.equalsIgnoreCase("walk")){
            walk();
        }else if(myAction.equalsIgnoreCase("jump")){
            jump();
        }else if(myAction.equalsIgnoreCase("eat")){
            eat();
        }else{
            System.out.println("There is no such animal");
        }
    }

    public void getScanner(Scanner scan) {
        this.scanner = scan;
    }
}
