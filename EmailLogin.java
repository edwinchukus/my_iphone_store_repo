import java.util.Scanner;
public class EmailLogin {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your username:");
        String username = scanner.nextLine();
    
        System.out.print("Please enter your password:");
        String password = scanner.nextLine();
    
        if(username.equals("America@mail.com")||password.equals("paswword")  ){
        System.out.println("Welcome to your mail");
        }else{
        System.out.print("Please you have entered a wrong details.\n  Please enter your details again");
        }}

}