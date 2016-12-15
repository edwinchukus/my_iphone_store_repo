package com.company.inter.face.two.pack;


import com.company.inter.face.one.pack.AbcPlc;

import java.util.Scanner;

/**
 * Created by dotcom on 15/12/16.
 */
public class AbcBankPlc implements AbcPlc {

    private final long accountNumber;

    public AbcBankPlc(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double computeDeposit(){
        if(accountNumber != 0){
            double bal = findCusatomerBalance(accountNumber);
            if(bal < 1000){

            }
        }
        return 0.0;
    }

    private double findCusatomerBalance(long accountNumber) {
        return 50000;
    }

    @Override
    public void makeProfit() {
        System.out.println("We make profit by taking 0.05 of all Demand Deposit in our vault");
    }

    @Override
    public double publishFinReport(long finYear) {
        if(finYear == 2016){
            return 800000 * 0.05;
        }
        return 0;
    }



    @Override
    public String displayOfficeAddress() {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Which address do you want to see? local or head office");
        String address = scanner.nextLine();

        String localAddress = "23 Newcastle Road, Edinburgh";
        if(address.contains("local")){
            return localAddress;
        }
        return COMPANY_ADDRESS_NUMBER ;
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
