package com.company.abstractInJava;

/**
 * Created by dotcom on 17/12/16.
 */
public class AbTestRunner {



    public static void main(String args[]){

//        XyzInsurancePlc insurancePlc = new XyzInsurancePlc();
//        insurancePlc.paySalary(24000);

//        XyzPlc xyzPlc = new XyzInsurancePlc();
//        xyzPlc.paySalary(48000);

        HiPlc hiPlc = new MessagePlc();
        hiPlc.goToHi();
    }
}
