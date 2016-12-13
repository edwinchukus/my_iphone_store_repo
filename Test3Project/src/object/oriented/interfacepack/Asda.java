package object.oriented.interfacepack;

/**
 * Created by dotcom on 13/12/16.
 */
public class Asda implements SunderlandCityCouncil {


    private double accountBalance;
    private String coolVan = "Yes";

    public Asda(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public void getFreshFarmProduce() {
        System.out.println("We have a nice fresh produce that we get from farmer from SCOTLAND");
    }

    @Override
    public String showStoreName() {
        return "Asda Classic";
    }

    @Override
    public long getShopAccrediationNumber(String company) {
        return 68516;
    }

    @Override
    public void payTaxToSunderlandCityCouncil() {
        if(accountBalance <= 1000){
            if(COUNCILNAME.contains("council")){
                accountBalance = accountBalance - 10;
                accountBalance = accountBalance + 600;
                System.out.println("Tax paid");
            }
        }
    }

    @Override
    public boolean doYouHaveCoolingVan() {
        if(coolVan != null){
            return true;
        }
        return false;
    }


    public void greetCustomer(String customerName){
        System.out.println("Hello "+ customerName+ " welcome");
    }
}
