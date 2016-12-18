package com.company.objectConcept;

/**
 * Created by dotcom on 17/12/16.
 */
public class RetailShop {


    public void checkMilkDetails(){
        Milk milk = new Milk("Peak");
        Object[] details = milk.getMilkDetails();

        for(Object detail : details){
           if(detail == (Object) true){
               boolean isMilkExpired = (boolean)detail;
               System.out.println(isMilkExpired);
           }else if(detail == (Object) 12){
               int num = 12 + (int)detail;
               int milkQty = (int)detail;
               System.out.println(milkQty);
           }
        }
    }
}
