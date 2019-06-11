package by.pvt.view;

import java.util.Scanner;

/**
 *
 */
public class MainScreen {


    public String showMainMenu() {
        System.out.println("Hello");
        String input;
        do {
            System.out.println("Park car [1]; Take car [2]; Show free places [3]");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
        } while(!validateInputMainMenu(input));
        return input;
    }

    private boolean validateInputMainMenu(String input) {
        if ("1".equals(input) || "2".equals(input) || "3".equals(input)) {
            return true;
        }
        return false;
    }

}