package arraysConceptsContinue;

import file.input.HouseBill;
import list.collection.NumberOfRadiatorHouse;

import java.io.IOException;

/**
 * Created by dannyolu on 21/11/2016.
 */
public class MainOne {


    public static void main(String arg[]) throws IOException {

        NumberOfBuilding numberOfBuilding = new NumberOfBuilding();
        String test = "This is, a test, for this year.";
        int result = numberOfBuilding.getTotalNumberOfBuilding();
        System.out.println(result);

        numberOfBuilding.getArrayIndex();

        int[] myCanA = numberOfBuilding.getNumberOfBuilding();


        LocalCouncil localCouncil = new LocalCouncil();
        localCouncil.setNumberOfBuilding(myCanA);
        int result2 = localCouncil.CountNumberOfBuilding(1);
        System.out.println(result2);


        NumberOfRadiatorHouse numberOfRadiatorHouse = new NumberOfRadiatorHouse();

        int result3 = numberOfRadiatorHouse.getRadiator();
        numberOfRadiatorHouse.displayAllRadiator();

        numberOfRadiatorHouse.displayAllRadiators();

        HouseBill houseBill = new HouseBill();
        houseBill.CreateMyFile();
        houseBill.writeIntoMyFile();





    }

}
