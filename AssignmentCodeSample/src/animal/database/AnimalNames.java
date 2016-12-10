package animal.database;

import java.util.Hashtable;
import java.util.Set;

/**
 * Created by dotcom on 10/12/16.
 */
public class AnimalNames {


    private Hashtable<String, Double> animalNames;

    public AnimalNames() {
        this.animalNames = new Hashtable<String, Double>();
        animalNames.put("Cattle".toLowerCase(), 220d);
        animalNames.put("Sheep".toLowerCase(), 135.60);
        animalNames.put("Goat".toLowerCase(), 98.09);
    }




    public Set<String> getAllAnimalNames(){
        Set<String> keys = animalNames.keySet();
        return keys;
    }


    public double getAnimalPrice(String animalName){
        return animalNames.get(animalName.toLowerCase());
    }

}
