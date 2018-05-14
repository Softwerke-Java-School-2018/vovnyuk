package view.purchase;

import controller.purchase.PurchaseSortController;
import view.MainMenu;

import java.util.Scanner;

class PurchaseSortMenu {

    private TextForPurchaseMenu textForPurchaseMenu = new TextForPurchaseMenu();
    private PurchaseSortController purchaseSortController = new PurchaseSortController();
    private MainMenu mainMenu = new MainMenu();
    private Scanner in = new Scanner(System.in);

    void purchaseSortMenu(){
        String choice;
        textForPurchaseMenu.purchaseSortMenu();
        choice = in.nextLine();
        switch (choice) {
            case "1":
                sortByFirstName();
                break;
            case "2":
                sortBySecondName();
                break;
            case "3":
                sortByTotalPrice();
                break;
            case "4":
                sortByDateOfThePurchase();
                break;
            case "5":
                System.exit(0);
            default:
                System.out.println("Wrong enter. Enter only number of menu item (1-5)");
                purchaseSortMenu();
        }
    }

    private void sortByFirstName() {
        purchaseSortController.sortByFirstName();
        mainMenu.showMenu();
    }

    private void sortBySecondName() {
        purchaseSortController.sortBySecondName();
        mainMenu.showMenu();
    }

    private void sortByTotalPrice() {
        purchaseSortController.sortByPrice();
        mainMenu.showMenu();
    }

    private void sortByDateOfThePurchase() {
        purchaseSortController.sortByDateOfThePurchase();
        mainMenu.showMenu();
    }
}
