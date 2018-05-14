package comparators.purchaseComparators;

import entities.builders.PurchaseBuilder;

import java.util.Comparator;

public class SecondNamePurchaseComparator implements Comparator<PurchaseBuilder> {

    public int compare(PurchaseBuilder a, PurchaseBuilder b){
        return a.getSecondName().compareTo(b.getSecondName());
    }
}
