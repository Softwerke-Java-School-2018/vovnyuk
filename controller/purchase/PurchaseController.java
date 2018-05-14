package controller.purchase;

import entities.builders.Builder;
import entities.builders.DeviceBuilder;
import entities.builders.PurchaseBuilder;
import model.device.ModelDevice;
import model.purchase.ModelPurchase;
import model.user.ModelUser;
import view.MainMenu;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class PurchaseController {

    private static ArrayList<PurchaseBuilder> listOfPurchases = ModelPurchase.getListOfPurchases();
    private MainMenu mainMenu = new MainMenu();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void create(String firstName, String secondName, ArrayList<DeviceBuilder> currentList,
                       BigDecimal purchasesPrice, String dateOfPurchase) {
        try {
            LocalDate localDate = LocalDate.parse(dateOfPurchase, formatter);
            PurchaseBuilder newPurchase = new PurchaseBuilder(firstName, secondName,currentList,
                    purchasesPrice, localDate);
            listOfPurchases.add(newPurchase);
        } catch (DateTimeParseException e) {
            System.out.println("Incorrect date of purchase format");
        }
    }

    public Builder findClientById(int checkingUsersId) {
        ArrayList<Builder> entity = ModelUser.getClients();
        int i = 0;
        Builder theRightClient = null;
        if (entity == null || entity.isEmpty()) {
            System.out.println("This list is empty");
        } else {
            for (Builder user : entity) {
                if (checkingUsersId == user.getId()) {
                    theRightClient = user;
                } else {
                    i = i + 1;
                }
            }
            if (i == entity.size()) {
                System.out.println("There is no client with such Id(" + checkingUsersId + ")");
                mainMenu.showMenu();
            }
        }
        return theRightClient;
    }

    public Builder findNewClientById(){
        ArrayList<Builder> entity = ModelUser.getClients();
        Builder theRightClient = null;
        if (entity == null || entity.isEmpty()) {
            System.out.println("This list is empty");
        } else {
                theRightClient = entity.get(entity.size()-1);
        }
        return theRightClient;
    }

    public DeviceBuilder findDeviceById(int checkingUsersId) {

        ArrayList<DeviceBuilder> entity = ModelDevice.getDevices();
        int i = 0;
        DeviceBuilder theRightDevice = null;
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (DeviceBuilder device : entity) {
                if (checkingUsersId == device.getId()) {
                    theRightDevice = device;
                } else {
                    i = i + 1;
                }
            }
            if (i == entity.size()) {
                System.out.println("There is no device with such Id(" + checkingUsersId + ")");
                mainMenu.showMenu();
            }
        }
        return theRightDevice;
    }

    public void delete(int idToDelete) {
        ModelPurchase modelPurchase = new ModelPurchase();
        modelPurchase.deletePurchase(idToDelete);
    }

    public void showList() {
        ArrayList<PurchaseBuilder> entity = ModelPurchase.getListOfPurchases();
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (PurchaseBuilder purchase : entity) {

                System.out.println("Who purchased:");
                System.out.print(purchase.getFirstName());
                System.out.println(" " + purchase.getSecondName());
                System.out.println("What purchased: ");
                System.out.println("Device(s): " + purchase.getListOfPurchasedDevices());
                System.out.print("Purchase's id: " + purchase.getId());
                System.out.print(" Purchase's total price: " + purchase.getPurchasesTotalPrice());
                System.out.println(" When purchased: " + purchase.getDateOfPurchase());

            }
        }
    }

}
