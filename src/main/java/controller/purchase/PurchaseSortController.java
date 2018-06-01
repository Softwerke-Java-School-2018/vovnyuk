package main.java.controller.purchase;

import main.java.comparators.purchaseComparators.*;
import main.java.entities.builders.PurchaseBuilder;
import main.java.model.purchase.ModelPurchase;

import java.util.ArrayList;
import java.util.Collections;

public class PurchaseSortController {

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
}
