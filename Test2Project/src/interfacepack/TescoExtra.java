package interfacepack;

/**
 * Created by dotcom on 13/12/16.
 */
public class TescoExtra implements SunderlandCityCouncil{

    private double accountBalance ;



    @Override
    public void getFreshFarmProduce() {
        System.out.println("Yes, We get fresh produce from Yorkshire");
    }

    @Override
    public String showStoreName() {
        String tescoStoreName = "Tesco Extra";
        return tescoStoreName;
    }

    @Override
    public long getShopAccrediationNumber(String company) {
        if(company.equalsIgnoreCase("city council") && company != null){
            return 981616;
        }
        return 0;
    }

    @Override
    public void payTaxToSunderlandCityCouncil() {
        accountBalance = accountBalance+ 1000;
    }

    @Override
    public boolean doYouHaveCoolingVan() {
        return true;
    }
}
