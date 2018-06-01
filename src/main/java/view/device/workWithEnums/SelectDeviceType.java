package main.java.view.device.workWithEnums;

import main.java.entities.enums.DeviceType;

import java.util.Scanner;

public class SelectDeviceType {

    private Scanner in = new Scanner(System.in);

    public DeviceType selectDeviceType() {
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
            default:
                System.out.println("Wrong enter. Enter only number of menu item (1-4)");
                selectDeviceType();
        }
        return selectedType;
    }
}
