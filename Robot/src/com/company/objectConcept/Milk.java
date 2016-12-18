package com.company.objectConcept;



/**
 * Created by dotcom on 17/12/16.
 */
public class Milk {
    private String milkName;

    //private Object milkName = "Cow Bell";

    private Object[] names;

    public Milk(String milkName) {
        this.milkName = milkName;

        names = new Object[10];
        names[0] = "Peak Milk"; // name
        names[1] = 12; // qty
        names[2] = 230.00; //amount
        names[3] = true; //boolean
        names[4] = 6475878l; // long

    }

    public String getMilkName(){
       return (String) milkName;
    }


    public Object[] getMilkDetails(){
        return names;
    }


}
