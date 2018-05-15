package view;

import java.util.Scanner;

import view.user.UserView;
import view.device.DeviceView;
import view.purchase.PurchaseView;

/**
 * A hub for the elements of view part.
 */

public class MainMenu {

    private static UserView userView = new UserView();
    private static DeviceView deviceView = new DeviceView();
    private static PurchaseView purchaseView = new PurchaseView();

    private final static String menu = "Menu. Choose what do you want to do:" + "\n" +
            "1. Actions with users" + "\n" +
            "2. Actions with devices" + "\n" +
            "3. Actions with purchases" + "\n" +
            "4. Exit";

    public void showMenu() {
        String choice;
        System.out.println(menu);
        Scanner in = new Scanner(System.in);
        choice = in.nextLine();
        switch (choice) {
            case "1":
                userView.userMenu();
                break;
            case "2":
                deviceView.DeviceMenu();
                break;
            case "3":
                purchaseView.purchaseMenu();
                break;
            case "4":
                System.exit(0);
                break;
            default:
                System.out.println("Wrong enter. Enter only number of menu item (1-4) ");
                showMenu();
        }


    }
}






