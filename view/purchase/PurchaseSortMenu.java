package view.purchase;

import controller.purchase.PurchaseSortController;
import view.MainMenu;

import java.util.Scanner;

public class PurchaseSortMenu {

    private TextForPurchaseMenu textForPurchaseMenu = new TextForPurchaseMenu();
    private PurchaseSortController purchaseSortController = new PurchaseSortController();
    private MainMenu mainMenu = new MainMenu();
    private Scanner in = new Scanner(System.in);

    public void purchaseSortMenu(){
        String choice;
        textForPurchaseMenu.purchaseSortMenu();
        choice = in.nextLine();
        switch (choice) {
            case "1":
                sortById();
                break;
            case "2":
                sortByFirstName();
                break;
            case "3":
                sortBySecondName();
                break;
//            case "4":
//                sortByManufacturer();
//                break;
//            case "5":
//                sortByModel();
//                break;
            case "6":
                sortByTotalPrice();
                break;
            case "7":
                sortByDateOfThePurchase();
                break;
            case "8":
                System.exit(0);
            default:
                System.out.println("Wrong enter. Enter only number of menu item (1-7)");
                purchaseSortMenu();
        }
    }

    private void sortById(){
        purchaseSortController.sortById();
        mainMenu.showMenu();
    }
    private void sortByFirstName() {
        purchaseSortController.sortByFirstName();
        mainMenu.showMenu();
    }

    private void sortBySecondName() {
        purchaseSortController.sortBySecondName();
        mainMenu.showMenu();
    }


//    private void sortByManufacturer() {
//        purchaseSortController.sortByManufacturer();
//        mainMenu.showMenu();
//    }
//
//    private void sortByModel() {
//        purchaseSortController.sortByModel();
//        mainMenu.showMenu();
//    }

    private void sortByTotalPrice() {
        purchaseSortController.sortByPrice();
        mainMenu.showMenu();
    }

    private void sortByDateOfThePurchase() {
        purchaseSortController.sortByDateOfThePurchase();
        mainMenu.showMenu();
    }
}
