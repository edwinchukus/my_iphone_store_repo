package com.company.inter.face.one.pack;



/**
 * Created by dotcom on 15/12/16.
 */
public interface AbcPlc {

    String COMPANY_NAME = "Abc Plc UK";
    int COMPANY_AGE = 5;
    String COMPANY_ADDRESS_NUMBER = "15 Nottingham Road, Bedford";
    double ANNUAL_PROFIT = 3568.00;

    void makeProfit();
    double publishFinReport(long finYear);
    String displayOfficeAddress();
    int trainStaff();
    void paySalary();
    void promoteEmp(int empId);


}
