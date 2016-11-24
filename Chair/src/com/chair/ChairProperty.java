package com.chair;

/**
 * Created by dannyolu on 15/11/2016.
 */
public class ChairProperty {

    int chairValue = 1000;
    private String chairType = "Golden";
    int chairAge = 5;
    String ChairCover = "Leather";
    String ChairColour = "Black";

    //        concept of encapsulation
    public void setChairValue(int chairValue) {
        if (chairValue < 7000) {
            System.out.println("please ignore");
        } else {
            this.chairValue = chairValue;
        }
    }

    public void replaceChair() {
        if (chairValue < 500) {
            System.out.println("Depreciation of chair");
        } else
            System.out.println("We need to replace the chair in the house, too old !!!");

    }


}
