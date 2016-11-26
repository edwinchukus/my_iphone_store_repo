package footballers;

/**
 * Created by Nick on 26/11/2016.
 */
public class FootballerBonus {

    private double salaryAmount = 1700;



    public void giveBonus(){

        if(salaryAmount < 2000){
            salaryAmount = salaryAmount +500;
            System.out.println("Congratulation, you got a bonus and your new salary is " + salaryAmount);
        }else{
            System.out.println("you're not eligible for a bonus my friend!!");
        }
    }
}
