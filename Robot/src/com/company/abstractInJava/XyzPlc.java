package com.company.abstractInJava;

/**
 * Created by dotcom on 17/12/16.
 */
public abstract class XyzPlc {

    public void paySalary(double baseSal){
       double sal = baseSal/12;
        System.out.println(sal);
    }


    abstract void promoteEmp(int empId);
    abstract double publishFinReport(long finYear);
    abstract String displayOfficeAddress();
    abstract int trainStaff();
}
