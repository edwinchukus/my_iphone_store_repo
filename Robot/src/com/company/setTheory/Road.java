package com.company.setTheory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by dotcom on 17/12/16.
 */
public class Road {

    public Road() {
        Set<String> roads = new HashSet<String>();
        roads.add("M12");
        roads.add("M12");
        /*
        Collection
            List
                ArrayList
                    Set

         */
        List<String> names = new ArrayList<String>();
        names.add(2, "Edwin");
        names.add(0, "Edwin");
        names.add(0, "Edwin");

    }
}
