//*Simple Java Calculator. Written by Kelvin@071116
package calculations;
import java.util.Scanner;
public class Calculator1 {

	public static void main(String[] args) {
		
	//Declaring the variables
	double numb1, numb2;
	String operator;
	
	//Get user first input
	System.out.println("Please enter your first number:");
	Scanner scanner = new Scanner(System.in);
	numb1 = scanner.nextDouble();
	
	//Get user operation
	System.out.println("Please enter one of the following operators + / - * ");
	operator = scanner.next();
	
	// Get user second input
	System.out.println("Please enter your second number:");
	numb2 = scanner.nextDouble();	
	
	if(operator.equals("+")) {
	  System.out.println("The answer is " + (numb1 + numb2));
	}
	else if (operator.equals("/")){
		System.out.println("The answer is " + (numb1 / numb2));
	}
	else if (operator.equals("-")){
		System.out.println("The answer is " + (numb1 - numb2));
	}
	else if (operator.equals("*")){
		System.out.println("The answer is " + (numb1 - numb2));
	}
	
	else {
		System.out.println("Sorry something is wrong");
	}}}
