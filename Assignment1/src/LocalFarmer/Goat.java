package LocalFarmer;

import java.util.Scanner;

/**
 * Created by ASUS on 08/12/2016.
 */
public class Goat {


    public void Goat() {
        String[] Animal = new String[3];
        Animal[0] = "Cattle";
        Animal[1] = "Sheep";
        Animal[2] = "Goat";
        System.out.println("Welcome to the exhibition, Please enter Animal ID you will like to buy");
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.next(Animal[2]);
        System.out.println("Hi, My Name is Goat and i can eat, run, walk and jump");
    }
    }
