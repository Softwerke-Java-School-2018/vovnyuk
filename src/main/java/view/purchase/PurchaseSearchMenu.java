package main.java.view.purchase;

import java.util.Scanner;

import main.java.controller.purchase.PurchaseSearchController;
import main.java.view.MainMenu;

class PurchaseSearchMenu {

    private TextForPurchaseMenu textForPurchaseMenu = new TextForPurchaseMenu();
    private PurchaseSearchController purchaseSearchController = new PurchaseSearchController();
    private MainMenu mainMenu = new MainMenu();
    private Scanner in = new Scanner(System.in);

    void purchaseSearchMenu() {
        String choice;
        textForPurchaseMenu.purchaseSearchMenu();
        choice = in.nextLine();
        switch (choice) {
            case "1":
                searchByClientsFirstName();
                break;
            case "2":
                searchByClientsSecondName();
                break;
            case "3":
                searchByManufacturer();
                break;
            case "4":
                searchByModel();
                break;
            case "5":
                searchByPrice();
                break;
            case "6":
                searchByDateOfPurchase();
                break;
            case "7":
                searchByPurchasesId();
                break;
            case "8":
                System.exit(0);
            default:
                System.out.println("Wrong enter. Enter only number of menu item (1-8)");
                purchaseSearchMenu();
        }
    }

    private void searchByPurchasesId() {
        System.out.println("Enter Id:");
        int checkingId = in.nextInt();
        purchaseSearchController.findPurchaseById(checkingId);
        mainMenu.showMenu();
    }

    private void searchByPrice() {
        System.out.println("Enter price of the purchase:");
        int checkingPrice = in.nextInt();
        purchaseSearchController.findPurchaseByTotalPrice(checkingPrice);
        mainMenu.showMenu();
    }

    private void searchByClientsFirstName() {
        System.out.println("Enter first name:");
        String checkingFirstName = in.nextLine();
        purchaseSearchController.findPurchaseByFirstName(checkingFirstName);
        mainMenu.showMenu();
    }

    private void searchByClientsSecondName() {
        System.out.println("Enter second name:");
        String checkingSecondName = in.nextLine();
        purchaseSearchController.findPurchaseBySecondName(checkingSecondName);
        mainMenu.showMenu();
    }

    private void searchByManufacturer() {
        System.out.println("Enter device's manufacturer you want to find:");
        String checkingManufacturer = in.nextLine();
        purchaseSearchController.findPurchaseByManufacturer(checkingManufacturer);
        mainMenu.showMenu();
    }

    private void searchByModel() {
        System.out.println("Enter main.java.model of device(s) you want to find:");
        String checkingModel = in.nextLine();
        purchaseSearchController.findPurchaseByModel(checkingModel);
        mainMenu.showMenu();
    }

    private void searchByDateOfPurchase() {
        System.out.println("Enter date of manufacture:");
        String checkingDateOfPurchase = in.nextLine();
        purchaseSearchController.findPurchaseByDateOfPurchase(checkingDateOfPurchase);
        mainMenu.showMenu();
    }
}
