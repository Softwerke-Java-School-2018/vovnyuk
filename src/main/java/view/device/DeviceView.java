package main.java.view.device;

import java.math.BigDecimal;
import java.util.Scanner;

import main.java.entities.enums.Colours;
import main.java.entities.enums.DeviceType;
import main.java.view.MainMenu;
import main.java.controller.device.DeviceController;
import main.java.view.device.workWithEnums.*;

public class DeviceView {

    private MainMenu mainMenu = new MainMenu();
    private DeviceController deviceController = new DeviceController();
    private TextForDeviceMenu textForDeviceMenu = new TextForDeviceMenu();
    private DeviceSearchMenu deviceSearchMenu = new DeviceSearchMenu();
    private DeviceSortMenu deviceSortMenu = new DeviceSortMenu();
    private SelectDeviceColour selectDeviceColour = new SelectDeviceColour();
    private SelectDeviceType selectDeviceType = new SelectDeviceType();
    private Scanner in = new Scanner(System.in);
    private Scanner kek = new Scanner(System.in);

    public void DeviceMenu() {
        String choice;
        textForDeviceMenu.deviceMenu();
        choice = in.nextLine();
        switch (choice) {
            case "1":
                addingDevice();
                break;
            case "2":
                findDevice();
                break;
            case "3":
                showingListOfDevices();
                break;
            case "4":
                deleteDevice();
                break;
            case "5":
                sortDevice();
                break;
            case "6":
                System.exit(0);
            default:
                System.out.println("Wrong enter. Enter only number of menu item (1-6)");
                DeviceMenu();
        }
    }

    private void addingDevice() {
        textForDeviceMenu.deviceTypeMenu();
        DeviceType selectedType = selectDeviceType.selectDeviceType();
        System.out.print("Enter the name of the manufacturer:  ");
        String manufacturer = in.nextLine();
        System.out.print("Enter the name of the main.java.model:  ");
        String model = in.nextLine();
        textForDeviceMenu.deviceColourMenu();
        Colours selectedColour = selectDeviceColour.selectDeviceColour();
        try {
            System.out.print("Enter the price of the device: ");
            BigDecimal price = kek.nextBigDecimal();
            System.out.print("Enter the date of manufacture in form like 'DD/MM/YYYY':");
            String dateOfManufacture = in.nextLine();
            deviceController.create(selectedType, manufacturer, model, selectedColour, price, dateOfManufacture);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Incorrect type of price");
        }
        mainMenu.showMenu();
    }

    private void findDevice() {
        deviceSearchMenu.deviceSearchMenu();
    }

    private void showingListOfDevices() {
        deviceController.showList();
        mainMenu.showMenu();
    }

    private void deleteDevice() {
        System.out.print("Enter device's id you want to delete:");
        int idToDelete = kek.nextInt();
        deviceController.delete(idToDelete);
        mainMenu.showMenu();
    }

    private void sortDevice() {
        deviceSortMenu.deviceSortMenu();
    }

}