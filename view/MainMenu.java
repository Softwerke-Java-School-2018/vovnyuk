package view;

import java.util.Scanner;

import view.user.UserView;


public class MainMenu {

    private static UserView userView = new UserView();

    private final static String menu = "Menu. Choose what do you want to do:" + "\n" +
            "1. Actions with users" + "\n" +
            "2. Actions with devices" + "\n" +
            "3. Sort" + "\n" +
            "4. Search" + "\n" +
            "5. Exit";

    public void showMenu() {

        String choice;
        System.out.println(menu);
        Scanner in = new Scanner(System.in);
        choice = in.nextLine();
        switch (choice) {
            case "1":
                userView.userMenu();
                break;
            case "5":
                System.exit(0);
                break;
        }


    }
}






