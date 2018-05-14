package comparators.purchaseComparators;

import entities.builders.PurchaseBuilder;

import java.util.Comparator;

public class DateOfPurchaseComparator implements Comparator<PurchaseBuilder>{

    public int compare(PurchaseBuilder a, PurchaseBuilder b) {
        return a.getDateOfPurchase().compareTo(b.getDateOfPurchase());
    }
}