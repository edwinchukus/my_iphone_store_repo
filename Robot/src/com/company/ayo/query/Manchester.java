package com.company.ayo.query;

/**
 * Created by dotcom on 17/12/16.
 */
public class Manchester {


    private String goalKeeper ="Ayo";



    public String getGoalKeeperName(){
        String fullName = null;
        int goalKeeperAgeOne =5; int goalKeeperAgeTwo, age3, ag4;
        String surname = "Lawal";

        if(goalKeeper.equals("Ayo")){
            fullName  = goalKeeper + surname;
            goalKeeperAgeOne = 0;
            while(goalKeeperAgeOne < 1){
                goalKeeperAgeOne  = goalKeeperAgeOne + 1;
                double salary =0.0;
                salary = 23000;
            }
            System.out.println(goalKeeperAgeOne);
        }
        return fullName;
    }

    public String getGoalKeeper(){
        if(goalKeeper.equals("Ayo")){
            String surname = "Lawal";
            String fullName  = goalKeeper + surname;
            return fullName;
        }
        return null;
    }



}
