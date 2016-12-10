package animal.database;

import java.util.Scanner;

/**
 * Created by dotcom on 10/12/16.
 */
public class Action {

    private final Scanner scanner;

    public Action(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getAction(){
        System.out.println("What would you like the animal to do?");
        String action = scanner.nextLine();
        return action;
    }






}
