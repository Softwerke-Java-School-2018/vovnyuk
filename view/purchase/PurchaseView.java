package view.purchase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

import controller.purchase.PurchaseController;
import entities.builders.Builder;
import entities.builders.DeviceBuilder;
import view.MainMenu;
import controller.user.UserController;

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

    private void purchaseSearchMenu(){
        purchaseSearchMenu.purchaseSearchMenu();
        mainMenu.showMenu();
    }

    private void purchaseSortMenu(){
        purchaseSortMenu.purchaseSortMenu();
        mainMenu.showMenu();
    }

    private void showListOfPurchases() {
        purchaseController.showList();
        mainMenu.showMenu();
    }

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

    private void purchaseRecordWithNewClient(){
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

    private void purchaseRecordWithOldClient() {
        int checkingUsersId;
        textForPurchaseMenu.findClientById();
        checkingUsersId = in.nextInt();
        Builder currentClient = purchaseController.findClientById(checkingUsersId);
        purchaseRecord(currentClient);
    }

    private DeviceBuilder findDeviceById() {
        int checkingDevicesId;
        textForPurchaseMenu.devicesIdToPurchase();
        checkingDevicesId = in.nextInt();
        DeviceBuilder currentDevice = purchaseController.findDeviceById(checkingDevicesId);
        return currentDevice;
    }

    private String dateOfPurchase() {
        String dateOfPurchase;
        textForPurchaseMenu.dateOfPurchase();
        dateOfPurchase = kek.nextLine();
        return dateOfPurchase;
    }

    private void deletePurchase(){
        System.out.print("Enter purchase's id you want to delete:");
        int idToDelete = kek.nextInt();
        purchaseController.delete(idToDelete);
        mainMenu.showMenu();
    }
}
