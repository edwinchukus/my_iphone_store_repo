package computing;

/**
 * Created by dotcom on 12/11/16.
 */
public class Laptop {


    private String laptopName = "Dell";
    private int laptopAge = 2;
    public double amount = 2000.00;


    public void printDoc(){
        if(amount < 2000){
            amount = 5000;
        }
        System.out.println("I am printing ..."+amount);
    }


    public void typeDoc(){
        System.out.println("I am TYPING ...");
    }

}
