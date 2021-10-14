package exercises.class7;

import java.util.Comparator;

public class ToppingsComparator implements Comparator<Toppings> {


    @Override
    public int compare(Toppings t1, Toppings t2) {
        return t1.getName().compareTo(t2.getName());
    }
}
