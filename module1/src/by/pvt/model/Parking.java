package by.pvt.model;

import java.util.Arrays;

/**
 *
 */
public class Parking {

    public static final int PARKING_SIZE = 5;

    private static Parking parking;

    private Place[] places;

    private Parking() {
        places = new Place[PARKING_SIZE];

        for(int i = 0; i < places.length; i++) {
            places[i] = new Place();
        }
    }

    public static Parking getInstance() {
        if (parking == null) {
            parking = new Parking();
        }
        return parking;
    }

    public int parkCar(Car car) {
        for (Place place:places) {
            if (place.getParkedCar() == null) {
                place.setParkedCar(car);
                return place.getNumber();
            }
        }
        throw new IllegalStateException("No free places");
    }

    public int countFreePlaces() {
        return (int) Arrays.stream(places)
                .filter(place -> place.getParkedCar()==null)
                .count();
    }
}

class Place {
    private int number;
    private Car parkedCar;

    private static int counter = 1;

    public Place() {
        number = counter++;
    }

    public Place(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Car getParkedCar() {
        return parkedCar;
    }

    public void setParkedCar(Car parkedCar) {
        this.parkedCar = parkedCar;
    }
}

