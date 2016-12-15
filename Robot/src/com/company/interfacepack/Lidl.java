package com.company.interfacepack;

/**
 * Created by dotcom on 13/12/16.
 */
public class Lidl implements CityCouncil {

    @Override
    public void getFreshFarmProduce() {
        System.out.println(COUNCILNAME);
    }

    @Override
    public String showStoreName() {
        return null;
    }

    @Override
    public long getShopAccrediationNumber(String company) {
        return 0;
    }

    @Override
    public void payTaxToSunderlandCityCouncil() {

    }

    @Override
    public boolean doYouHaveCoolingVan() {
        return false;
    }
}
