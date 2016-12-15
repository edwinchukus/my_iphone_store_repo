package com.company.inter.face.two.pack;

import com.company.inter.face.one.pack.AbcPlc;

/**
 * Created by dotcom on 15/12/16.
 */
public class AbcSugarPlc implements AbcPlc {

    private int profitBeforeTax = 29000;

    public AbcSugarPlc(int profitBeforeTax) {
        this.profitBeforeTax = profitBeforeTax;
    }



    @Override
    public void makeProfit() {
        double runningCost = 0.57 * profitBeforeTax;
        double profit = profitBeforeTax - runningCost;
        System.out.println("Profit is "+ profit);
    }

    @Override
    public double publishFinReport(long finYear) {
        double result = 0.0;

        if(finYear < 2016){
            System.out.println("We made "+ 80000);
            result = 80000;
        }else if(finYear == 2016){
            if(profitBeforeTax < 1000){
                System.out.println("We make "+50000);
                result = 50000;
            }else{
                System.out.println("We made "+ 53000);
                result = 53000;
            }
        }else if(finYear > 2016){
            System.out.println("This is only a project figure "+ 90000);
            result = 90000;
        }
        return result;
    }

    @Override
    public String displayOfficeAddress() {
        return COMPANY_ADDRESS_NUMBER;
    }

    @Override
    public int trainStaff() {
        return 0;
    }

    @Override
    public void paySalary() {

    }

    @Override
    public void promoteEmp(int empId) {

    }
}
