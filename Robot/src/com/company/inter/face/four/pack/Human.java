package com.company.inter.face.four.pack;

import com.company.inter.face.one.pack.AbcPlc;
import com.company.inter.face.one.pack.FootBallGames;
import com.company.inter.face.one.pack.WebDriver;


/**
 * Created by dotcom on 15/12/16.
 */
public class Human implements AbcPlc, FootBallGames, WebDriver {


    @Override
    public void makeProfit() {
        System.out.println("H");
    }

    @Override
    public double publishFinReport(long finYear) {

        return 56757546d;
    }

    @Override
    public String displayOfficeAddress() {
        return null;
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

    @Override
    public void playGames() {
        System.out.println("hello");
    }

    @Override
    public void kickBall() {

    }

    @Override
    public void scoreGoal(String player) {

    }

    @Override
    public String findElement(String by) {
        return null;
    }

    @Override
    public String findElements(String by) {
        return null;
    }
}
