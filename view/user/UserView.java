package view.user;

import java.util.Scanner;

import controller.user.UserController;
import entities.This;
import view.MainMenu;

import model.DataTables;

public class UserView {

    private MainMenu mainMenu = new MainMenu();

    private UserController userController = new UserController();

//    private This userEntity = new This;

    private DataTables dataTables = new DataTables();

    private final static String userMenu = "User menu. Choose what you want to do:" + "\n" +
            "1. Add user" + "\n" +
            "2. Delete user" + "\n" +
            "3. Show list of users" + "\n" +
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
//            case "2":
//                deletingUser();
//                break;
            case "3":
                showingListOfUsers();
                break;
            case "0":
                System.exit(0);
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

    }

    private void showingListOfUsers() {


        dataTables.showRealTable();

        mainMenu.showMenu();
    }


}
