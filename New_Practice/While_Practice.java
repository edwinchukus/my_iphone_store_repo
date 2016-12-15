package New_Practice;

import java.util.Scanner;

/**
 * Created by ASUS on 14/12/2016.
 */
public class While_Practice {

    public static void main(String[] args) {
//        int housenumber;
//        System.out.println("Please enter House Number ");
//        Scanner scanner = new Scanner(System.in);
//        int housenum = scanner.nextInt();
//       while (housenum <20);
//       System.out.println("House Number we are looking for");
//       housenum ++

//        int Ayo = 0;
//        while (Ayo < 10); {
//            ;




                int salary;
                System.out.println("Please Enter Your income");
                Scanner scanner = new Scanner (System.in);
                int Salary = scanner.nextInt();

                if (Salary <=300)
                    System.out.println ("Sorry you need a bit more");

                else if (Salary >= 301 &&  Salary <= 400)  {
                    System.out.println("You are getting there");}


                else if (Salary >= 401 &&  Salary <= 500)  {
                    System.out.println("You are getting there");}


                else if (Salary >= 501 &&  Salary <= 600)  {
                    System.out.println("You are getting there");}

                else System.out.println("sorry i didnt get that");

            }

        }






