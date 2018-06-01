package main.java.model.purchase;

import main.java.entities.builders.PurchaseBuilder;

import java.util.ArrayList;
import java.util.ListIterator;

public class ModelPurchase {

    private static ArrayList<PurchaseBuilder> list = new ArrayList<>();


    public static ArrayList<PurchaseBuilder> getListOfPurchases() {
        return list;
    }

    public void deletePurchase(int idToDelete) {
        ArrayList<PurchaseBuilder> entity = getListOfPurchases();
        ListIterator<PurchaseBuilder> listIter = entity.listIterator();
        int initialSize = entity.size();
        while (listIter.hasNext()) {
            PurchaseBuilder next = listIter.next();
            if (idToDelete == next.getId()) {
                listIter.remove();
                System.out.println("Purchase has been successfully removed");
            }
        }
        if (initialSize == entity.size()) {
            System.out.println("There is no purchase with such id(" + idToDelete + ")");
        }
    }
}
