package view;

import java.util.Scanner;

import view.user.UserView;
import view.device.DeviceView;


public class MainMenu {


    private static UserView userView = new UserView();
    private static DeviceView deviceView = new DeviceView();

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
/*            case "3":
                purchaseView.userMenu();*/
            case "4":
                System.exit(0);
                break;
        }


    }
}






