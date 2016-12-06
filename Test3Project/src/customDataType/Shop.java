package customDataType;

/**
 * Created by dotcom on 06/12/16.
 */
public class Shop {

    private String salesGirlName;
    private SalesGirl salesGirl;

    public Shop(SalesGirl salesGirl){
        this.salesGirl = salesGirl;
    }

    public Shop(String salesGirlName){
        this.salesGirlName = salesGirlName;
    }

    public void teaUnit(){
        salesGirl.cleanShop();
        salesGirl.sellTea("Green Tea");
    }
}
