package org.launchcode;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

    //Sort by flavor name [Alphabetically]
//    @Override
//    public int compare(Flavor o1, Flavor o2) {
//        return o1.getName().compareTo(o2.getName());
//    }

    // Sort by allergens [HighToLow]
    @Override
    public int compare(Flavor o1, Flavor o2) {
        return Integer.compare(o2.getAllergens().size() - o1.getAllergens().size(), 0);
    }
}
