package list.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dannyolu on 23/11/2016.
 */
public class NumberOfRadiatorHouse {

    private List<Integer> count;

    public NumberOfRadiatorHouse() {
//       ArrayList <Integer> countingNumberOfRadiatorHouse = new ArrayList<Integer>();
        List<Integer> count = new ArrayList<Integer>();
        count.add(0);
        count.add(1);
        count.add(2);
    }


    public int getRadiator() {
        return count.get(1);
    }



    public void displayAllRadiator() {
        for (int i = 0; i < count.size(); i++) {
            System.out.println(count.get(i));
        }
    }

    public void displayAllRadiators() {
        for (int show : count) {
            System.out.println(count);
        }

    }
}
