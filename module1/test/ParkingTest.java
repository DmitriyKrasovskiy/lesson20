package by.pvt;

import static org.junit.Assert.*;

import org.junit.*;

import by.pvt.model.Car;
import by.pvt.model.Parking;

/**
 * @author alve
 */
public class ParkingTest {


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getInstance() {
        Parking testObj = Parking.getInstance();
        assertNotNull(testObj);

        Parking testObj2 = Parking.getInstance();
        assertEquals(testObj.hashCode(), testObj2.hashCode());
        assertEquals(testObj, testObj2);
    }

    @Test
    public void parkCar() {
        Parking testObj = Parking.getInstance();

        assertEquals(1, testObj.parkCar(new Car("test")));
        assertEquals(2, testObj.parkCar(new Car("test")));
        assertEquals(3, testObj.parkCar(new Car("test")));


    }

    @Test
    public void countFreePlaces() {
        Parking testObj = Parking.getInstance();
        assertEquals(Parking.PARKING_SIZE, testObj.countFreePlaces());

        testObj.parkCar(new Car("test"));
        assertEquals(Parking.PARKING_SIZE - 1, testObj.countFreePlaces());

    }


}