package controller.purchase;

import comparators.purchaseComparators.*;
import comparators.ModelComparator;
import comparators.ManufacturerComparator;

import entities.builders.DeviceBuilder;
import entities.builders.PurchaseBuilder;
import model.purchase.ModelPurchase;

import java.util.ArrayList;
import java.util.Collections;

public class PurchaseSortController {

    public void sortById(){

    }


    public void sortByFirstName() {
        ArrayList<PurchaseBuilder> entity = ModelPurchase.getListOfPurchases();
        Collections.sort(entity, new FirstNamePurchaseComparator());
        System.out.println("\nSorted by first name");
        for (PurchaseBuilder purchase : entity)
            System.out.println(purchase);
    }

    public void sortBySecondName() {
        ArrayList<PurchaseBuilder> entity = ModelPurchase.getListOfPurchases();
        Collections.sort(entity, new SecondNamePurchaseComparator());
        if (entity.size() == 0) {
            System.out.println("List is empty");
        } else {
            System.out.println("\nSorted by second name");
            for (PurchaseBuilder purchase : entity)
                System.out.println(purchase);
        }
    }

    public void sortByDateOfThePurchase() {
        ArrayList<PurchaseBuilder> entity = ModelPurchase.getListOfPurchases();
        Collections.sort(entity, new DateOfPurchaseComparator());
        System.out.println("\nSorted by birthday");
        for (PurchaseBuilder purchase : entity)
            System.out.println(purchase);
    }

    public void sortByPrice() {
        ArrayList<PurchaseBuilder> entity = ModelPurchase.getListOfPurchases();
        Collections.sort(entity, new TotalPricePurchaseComparator());
        System.out.println("\nSorted by price");
        for (PurchaseBuilder purchase : entity)
            System.out.println(purchase);
    }

//    public void sortByManufacturer() {
//        ArrayList<PurchaseBuilder> entity = ModelPurchase.getListOfPurchases();
//        for (PurchaseBuilder purchase : entity) {
//            ArrayList<PurchaseBuilder> deviceEntity = ModelPurchase.getListOfPurchases();
//            Collections.sort(deviceEntity, new ManufacturerComparator());
//            System.out.println("\nSorted by manufacturer");
//        }
//        for (PurchaseBuilder purchase : entity)
//            System.out.println(purchase);
//    }
//
//    public void sortByModel() {
//        ArrayList<PurchaseBuilder> entity = ModelPurchase.getListOfPurchases();
//
//        System.out.println("\nSorted by model");
//        for (PurchaseBuilder purchase : entity) {
//            ArrayList<DeviceBuilder> deviceEntity = purchase.getListOfPurchasedDevices();
//            Collections.sort(deviceEntity, new ModelPurchaseComparator());
//        }
//
//        for (DeviceBuilder device : deviceEntity)
//            System.out.println(purchase);
//    }
}
