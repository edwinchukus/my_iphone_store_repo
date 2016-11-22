package collections.concepts.in.java.hashable;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by dotcom on 22/11/16.
 */
public class Library {

    private Hashtable<String, String> vehicles;


    public Library(){
        vehicles = new Hashtable<String, String>();
        vehicles.put("Kelvin", "BMW 8000 Series");
        vehicles.put("Lanre", "Ford Focus");
        vehicles.put("Stella", "Luxus Jeep");
        vehicles.put("Tunde", "Passat V");
        vehicles.put("Ayo", "Mercedes Jeep");
    }


    public String getCar(String key){
        return vehicles.get(key);
    }

    public void setCar(String carKey, String carName){
        vehicles.put(carKey, carName);

    }

    public void cleanCarRecord(){
        vehicles.clear();
    }

    public Enumeration<String> all(){
        return vehicles.elements();
    }


    public Enumeration<String> carkeys(){
        return vehicles.keys();
    }
}
