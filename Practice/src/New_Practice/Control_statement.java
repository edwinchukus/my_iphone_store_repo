package New_Practice;

/**
 * Created by ASUS on 11/12/2016.
 */
public class Control_statement {
    public static void main (String[] args) {

        double salary = 500.00d;
        if (salary <= 500.00) {
            System.out.println("Have you pay your tax");
        } else if (salary >= 500.00) {
            System.out.println("you don't have to oay tax");
        } else {
            System.out.println("You don't have anything to do with taxation ");
        }
    }}