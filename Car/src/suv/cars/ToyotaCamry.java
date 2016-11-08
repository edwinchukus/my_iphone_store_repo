package suv.cars;

import java.util.Scanner;

/**
 * Created by dotcom on 20/10/16.
 */
public class ToyotaCamry {

    public static void main(String args[]){


        // This is for giving output on the console
        System.out.println("Enter your name");


        //This is for taking input from console
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        System.out.println("This is the name we collected from the console " + username);

    }
}
