package main.java.view.user;

import main.java.controller.user.UserSortController;
import main.java.view.MainMenu;

import java.util.Scanner;

class UserSortMenu {

    private MainMenu mainMenu = new MainMenu();
    private UserSortController userSortController = new UserSortController();
    private Scanner in = new Scanner(System.in);
    private TextForUserMenu textForUserMenu = new TextForUserMenu();

    void sortMenu() {
        String choice;
        textForUserMenu.userSortMenu();
        choice = in.nextLine();
        switch (choice) {
            case "1":
                sortByFirstName();
                break;
            case "2":
                sortBySecondName();
                break;
            case "3":
                sortByBirthDay();
                break;
            case "4":
                System.exit(0);
            default:
                System.out.println("Wrong enter. Enter only number of menu item (1-4) ");
                sortMenu();
        }
    }

    private void sortByFirstName() {
        userSortController.sortByFirstName();
        mainMenu.showMenu();
    }

    private void sortBySecondName() {
        userSortController.sortBySecondName();
        mainMenu.showMenu();
    }

    private void sortByBirthDay() {
        userSortController.sortByBirthday();
        mainMenu.showMenu();
    }
}
