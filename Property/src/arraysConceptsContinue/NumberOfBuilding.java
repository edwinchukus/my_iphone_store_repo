package arraysConceptsContinue;

/**
 * Created by dannyolu on 21/11/2016.
 */
public class NumberOfBuilding {


    private int buildingNumber[];


    public NumberOfBuilding() {
        buildingNumber = new int[5];
        buildingNumber[0] = 20;
        buildingNumber[1] = 45;
        buildingNumber[2] = 50;
        buildingNumber[3] = 10;
        buildingNumber[4] = 60;


    }

    public void getArrayIndex() {
        for (int count : buildingNumber) {
            System.out.println(count);
        }

    }

    public int getTotalNumberOfBuilding() {
        return buildingNumber.length;


    }

    public int[] getNumberOfBuilding() {
        int[] canA = buildingNumber.clone();
        return canA;

    }


}