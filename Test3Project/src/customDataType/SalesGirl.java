package customDataType;

/**
 * Created by dotcom on 06/12/16.
 */
public class SalesGirl {


    private String saleGirlName;

    public void cleanShop(){
        System.out.println("Cleaning the shop ...");
    }


    public void sellTea(String teaName){
        System.out.println("I am selling "+teaName);
    }

    public String getSaleGirlName() {
        return saleGirlName;
    }
}
