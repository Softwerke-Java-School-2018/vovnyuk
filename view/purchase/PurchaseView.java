package view.purchase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

import controller.purchase.PurchaseController;
import entities.builders.Builder;
import entities.builders.DeviceBuilder;
import view.MainMenu;
import controller.user.UserController;


/**
 * Purchase part of view. Creates menu for the client.
 * There is method for creating a new purchase.
 * If you want to search or sort, this class will send you to PurchaseSearchMenu or PurchaseSortMenu (
 * respectively)
 */

public class PurchaseView {

    private TextForPurchaseMenu textForPurchaseMenu = new TextForPurchaseMenu();
    private PurchaseController purchaseController = new PurchaseController();
    private PurchaseSearchMenu purchaseSearchMenu = new PurchaseSearchMenu();
    private UserController userController = new UserController();
    private PurchaseSortMenu purchaseSortMenu = new PurchaseSortMenu();
    private MainMenu mainMenu = new MainMenu();
    private Scanner in = new Scanner(System.in);
    private Scanner kek = new Scanner(System.in);
    private Scanner anotherOne = new Scanner(System.in);

    /**
     * Method that creates a menu.
     */
    public void purchaseMenu() {
        String choice;
        textForPurchaseMenu.purchaseMenu();
        choice = kek.nextLine();
        switch (choice) {
            case "1":
                newPurchaseMenu();
                break;
            case "2":
                purchaseSearchMenu();
                break;
            case "3":
                showListOfPurchases();
                break;
            case "4":
                deletePurchase();
                break;
            case "5":
                purchaseSortMenu();
                break;
            case "6":
                System.exit(0);
                break;
            default:
                System.out.println("Wrong enter. Enter only number of menu item (1-6) ");
                purchaseMenu();
        }

    }

    /**
     * Method that is reliable for search. It will send user's request to purchaseSearchMenu.
     */
    private void purchaseSearchMenu() {
        purchaseSearchMenu.purchaseSearchMenu();
        mainMenu.showMenu();
    }

    /**
     * Method that is reliable for sort. It will send user's request to purchaseSortMenu.
     */
    private void purchaseSortMenu() {
        purchaseSortMenu.purchaseSortMenu();
        mainMenu.showMenu();
    }

    /**
     * Method that is reliable for showing list of all purchases. It will send user's request to purchaseController.
     */
    private void showListOfPurchases() {
        purchaseController.showList();
        mainMenu.showMenu();
    }

    /**
     * This method creates menu for repeated request to purchase a device.
     * It will appear once, and then it can disappear according to the user's decision.
     */
    private void newPurchaseMenu() {
        String choice;
        textForPurchaseMenu.newPurchaseMenu();
        choice = kek.nextLine();
        switch (choice) {
            case "1":
                purchaseRecordWithOldClient();
                break;
            case "2":
                purchaseRecordWithNewClient();
                break;
            default:
                System.out.println("Wrong enter. Enter only number of menu item (1, 2) ");
                newPurchaseMenu();
        }
    }

    /**
     * @param currentClient - client from the list of clients. T - Builder.
     *                      You should know which client will purchase a device and after that will be in list
     *                      of purchases.
     */
    private void purchaseRecord(Builder currentClient) {
        ArrayList<DeviceBuilder> currentListOfPurchasedDevices = new ArrayList<>();
        String doYouWantToRepeat;
        BigDecimal totalPrice = new BigDecimal(0);
        String firstName = currentClient.getFirstName();
        String secondName = currentClient.getSecondName();
        DeviceBuilder currentDeviceFirstPurchase = findDeviceById();
        currentListOfPurchasedDevices.add(currentDeviceFirstPurchase);
        do {
            textForPurchaseMenu.doYouWantToRepeat();
            doYouWantToRepeat = kek.nextLine();
            switch (doYouWantToRepeat) {
                case "1":
                    DeviceBuilder currentDeviceNextPurchase = findDeviceById();
                    currentListOfPurchasedDevices.add(currentDeviceNextPurchase);
                    break;
                case "2":
                    break;
                default:
                    System.out.println("Wrong enter. Here you were supposed to enter only number of menu item(1, 2)." +
                            " Please go through the procedure again. ");
                    purchaseRecord(currentClient);
            }
        } while (doYouWantToRepeat.equals("1"));
        for (DeviceBuilder device : currentListOfPurchasedDevices)
            totalPrice = totalPrice.add(device.getPrice());
        String dateOfPurchase = dateOfPurchase();
        purchaseController.create(firstName, secondName, currentListOfPurchasedDevices, totalPrice, dateOfPurchase);
        System.out.println("Thank you for using our service. See you soon!");
        mainMenu.showMenu();
    }

    /**
     * Purchase's record to the list with a new client in the store.
     */
    private void purchaseRecordWithNewClient() {
        System.out.print("Enter your first name:  ");
        String firstName = anotherOne.nextLine();
        System.out.print("Enter your second name:  ");
        String secondName = anotherOne.nextLine();
        System.out.print("Enter your birthday in form like 'DD/MM/YYYY':  ");
        String birthDay = anotherOne.nextLine();
        userController.create(firstName, secondName, birthDay);
        Builder currentClient = purchaseController.findNewClientById();
        purchaseRecord(currentClient);
    }

    /**
     * Purchase's record to the list with an old client in the store.
     */
    private void purchaseRecordWithOldClient() {
        int checkingUsersId;
        textForPurchaseMenu.findClientById();
        checkingUsersId = in.nextInt();
        Builder currentClient = purchaseController.findClientById(checkingUsersId);
        purchaseRecord(currentClient);
    }

    /**
     * Method for searching device from device list by id.
     */
    private DeviceBuilder findDeviceById() {
        int checkingDevicesId;
        textForPurchaseMenu.devicesIdToPurchase();
        checkingDevicesId = in.nextInt();
        DeviceBuilder currentDevice = purchaseController.findDeviceById(checkingDevicesId);
        return currentDevice;
    }

    /**
     * Method for recording the date of purchase.
     */
    private String dateOfPurchase() {
        String dateOfPurchase;
        textForPurchaseMenu.dateOfPurchase();
        dateOfPurchase = kek.nextLine();
        return dateOfPurchase;
    }

    /**
     * Method for deleting purchase by its id.
     */
    private void deletePurchase() {
        System.out.print("Enter purchase's id you want to delete:");
        int idToDelete = kek.nextInt();
        purchaseController.delete(idToDelete);
        mainMenu.showMenu();
    }
}
