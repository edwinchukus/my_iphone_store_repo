package object.oriented.runner.oop;

import object.oriented.polymorphism.BicPen;

/**
 * Created by dotcom on 03/12/16.
 */
public class OverridingRunner {

    public static void main(String [] args){
        BicPen blueBicPen = new BicPen(749695);

        blueBicPen.writeLetter();
    }
}
