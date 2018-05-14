package entities.dbOfClientsDevicesAndPurchases;

import controller.purchase.PurchaseController;
import entities.builders.DeviceBuilder;
import model.device.ModelDevice;

import java.math.BigDecimal;
import java.util.ArrayList;

public class AddDbOfPurchases {

    private PurchaseController purchaseController = new PurchaseController();

    private DeviceBuilder findDeviceById(int checkingId) {
        ArrayList<DeviceBuilder> entity = ModelDevice.getDevices();
        DeviceBuilder currentDevice = null;
        int i = 0;
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (DeviceBuilder device : entity) {
                if (checkingId == device.getId()) {
                    currentDevice = device;
                } else {
                    i = i + 1;
                }
            }
            if (i == entity.size()) {
                System.out.println("There is no device with such Id(" + checkingId + ")");
            }
        } return currentDevice;
    }

    public void addPurchases() {

        String firstName1 = "Artem";
        String firstName2 = "Evgeniy";
        String firstName3 = "Andrei";

        String secondName1 = "Kharakhnin";
        String secondName2 = "Vahtin";
        String secondName3 = "Pushkin";

        String dateOfPurchase1 = "13/03/2017";
        String dateOfPurchase2 = "21/07/2017";
        String dateOfPurchase3 = "14/05/2018";

        ArrayList<DeviceBuilder> list1 = new ArrayList<>();
        ArrayList<DeviceBuilder> list2 = new ArrayList<>();
        ArrayList<DeviceBuilder> list3 = new ArrayList<>();

        list1.add(findDeviceById(1));
        list1.add(findDeviceById(4));
        list2.add(findDeviceById(2));
        list2.add(findDeviceById(3));
        list2.add(findDeviceById(4));
        list3.add(findDeviceById(5));

        BigDecimal price1 = BigDecimal.valueOf(150000);
        BigDecimal price2 = BigDecimal.valueOf(140000);
        BigDecimal price3 = BigDecimal.valueOf(120000);


        purchaseController.create(firstName1, secondName1, list1, price1, dateOfPurchase1);
        purchaseController.create(firstName2, secondName2, list2, price2, dateOfPurchase2);
        purchaseController.create(firstName3, secondName3, list3, price3, dateOfPurchase3);
    }
}
