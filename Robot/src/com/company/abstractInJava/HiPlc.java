package com.company.abstractInJava;

/**
 * Created by dotcom on 17/12/16.
 */
public abstract class HiPlc {

    private String hiMessage;

    public abstract String goToHi();



    public void setHi(String hiMessage){
        this.hiMessage = hiMessage;
    }
}
