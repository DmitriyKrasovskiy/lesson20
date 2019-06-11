package by.pvt.view;

import java.util.Scanner;

/**
 *
 */
public class ParkingScreen {

    public String showEnterCarNumber() {
        System.out.println("Enter car number: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public void showParkingResult(String carNumber, int placeNumber) {
        System.out.println("Car " + carNumber + " is parked on place# " + placeNumber);
    }

    public void showWarning(String message) {
        System.out.println("Warning! " + message);
    }
}
