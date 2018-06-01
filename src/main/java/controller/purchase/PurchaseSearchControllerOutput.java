package main.java.controller.purchase;

import main.java.entities.builders.PurchaseBuilder;

class PurchaseSearchControllerOutput {

    void purchaseSearchControllerOutput(PurchaseBuilder purchase) {
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
