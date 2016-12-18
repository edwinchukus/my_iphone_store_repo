package com.company.staticConcept;


/**
 * Created by dotcom on 17/12/16.
 */
public class Milk {


    private String milkName;
    private static String companyName = "Cadbury Plc";

    public Milk(String milkName) {
        this.milkName = milkName;
    }


    public String getMilkName(){
        return this.milkName ;
    }

    public static String getCompanyName(){
        return companyName;
    }
}
