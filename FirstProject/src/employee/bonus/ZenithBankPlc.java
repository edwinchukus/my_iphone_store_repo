package employee.bonus;

/**
 * Created by Edwin on 12/11/2016.
 */
public class ZenithBankPlc {

    private double salaryAmount = 50000;


    public void setSalaryAmount(double salaryAmount){
        if(salaryAmount > 50000){
            System.out.println("This is cheating");
        }else{
            this.salaryAmount = salaryAmount;
        }

    }

    public void giveBonus(){
        if(salaryAmount < 2000){
            salaryAmount = salaryAmount +500;
            System.out.println("You new Salary is "+ salaryAmount);
        }else{
           System.out.println("You are not due for bonus");
        }
    }


}
