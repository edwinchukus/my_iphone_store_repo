package object.oriented.encapsulation;

import object.oriented.inheritance.Animal;

/**
 * Created by dotcom on 01/12/16.
 */
public class Goat extends Animal {


    private boolean hasSkin = true;
    private String goatName = "Mountain Goat";
    private int numOfLegs = 4;


    public boolean isHasSkin() {
        return hasSkin;
    }

    public void setHasSkin(boolean hasSkin) {
        this.hasSkin = hasSkin;
    }

    public String getGoatName() {
        return goatName;
    }

    public void setGoatName(String goatName) {
        this.goatName = goatName;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }






}
