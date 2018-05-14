package view.user;

import java.util.Scanner;

import controller.user.*;
import view.MainMenu;

public class UserView {

    private MainMenu mainMenu = new MainMenu();
    private UserController userController = new UserController();
    private TextForUserMenu textForUserMenu = new TextForUserMenu();
    private UserSortMenu userSortMenu = new UserSortMenu();
    private UserSearchMenu userSearchMenu = new UserSearchMenu();
    private Scanner in = new Scanner(System.in);
    private Scanner kek = new Scanner(System.in);

    public void userMenu() {
        String choice;
        textForUserMenu.userMenu();
        choice = in.nextLine();
        switch (choice) {
            case "1":
                addingUser();
                break;
            case "2":
                findUser();
                break;
            case "3":
                showingListOfUsers();
                break;
            case "4":
                deleteUser();
                break;
            case "5":
                userSortMenu();
                break;
            case "6":
                System.exit(0);
            default:
                System.out.println("Wrong enter. Enter only number of menu item (1-6) ");
                userMenu();
        }
    }

    private void addingUser() {
        System.out.print("Enter user's first name:  ");
        String firstName = in.nextLine();
        System.out.print("Enter user's second name:  ");
        String secondName = in.nextLine();
        System.out.print("Enter user's birthday in form like 'DD/MM/YYYY':  ");
        String birthDay = in.nextLine();
        userController.create(firstName, secondName, birthDay);
        System.out.println("User has been successfully added");
        mainMenu.showMenu();
    }

    private void deleteUser() {
        System.out.print("Enter user's id you want to delete:");
        int idToDelete = kek.nextInt();
        userController.delete(idToDelete);
        mainMenu.showMenu();
    }

    private void showingListOfUsers() {

        userController.showList();
        mainMenu.showMenu();
    }

    private void userSortMenu() {
        userSortMenu.sortMenu();
    }


    private void findUser() {
        userSearchMenu.userSearchMenu();
    }

}