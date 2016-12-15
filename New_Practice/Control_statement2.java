package New_Practice;

import java.util.Scanner;

/**
 * Created by ASUS on 13/12/2016.
 */
public class Control_statement2 {

    String name ;
    int age;
    double Income;
    Long bankaccount;
    boolean yes,no;

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please tell us your name");
        String name = scanner.next();

        System.out.println("Hello " + name +" How Old are you if you don't mind");
        int age = scanner.nextInt();
        if (age<18)
            System.out.println("Sorry the minimum age requirment is 18, we cant continue with this application");
        else
        System.out.println(" Waoo, thanks " + name +" you look young at " + age + " don't tell anyone" );


        System.out.println(" well done  " + name + " Please how much is your income?");
        double income = scanner.nextDouble();
        System.out.println("Thank you, you type " + income +" is that correct" );
        boolean yes =scanner.nextBoolean();
        if (income<29000)
        System.out.println("Sorry, the minimum income per year is 34,000");

       else System.out.println("Thank you " + name + "you providing us with your details, finally please type in your back accout");
        long bankaccount = scanner.nextLong();
        System.out.println("Thank you for the information provided, our representative will get back to you soon.");



    }



}
