package by.pvt;

import by.pvt.model.Car;
import by.pvt.model.Parking;

/**
 *
 */
public class ParkingController {

    public int park(String carNumber) {
        Parking parking = Parking.getInstance();
        int placeNumber = parking.parkCar(new Car(carNumber));
        return placeNumber;
    }

    public void take(String carNumber) {

    }

    public void take(int placeNumber) {

    }

    public int checkFreePlaces() {
        Parking parking = Parking.getInstance();
        return parking.countFreePlaces();
    }

}
