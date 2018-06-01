package main.java.view.user;

import main.java.controller.user.UserSearchController;
import main.java.view.MainMenu;

import java.util.Scanner;

class UserSearchMenu {

    private TextForUserMenu textForUserMenu = new TextForUserMenu();
    private UserSearchController userSearchController = new UserSearchController();
    private Scanner in = new Scanner(System.in);
    private Scanner kek = new Scanner(System.in);
    private MainMenu mainMenu = new MainMenu();


    void userSearchMenu() {
        String choice;
        textForUserMenu.userFindMenu();
        choice = in.nextLine();
        switch (choice) {
            case "1":
                searchById();
                break;
            case "2":
                searchByFirstName();
                break;
            case "3":
                searchBySecondName();
                break;
            case "4":
                searchByBirthDay();
                break;
            case "5":
                System.exit(0);
            default:
                System.out.println("Wrong enter. Enter only number of menu item (1-5) ");
                userSearchMenu();
        }
    }

    private void searchById() {
        System.out.println("Enter Id:");
        int checkingId = kek.nextInt();
        userSearchController.findUserById(checkingId);
        mainMenu.showMenu();
    }

    private void searchByFirstName() {
        System.out.println("Enter first name:");
        String checkingFirstName = in.nextLine();
        userSearchController.findUserByFirstName(checkingFirstName);
        mainMenu.showMenu();
    }

    private void searchBySecondName() {
        System.out.println("Enter second name:");
        String checkingSecondName = in.nextLine();
        userSearchController.findUserBySecondName(checkingSecondName);
        mainMenu.showMenu();
    }

    private void searchByBirthDay() {
        System.out.println("Enter birthday:");
        String checkingBirthDay = in.nextLine();
        userSearchController.findUserBirthDay(checkingBirthDay);
        mainMenu.showMenu();
    }

}

