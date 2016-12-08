package footballers;

/**
 * Created by Nick on 26/11/2016.
 */
public class FootballerBonus {

    private double salaryAmount = 27500;

    public  void setSalaryAmount(double salaryAmount){

    this.salaryAmount = salaryAmount;
}

    public void giveBonus(){

        if(salaryAmount >= 25000){
            System.out.println("your salary is relatively high; hence no bonus entitlement");
        }else{
            System.out.println("your salary will be amended with a bonus my friend!!");
        }
    }
}
