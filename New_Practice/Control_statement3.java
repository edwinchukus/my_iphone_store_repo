package New_Practice;

import java.util.Scanner;

/**
 * Created by ASUS on 13/12/2016.
 */
public class Control_statement3 {

    public static void main(String[] args) {
        int income;
        String name;

        System.out.println("What's your income?");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();
        if (salary >=23000 && salary <= 26000)
        {System.out.println("Sorry we cant accept that");}
        else if (salary >=26001 && salary <= 30000)
        {System.out.println("You are getting there");}
        else if (salary >=30001 && salary <= 39000)
        {System.out.println("Can you donate some " + salary + " Charity");}
         else if (salary >= 39001 && salary <= 40000)
        {System.out.println("Your Donation is urgently needed");}
        else
        {System.out.println("Just donate Anyway!!");}

    }}


