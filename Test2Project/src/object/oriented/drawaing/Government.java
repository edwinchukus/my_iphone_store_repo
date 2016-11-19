package object.oriented.drawaing;

import objects.oreinted.programming.ElectricCar;

/**
 * Created by dotcom on 15/11/16.
 */
public class Government {


    public void inspectCar(){
        ElectricCar carForInspection = new ElectricCar();
        int carAge = carForInspection.getCarAge();

        if(carAge == 3) {
            System.out.println("Passed");
        }else{
            System.out.println("Failure");
        }

        Environmental env = new Environmental();
        env.setCarAge(carAge);
        carForInspection.setCarAge(1);
        int carAge1 = carForInspection.getCarAge();
        if(carAge1 == 3) {
            System.out.println("Passed");
        }else{
            System.out.println("Failure");
        }
    }



}
