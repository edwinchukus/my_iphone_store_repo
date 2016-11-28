package com.hashtable;

import java.util.Hashtable;

/**
 * Created by dannyolu on 27/11/2016.
 */
public class Tenant {

    private Hashtable <String, String> tenant;

    public  Tenant (){
           tenant = new Hashtable<String,String>();
           tenant.put("tenantone","Jonny");
           tenant.put("tenanttwo","Tim");
           tenant.put("tenantthree","Paul");
           tenant.put("tenantfour","Peter");
       }

        public String gettenant(String key){
            return tenant.get("tenanttwo");
        }
}
