package main.java.view.device;

import main.java.entities.enums.*;
import main.java.view.MainMenu;
import main.java.controller.device.DeviceSearchController;
import main.java.view.device.workWithEnums.SelectDeviceColour;
import main.java.view.device.workWithEnums.SelectDeviceType;

import java.math.BigDecimal;
import java.util.Scanner;

class DeviceSearchMenu {

    private TextForDeviceMenu textForDeviceMenu = new TextForDeviceMenu();
    private Scanner in = new Scanner(System.in);
    private SelectDeviceColour selectDeviceColour = new SelectDeviceColour();
    private SelectDeviceType selectDeviceType = new SelectDeviceType();
    private MainMenu mainMenu = new MainMenu();
    private DeviceSearchController deviceSearchController = new DeviceSearchController();

    void deviceSearchMenu() {
        String choice;
        textForDeviceMenu.deviceSearchMenu();
        choice = in.nextLine();
        switch (choice) {
            case "1":
                searchByType();
                break;
            case "2":
                searchByManufacturer();
                break;
            case "3":
                searchByModel();
                break;
            case "4":
                searchByColour();
                break;
            case "5":
                searchByPrice();
                break;
            case "6":
                searchByDateOfManufacture();
                break;
            case "7":
                searchById();
                break;
            case "8":
                System.exit(0);
            default:
                System.out.println("Wrong enter. Enter only number of menu item (1-7)");
                deviceSearchMenu();
        }
    }

    private void searchById(){
        System.out.println("Enter device's id you want to find:");
        int checkingId = in.nextInt();
        deviceSearchController.findDeviceById(checkingId);
        mainMenu.showMenu();
    }

    private void searchByType() {
        textForDeviceMenu.deviceTypeMenu();
        DeviceType checkingDeviceType = selectDeviceType.selectDeviceType();
        deviceSearchController .findDeviceByType(checkingDeviceType);
        mainMenu.showMenu();
    }

    private void searchByManufacturer() {
        System.out.println("Enter device's manufacturer you want to find:");
        String checkingManufacturer = in.nextLine();
        deviceSearchController .findDeviceByManufacturer(checkingManufacturer);
        mainMenu.showMenu();
    }

    private void searchByModel() {
        System.out.println("Enter main.java.model of device(s) you want to find:");
        String checkingModel = in.nextLine();
        deviceSearchController .findDeviceByModel(checkingModel);
        mainMenu.showMenu();
    }

    private void searchByColour() {
        textForDeviceMenu.deviceColourMenu();
        Colours checkingDeviceColour = selectDeviceColour.selectDeviceColour();
        deviceSearchController .findDeviceByColour(checkingDeviceColour);
        mainMenu.showMenu();
    }


    private void searchByPrice() {
        System.out.println("Enter price of devices(s) you want to find:");
        BigDecimal checkingDevicePrice = in.nextBigDecimal();
        deviceSearchController .findDeviceByPrice(checkingDevicePrice);
        mainMenu.showMenu();
    }

    private void searchByDateOfManufacture() {
        System.out.println("Enter date of manufacture:");
        String checkingDateOfManufacture = in.nextLine();
        deviceSearchController.findDeviceByDateOfManufacture(checkingDateOfManufacture);
        mainMenu.showMenu();
    }
}