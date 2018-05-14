package controller.purchase;

import entities.builders.DeviceBuilder;
import entities.builders.PurchaseBuilder;
import model.purchase.ModelPurchase;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class PurchaseSearchController {

    private PurchaseSearchControllerOutput purchaseSearchControllerOutput = new PurchaseSearchControllerOutput();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void findPurchaseById(int checkingId) {
        ArrayList<PurchaseBuilder> entity = ModelPurchase.getListOfPurchases();
        int i = 0;
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (PurchaseBuilder purchase : entity) {
                if (checkingId == purchase.getId()) {
                    purchaseSearchControllerOutput.purchaseSearchControllerOutput(purchase);
                } else {
                    i = i + 1;
                }
            }
            if (i == entity.size()) {
                System.out.println("There is no purchase with such Id(" + checkingId + ")");
            }
        }
    }

    public void findPurchaseByTotalPrice(int checkingPrice) {
        ArrayList<PurchaseBuilder> entity = ModelPurchase.getListOfPurchases();
        BigDecimal checkingTotalPrice = BigDecimal.valueOf(checkingPrice);
        int i = 0;
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (PurchaseBuilder purchase : entity) {
                if (checkingTotalPrice.equals(purchase.getPurchasesTotalPrice())) {
                    purchaseSearchControllerOutput.purchaseSearchControllerOutput(purchase);
                } else {
                    i = i + 1;
                }
            }
            if (i == entity.size()) {
                System.out.println("There is no purchase of such price(" + checkingTotalPrice + ")");
            }
        }
    }

    public void findPurchaseByFirstName(String checkingFirstName) {
        ArrayList<PurchaseBuilder> entity = ModelPurchase.getListOfPurchases();
        int i = 0;
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (PurchaseBuilder purchase : entity) {
                if (checkingFirstName.equals(purchase.getFirstName())) {
                    purchaseSearchControllerOutput.purchaseSearchControllerOutput(purchase);
                } else {
                    i = i + 1;
                }
            }
            if (i == entity.size()) {
                System.out.println("There is no purchase done by client with such first name (" + checkingFirstName + ")");
            }
        }
    }

    public void findPurchaseBySecondName(String checkingSecondName) {
        ArrayList<PurchaseBuilder> entity = ModelPurchase.getListOfPurchases();
        int i = 0;
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (PurchaseBuilder purchase : entity) {
                if (checkingSecondName.equals(purchase.getSecondName())) {
                    purchaseSearchControllerOutput.purchaseSearchControllerOutput(purchase);
                } else {
                    i = i + 1;
                }
            }
            if (i == entity.size()) {
                System.out.println("There is no purchase done by client with such second name (" + checkingSecondName + ")");
            }
        }
    }

    public void findPurchaseByManufacturer(String checkingManufacturer) {
        ArrayList<PurchaseBuilder> entity = ModelPurchase.getListOfPurchases();
        int i = 0;
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (PurchaseBuilder purchase : entity) {
                ArrayList<DeviceBuilder> deviceEntity = purchase.getListOfPurchasedDevices();
                for (DeviceBuilder device : deviceEntity)
                    if (checkingManufacturer.equals(device.getManufacturer())) {
                        purchaseSearchControllerOutput.purchaseSearchControllerOutput(purchase);
                    } else {
                        i = i + 1;
                    }
            }
            if (i == entity.size()) {
                System.out.println("There is no purchased device of such manufacturer (" + checkingManufacturer + ")");
            }
        }
    }

    public void findPurchaseByModel(String checkingModel) {
        ArrayList<PurchaseBuilder> entity = ModelPurchase.getListOfPurchases();
        int i = 0;
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (PurchaseBuilder purchase : entity) {
                ArrayList<DeviceBuilder> deviceEntity = purchase.getListOfPurchasedDevices();
                for (DeviceBuilder device : deviceEntity)
                    if (checkingModel.equals(device.getModel())) {
                        purchaseSearchControllerOutput.purchaseSearchControllerOutput(purchase);
                    } else {
                        i = i + 1;
                    }
            }
            if (i == entity.size()) {
                System.out.println("There is no purchased device of such model (" + checkingModel + ")");
            }
        }
    }

    public void findPurchaseByDateOfPurchase(String checkingDateOfPurchase) {
        try {
            ArrayList<PurchaseBuilder> entity = ModelPurchase.getListOfPurchases();
            LocalDate localDate = LocalDate.parse(checkingDateOfPurchase, formatter);
            int i = 0;
            if (entity.size() == 0) {
                System.out.println("This list is empty");
            } else {
                for (PurchaseBuilder purchase : entity) {
                    if (localDate.equals(purchase.getDateOfPurchase())) {
                        purchaseSearchControllerOutput.purchaseSearchControllerOutput(purchase);
                    } else {
                        i = i + 1;
                    }
                }
                if (i == entity.size()) {
                    System.out.println("There is no purchase done in that day(" + checkingDateOfPurchase + ")");
                }
            }
        } catch (DateTimeParseException e) {
            System.out.println("Incorrect birthday format");
        }
    }
}
