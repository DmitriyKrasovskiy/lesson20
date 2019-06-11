package by.pvt;

import java.util.logging.Level;
import java.util.logging.Logger;

import by.pvt.view.FreePlacesScreen;
import by.pvt.view.MainScreen;
import by.pvt.view.ParkingScreen;

public class Main {

    private static Logger log = Logger.getLogger("by.pvt.Main");

    public static void main(String[] args) {
        MainScreen mainScreen = new MainScreen();
        do {
            String input = mainScreen.showMainMenu();
            log.info("User enter in main menu: " + input);
            handleMainMenu(input);
        } while (true);
    }

    private static void handleMainMenu(String input) {
        ParkingController parkingController = new ParkingController();
        switch (input) {
            case "1": {
                handleParkingMenu(parkingController);
                break;
            }
            case "2": {

            }
            case "3": {
                FreePlacesScreen freePlacesScreen = new FreePlacesScreen();
                int freePlaceNumber = parkingController.checkFreePlaces();
                freePlacesScreen.showFreePlaces(freePlaceNumber);
                break;
            }
        }
    }

    private static void handleParkingMenu(ParkingController parkingController) {
        ParkingScreen parkingScreen = new ParkingScreen();
        String carNumber = parkingScreen.showEnterCarNumber();
        int placeNumber = 0;
        try {
            placeNumber = parkingController.park(carNumber);
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage());
            parkingScreen.showWarning(e.getMessage());
            return;
        }
        parkingScreen.showParkingResult(carNumber, placeNumber);
    }
}
