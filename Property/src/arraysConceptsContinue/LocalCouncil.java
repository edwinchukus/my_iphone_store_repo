package arraysConceptsContinue;

/**
 * Created by dannyolu on 23/11/2016.
 */
public class LocalCouncil {


    private int[] numberOfBuilding;

    public void setNumberOfBuilding(int[] numberOfBuilding) {
        this.numberOfBuilding = numberOfBuilding;
    }

    public int CountNumberOfBuilding(int buildingNumber) {

        for (int count : numberOfBuilding) {
            if (count == buildingNumber) {
                return 20;
            }


        }
        return 20;
    }
}
