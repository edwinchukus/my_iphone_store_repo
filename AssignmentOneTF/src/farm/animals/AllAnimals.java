package farm.animals;

import java.util.Scanner;

/**
 * Created by inet-tech on 01/12/16.
 */
public class AllAnimals {

    enum AnimalActivity{walk, run, jump};

    public void callAnimalName(AnimalActivity activity){
        System.out.println("Dear customer: We have different animals for sale. Type either Cattle, Sheep or Goat please.");
        Scanner scanner = new Scanner(System.in);
        String animalName = scanner.nextLine();

        if(animalName.equalsIgnoreCase("cattle")){
            System.out.println("My name is a Cattle and I can eat");
            System.out.println("Type an activity");
            Scanner scan = new Scanner(System.in);
            String active = scan.nextLine();
            if(active.equalsIgnoreCase("walk") && activity.equals(AnimalActivity.walk)){
                System.out.println("Yes! I can walk");
            }else  if(active.equalsIgnoreCase("run") && activity.equals(AnimalActivity.run)) {
                System.out.println("Yes! I can run");
            }else  if(active.equalsIgnoreCase("jump") && activity.equals(AnimalActivity.jump)) {
                System.out.println("Yes! I can jump");
            }else {
                System.out.println("sorry! I can't do that");
            }
        }else if(animalName.equalsIgnoreCase("sheep")){
            System.out.println("My name is a Sheep and I can eat");
            System.out.println("Type an activity");
            Scanner scan = new Scanner(System.in);
            String active = scan.nextLine();
            if(active.equalsIgnoreCase("walk") && activity.equals(AnimalActivity.walk)){
                System.out.println("Yes! I can walk");
            }else  if(active.equalsIgnoreCase("run") && activity.equals(AnimalActivity.run)) {
                System.out.println("Yes! I can run");
            }else  if(active.equalsIgnoreCase("jump") && activity.equals(AnimalActivity.jump)) {
                System.out.println("Yes! I can jump");
            }else {
                System.out.println("sorry! I can't do that");
            }
        }else if(animalName.equalsIgnoreCase("goat")){
            System.out.println("My name is a Goat and I can eat");
            System.out.println("Type an activity");
            Scanner scan = new Scanner(System.in);
            String active = scan.nextLine();
            if(active.equalsIgnoreCase("walk") && activity.equals(AnimalActivity.walk)){
                System.out.println("Yes! I can walk");
            }else  if(active.equalsIgnoreCase("run") && activity.equals(AnimalActivity.run)) {
                System.out.println("Yes! I can run");
            }else  if(active.equalsIgnoreCase("jump") && activity.equals(AnimalActivity.jump)) {
                System.out.println("Yes! I can jump");
            }else {
                System.out.println("sorry! I can't do that");
            }
        }else{
            System.out.println("Animal not found");
        }

    }

    /*
    private String Cattle;
    private String Sheep;
    private String Goat;
    protected String[] animalFarm = {"Cattle", "Sheep", "Goat"};

    // protected static String animalEat;

    public String[] callAnimal(){

        for(String animalType : animalFarm){
            if(animalType.equals("Cattle")){
                System.out.println("My name is " +animalType+ " and I can eat");
            }else if(animalType.equals("Sheep")){
                System.out.println("My name is " +animalType+ " and I can eat");
            }else if(animalType.equals("Goat")){
                System.out.println("My name is " +animalType+ " and I can eat");
            }else{
                System.out.println("animal not found");
            }
            return new String[0];
        }

       *//* Animals animals = new Animals();
        animalEat = animals.getEat();
        return animalEat;*//*

        return new String[0];
    }
*/

}
