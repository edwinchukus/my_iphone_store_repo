package suv.cars;

import java.util.Scanner;

/**
 * Created by dotcom on 20/10/16.
 */
public class ToyotaCarina {


    // Nested IF ELSE STATEMENT


    public static void main(String args []){

        System.out.println("Enter your score please?: ");
        Scanner scanner = new Scanner(System.in);

        long subjectScore = scanner.nextLong();

        if(subjectScore >= 0 && subjectScore <= 39){
            System.out.println("Failed with grade F9");
        }else if(subjectScore >= 40 && subjectScore <= 45) {
            System.out.println("Failed with grade E8");
        }else if(subjectScore >= 46 && subjectScore <= 49) {
            System.out.println("Failed with grade D8");
        }else if(subjectScore >= 50 && subjectScore <= 55) {
            System.out.println("Passed with grade C6");
        }else if(subjectScore >= 56 && subjectScore <= 59) {
            System.out.println("Passed with grade C5");

        }else if(subjectScore >= 60 && subjectScore <= 69) {
            System.out.println("Passed with grade C4");
        }else if(subjectScore >= 70 && subjectScore <= 79) {
            System.out.println("Good with grade B3");
        }else if(subjectScore >= 80 && subjectScore <= 89) {
            System.out.println("Excellent with grade B2");
        }else if(subjectScore >= 90 && subjectScore <= 100) {
            System.out.println("Distinction with grade A1");

            if(subjectScore >= 95 && subjectScore <=100){
                System.out.println("And you won a scholarship");
            }else if(subjectScore >= 95 && subjectScore <=100){
                System.out.println("And you ve got NO scholarship");
            }else{

            }

        }else{
            System.out.println("There is no such a grade");
        }

    }
}
