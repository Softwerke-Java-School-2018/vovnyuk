package main.java.comparators.purchaseComparators;

import main.java.entities.builders.PurchaseBuilder;

import java.util.Comparator;

public class TotalPricePurchaseComparator implements Comparator<PurchaseBuilder> {

    public int compare(PurchaseBuilder a, PurchaseBuilder b) {
        return a.getPurchasesTotalPrice().compareTo(b.getPurchasesTotalPrice());
    }
}