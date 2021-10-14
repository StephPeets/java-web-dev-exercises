package exercises.class7;

import java.util.Comparator;

public class AllergenComparator implements Comparator<Flavor> {


    public int compare(Flavor c1, Flavor c2) {
        int compareAllergens = c2.getAllergens().size() - c1.getAllergens().size();
        return compareAllergens;
    }
}
