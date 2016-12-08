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
		 
		 Animals animalCat = new Animals("catle");
		 action1 = animalCat.eat();
		 action2 = animalCat.run();
		 
		 Animals aninalGot = new Animals("goat");
		 action3 = aninalGot.jump();
		 action2 = aninalGot.run();
		 
		 Animals animalShep = new Animals("sheep");
		 action1  = animalShep.eat();
		 action4 = animalShep.walk();
		 
		
		 if (animalname.equals("catle")){
			 System.out.println(" I am a " + animalname  + action1 + " and" + action2);
		 }
		 
		 else if (animalname.equals("goat")){
			 System.out.println("I am a " + animalname + action3 + " and" + action2);
		 }
		 
		 else if (animalname.equals("sheep")){
			 System.out.println("I am a " + animalname + action1 + " and" + action4);
		 }
		 
		 else {
			 System.out.println ("We don't have any animal by that name please call another animal");
		 }
		 
	}

}
