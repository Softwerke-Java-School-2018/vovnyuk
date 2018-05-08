package view.device;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Colours;
import entities.DeviceType;
import view.MainMenu;
import controller.device.DeviceController;
import view.device.TextForMenu;

public class DeviceView {

    private MainMenu mainMenu = new MainMenu();
    private DeviceController deviceController = new DeviceController();
    private TextForMenu textForMenu = new TextForMenu();
    private Scanner in = new Scanner(System.in);
    private Scanner kek = new Scanner(System.in);
    private String choice;

    public void DeviceMenu() {
        textForMenu.deviceMenu();
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
        }
    }

    private void findDevice(){
        textForMenu.deviceSearchMenu();
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
                System.exit(0);
        }
    }

    private void deleteDevice() {
        System.out.print("Enter device's id you want to delete:");
        int idToDelete = kek.nextInt();
        deviceController.delete(idToDelete);
        mainMenu.showMenu();
    }
    private void searchByType() {
        textForMenu.deviceTypeMenu();
        DeviceType checkingDeviceType = selectDeviceType();
        deviceController.findDeviceByType(checkingDeviceType);
        mainMenu.showMenu();
    }
    private void searchByManufacturer() {
        System.out.println("Enter device's manufacturer you want to find:");
        String checkingManufacturer = in.nextLine();
        deviceController.findDeviceByManufacturer(checkingManufacturer);
        mainMenu.showMenu();
    }

    private void searchByModel() {
        System.out.println("Enter model of device(s) you want to find:");
        String checkingModel = in.nextLine();
        deviceController.findDeviceByModel(checkingModel);
        mainMenu.showMenu();
    }

    private void searchByColour() {
        textForMenu.deviceColourMenu();
        Colours checkingDeviceColour = selectDeviceColour();
        deviceController.findDeviceByColour(checkingDeviceColour);
        mainMenu.showMenu();
    }


    private void searchByPrice() {
        System.out.println("Enter price of devices(s) you want to find:");
        BigDecimal checkingDevicePrice = in.nextBigDecimal();
        deviceController.findDeviceByPrice(checkingDevicePrice);
        mainMenu.showMenu();
    }

    private void searchByDateOfManufacture() {
        System.out.println("Enter date of manufacture:");
        String checkingDateOfManufacture = in.nextLine();
        deviceController.findDeviceByDateOfManufacture(checkingDateOfManufacture);
        mainMenu.showMenu();
    }

    private void sortDevice() {
        textForMenu.deviceSortMenu();
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
        }
    }

    private void sortByManufacturer() {
        deviceController.sortByManufacturer();
        mainMenu.showMenu();
    }

    private void sortByModel() {
        deviceController.sortByModel();
        mainMenu.showMenu();
    }

    private void sortByColour() {
        deviceController.sortByColour();
        mainMenu.showMenu();
    }

    private void sortByPrice() {
        deviceController.sortByPrice();
        mainMenu.showMenu();
    }

    private void sortByType() {
        deviceController.sortByType();
        mainMenu.showMenu();
    }

    private void sortByDateOfManufacture() {
        deviceController.sortByType();
        mainMenu.showMenu();
    }

    private void addingDevice() {
        textForMenu.deviceTypeMenu();
        DeviceType selectedType = selectDeviceType();
        System.out.print("Enter the name of the manufacturer:  ");
        String manufacturer = in.nextLine();
        System.out.print("Enter the name of the model:  ");
        String model = in.nextLine();
        textForMenu.deviceColourMenu();
        Colours selectedColour = selectDeviceColour();
        System.out.print("Enter the price of the device: ");
        BigDecimal price = kek.nextBigDecimal();
        System.out.print("Enter the date of manufacture in form like 'DD/MM/YYYY':");
        String dateOfManufacture = in.nextLine();
        deviceController.create(selectedType, manufacturer, model, selectedColour, price, dateOfManufacture);

        mainMenu.showMenu();
    }

    private Colours selectDeviceColour() {
        String choice;
        Colours selectedColour = null;
        choice = in.nextLine();
        switch (choice) {
            case "1":
                selectedColour = Colours.Red;
                break;
            case "2":
                selectedColour = Colours.Green;
                break;
            case "3":
                selectedColour = Colours.Blue;
                break;
        }
        return selectedColour;
    }

    private DeviceType selectDeviceType() {
        String choice;
        DeviceType selectedType = null;
        choice = in.nextLine();
        switch (choice) {
            case "1":
                selectedType = DeviceType.Phone;
                break;
            case "2":
                selectedType = DeviceType.Tablet;
                break;
            case "3":
                selectedType = DeviceType.Laptop;
                break;
            case "4":
                selectedType = DeviceType.Player;
                break;
        }
        return selectedType;
    }

    private void showingListOfDevices() {
        deviceController.showList();
        mainMenu.showMenu();
    }
}