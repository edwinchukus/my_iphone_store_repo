package object.oriented.encapsulation;

import object.oriented.inheritance.Animal;

/**
 * Created by dotcom on 01/12/16.
 */
public class Dove extends Animal{


    private boolean hasSkin = true;
    private String doveName = "White Dove";
    private int numOfLegs = 2;


    public boolean getDoveEyeStatus(){
        return hasEyes;
    }

    public boolean isHasSkin() {
        return hasSkin;
    }

    public void setHasSkin(boolean hasSkin) {
        this.hasSkin = hasSkin;
    }

    public String getDoveName() {
        return doveName;
    }

    public void setDoveName(String doveName) {
        this.doveName = doveName;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }









}
