package customDataType;

/**
 * Created by dotcom on 06/12/16.
 */
public class RunnerGirl {

    public static void main(String args []){
        SalesGirl juniorSalesGirl = new SalesGirl();
        String name = juniorSalesGirl.getSaleGirlName();


        String salesGirlName = new String();
        salesGirlName = "Ruth";


        Shop mall = new Shop(salesGirlName);
        mall.teaUnit();
    }
}
