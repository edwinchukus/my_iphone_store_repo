//Written by Kelvin @06122016

package exhibition;

import java.util.Scanner;

public class AnimalRunner {

    private static String action1;
    private static String action2;
    private static String action3;
    private static String action4;

    public static void main(String[] args) {

        System.out.println("Please enter the name of the animal you wish to see today");
        Scanner scanner = new Scanner(System.in);
        String animalname = scanner.nextLine();

        Animals animal = new Animals(animalname);
        action1 = animal.eat();
        action2 = animal.run();
        action3 = animal.walk();
        action4 = animal.jump();

        if (animalname.equalsIgnoreCase("cattle")) {
            System.out.println(action1+", " + action2+", "+action3+"& "+action4);
        } else if (animalname.equalsIgnoreCase("goat")) {
            System.out.println(action1+", " + action2+", "+action3+"& "+action4);
        } else if (animalname.equalsIgnoreCase("sheep")) {
            System.out.println(action1+", " + action2+", "+action3+"& "+action4);
        } else {
            System.out.println("We don't have any animal by that name please call another animal");
        }

    }

}
