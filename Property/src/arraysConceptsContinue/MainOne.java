package arraysConceptsContinue;

import list.collection.NumberOfRadiatorHouse;

/**
 * Created by dannyolu on 21/11/2016.
 */
public class MainOne {


    public static void main(String arg[]) {

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


    }

}
