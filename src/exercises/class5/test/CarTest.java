package exercises.class5.test;

import static org.junit.Assert.*;
import org.junit.*;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

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
        assertFalse(test_car.getGasTankLevel() == 0);
    }

    @Test
    public void assertTrueTestInitialGasTank() {
        assertTrue(test_car.getGasTankLevel() == test_car.getGasTankSize());
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

    // TODO: can't have more gas than tank size, expect an exception

    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
    test_car.addGas(5);
fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }

}
