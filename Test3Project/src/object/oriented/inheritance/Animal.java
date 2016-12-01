package object.oriented.inheritance;

/**
 * Created by dotcom on 01/12/16.
 */
public class Animal extends LivingOrganism{

    protected boolean hasEyes = true;
    private String animalTagByCounty = "BED005";

    public void makeNoise(){
        System.out.println("Making noise");
    }

    public void walk(){
        System.out.println("Walking");
    }
}
