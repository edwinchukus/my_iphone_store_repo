package com.chair;

/**
 * Created by dannyolu on 15/11/2016.
 */
public class Main {

       public static void main (String args []){


           ChairProperty  chairProperty = new ChairProperty();
//          chairProperty.chairValue = 400;
           chairProperty.setChairValue(7000);
           chairProperty.replaceChair();
       }


}
