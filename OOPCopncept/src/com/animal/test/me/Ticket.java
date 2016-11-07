package com.animal.test.me;

/**
 * Created by dotcom on 27/10/16.
 */
public class Ticket {


    public Gun issueTicket(String meansName){
        MeansOfTransport means = new MeansOfTransport();

        if(meansName.contains("bus"))
            means.goingByBus();
        else
            means.goingByTrain();
        return new Gun();
    }
}
