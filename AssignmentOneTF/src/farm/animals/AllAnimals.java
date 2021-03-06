package farm.animals;

import java.util.Scanner;

/**
 * Created by inet-tech on 01/12/16.
 */
public class AllAnimals {

    enum AnimalActivity{walk, run, jump};

    public void callAnimalName(AnimalActivity activity){
        String animalName = interviewBuyer();

        if(animalName.equalsIgnoreCase("cattle")){
            getAnimalActions(activity, "My name is a Cattle and I can eat");
        }else if(animalName.equalsIgnoreCase("sheep")){
            getAnimalActions(activity, "My name is a Sheep and I can eat");
        }else if(animalName.equalsIgnoreCase("goat")){
            getAnimalActions(activity, "My name is a Goat and I can eat");
        }else{
            System.out.println("Animal not found");
        }
    }

    private void getAnimalActions(AnimalActivity activity, String s) {
        System.out.println(s);
        System.out.println("Type an activity");
        Scanner scan = new Scanner(System.in);
        String active = scan.nextLine();
        if (active.equalsIgnoreCase("walk") && activity.equals(AnimalActivity.walk)) {
            System.out.println("Yes! I can walk");
        } else if (active.equalsIgnoreCase("run") && activity.equals(AnimalActivity.run)) {
            System.out.println("Yes! I can run");
        } else if (active.equalsIgnoreCase("jump") && activity.equals(AnimalActivity.jump)) {
            System.out.println("Yes! I can jump");
        } else {
            System.out.println("sorry! I can't do that");
        }
    }

    private String interviewBuyer() {
        System.out.println("Dear customer: We have different animals for sale. Type either Cattle, Sheep or Goat please.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
