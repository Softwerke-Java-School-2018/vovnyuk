package view.user;

import java.util.Scanner;

import controller.user.UserController;
import view.MainMenu;

public class UserView {

    private MainMenu mainMenu = new MainMenu();
    private UserController userController = new UserController();

    private final static String userMenu = "User menu. Choose what you want to do:" + "\n" +
            "1. Add user" + "\n" +
            "2. Find user" + "\n" +
            "3. Show list of users" + "\n" +
            "4. Delete user" + "\n" +
            "5. Sort list of users" + "\n" +
            "6. Exit";

    private final static String userFindMenu = "User search menu. Select the attribute by which you want to search:"
            + "\n" +
            "1. By Id" + "\n" +
            "2. By first name" + "\n" +
            "3. By second name" + "\n" +
            "4. By birthday" + "\n" +
            "5. Exit";

    private final static String sortMenu = "User sort menu. Select the attribute by which you want to sort:" + "\n" +
            "1. By first name" + "\n" +
            "2. By second name" + "\n" +
            "3. By birthday" + "\n" +
            "4. Exit";

    private Scanner in = new Scanner(System.in);

    public void userMenu() {
        String choice;
        System.out.println(userMenu);
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
                sortMenu();
                break;
            case "6":
                System.exit(0);
        }
    }

    private void sortMenu(){
        String choice;
        System.out.println(userFindMenu);
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
        }
    }

    private void sortByFirstName(){
        userController.sortByFirstName();
        mainMenu.showMenu();
    }

    private void sortBySecondName(){
        userController.sortBySecondName();
        mainMenu.showMenu();
    }

    private void sortByBirthDay(){
        userController.sortByBirthday();
        mainMenu.showMenu();
    }

    private void findUser() {
        String choice;
        System.out.println(userFindMenu);
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
        }
    }

    private void searchById() {
        System.out.println("Enter Id:");
        int checkingId = in.nextInt();
        userController.findUserById(checkingId);
        mainMenu.showMenu();
    }

    private void searchByFirstName() {
        System.out.println("Enter first name:");
        String checkingFirstName = in.nextLine();
        userController.findUserByFirstName(checkingFirstName);
        mainMenu.showMenu();
    }

    private void searchBySecondName() {
        System.out.println("Enter second name:");
        String checkingSecondName = in.nextLine();
        userController.findUserBySecondName(checkingSecondName);
        mainMenu.showMenu();
    }

    private void searchByBirthDay() {
        System.out.println("Enter birthday:");
        String checkingBirthDay = in.nextLine();
        userController.findUserBirthDay(checkingBirthDay);
        mainMenu.showMenu();
    }

    private void addingUser() {
        System.out.print("Enter user's first name:  ");
        String firstName = in.nextLine();
        System.out.print("Enter user's second name:  ");
        String secondName = in.nextLine();
        System.out.print("Enter user's birthday in form like 'DD/MM/YYYY':  ");
        String birthDay = in.nextLine();
        userController.create(firstName, secondName, birthDay);
        mainMenu.showMenu();
    }

    private void deleteUser() {
        System.out.print("Enter user's id you want to delete:");
        int idToDelete = in.nextInt();
        userController.delete(idToDelete);
        mainMenu.showMenu();
    }

    private void showingListOfUsers() {

        userController.showList();
        mainMenu.showMenu();
    }
}