package exercises.class5.test;

import exercises.class5.main5.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    Car test_car;
    
    @Before
    public void createCarObject(){
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    @Test
    public void testInitialGasTank() {
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

    @Test
    public void assertFalseTestInitialGasTank() {
        assertNotEquals(0, test_car.getGasTankLevel(), 0.0);
    }

    @Test
    public void assertTrueTestInitialGasTank() {
        assertEquals(test_car.getGasTankLevel(), test_car.getGasTankSize(), 0.0);
    }

    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }

    @Test
    public void testGasTankAfterExceedingTankRange() {
        test_car.drive(500);
        assertEquals(0, test_car.getGasTankLevel(), .001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
    test_car.addGas(5);
fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }

}
