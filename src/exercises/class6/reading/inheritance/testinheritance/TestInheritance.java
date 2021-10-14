package exercises.class6.reading.inheritance.testinheritance;

import exercises.class6.reading.inheritance.HouseCat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestInheritance {

    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }

    @Test
    public void inheritsSuperFamily() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals("Felidae", keyboardCat.getFamily());
    }

    @Test
    public void inheritsSuperHungryMethod() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertFalse(keyboardCat.isHungry());
    }
}
