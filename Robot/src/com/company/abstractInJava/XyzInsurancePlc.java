package com.company.abstractInJava;

/**
 * Created by dotcom on 17/12/16.
 */
public class XyzInsurancePlc extends XyzPlc  {


    public void paySalary(double baseSal){
        double sal = baseSal/24;
        System.out.println(sal);
    }



    @Override
    void promoteEmp(int empId) {

    }

    @Override
    double publishFinReport(long finYear) {
        return 0;
    }

    @Override
    String displayOfficeAddress() {
        return null;
    }

    @Override
    int trainStaff() {
        return 0;
    }
}
