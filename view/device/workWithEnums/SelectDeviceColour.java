package view.device.workWithEnums;

import entities.enums.Colours;

import java.util.Scanner;

public class SelectDeviceColour {

    private Scanner in = new Scanner(System.in);

    public Colours selectDeviceColour() {
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
            case "4":
                selectedColour = Colours.White;
                break;
            case "5":
                selectedColour = Colours.Black;
                break;
            case "6":
                selectedColour = Colours.Gold;
                break;
            case "7":
                selectedColour = Colours.Silver;
                break;
            default:
                System.out.println("Wrong enter. Enter only number of menu item (1-7)");
                selectDeviceColour();
        }
        return selectedColour;
    }

}
