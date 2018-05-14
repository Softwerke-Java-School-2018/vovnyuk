package view.device;

import java.util.Scanner;
import controller.device.DeviceSortController;
import view.MainMenu;

class DeviceSortMenu {

    private TextForDeviceMenu textForDeviceMenu = new TextForDeviceMenu();
    private DeviceSortController deviceSortController = new DeviceSortController();
    private MainMenu mainMenu = new MainMenu();
    private Scanner in = new Scanner(System.in);

    void deviceSortMenu() {

        String choice;
        textForDeviceMenu.deviceSortMenu();
        choice = in.nextLine();
        switch (choice) {
            case "1":
                sortByType();
                break;
            case "2":
                sortByManufacturer();
                break;
            case "3":
                sortByModel();
                break;
            case "4":
                sortByColour();
                break;
            case "5":
                sortByPrice();
                break;
            case "6":
                sortByDateOfManufacture();
                break;
            case "7":
                System.exit(0);
            default:
                System.out.println("Wrong enter. Enter only number of menu item (1-7)");
                deviceSortMenu();
        }
    }

    private void sortByType() {
        deviceSortController.sortByType();
        mainMenu.showMenu();
    }

    private void sortByManufacturer() {
        deviceSortController.sortByManufacturer();
        mainMenu.showMenu();
    }

    private void sortByModel() {
        deviceSortController.sortByModel();
        mainMenu.showMenu();
    }

    private void sortByColour() {
        deviceSortController.sortByColour();
        mainMenu.showMenu();
    }

    private void sortByPrice() {
        deviceSortController.sortByPrice();
        mainMenu.showMenu();
    }

    private void sortByDateOfManufacture() {
        deviceSortController.sortByDateOfManufacture();
        mainMenu.showMenu();
    }
}
