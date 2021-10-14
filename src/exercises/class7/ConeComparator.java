package exercises.class7;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone c1, Cone c2) {
        double compareCost = c1.getCost() - c2.getCost();
        if (compareCost > 0) {
            return 1;
        } else if (compareCost < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
