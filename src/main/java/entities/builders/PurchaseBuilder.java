package main.java.entities.builders;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class PurchaseBuilder {

    private String firstName;
    private String secondName;
    private static int i = 1;
    private ArrayList<DeviceBuilder> listOfPurchasedDevices;
    private BigDecimal purchasesTotalPrice;
    private int purchasesId;
    private LocalDate dateOfPurchase;

    public PurchaseBuilder(String firstName, String secondName, ArrayList<DeviceBuilder> listOfPurchasedDevices,
                           BigDecimal purchasesTotalPrice, LocalDate dateOfPurchase) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.listOfPurchasedDevices = listOfPurchasedDevices;
        this.purchasesTotalPrice = purchasesTotalPrice;
        this.dateOfPurchase = dateOfPurchase;
        this.purchasesId = i++;
    }

    public long getId() {
        return purchasesId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public ArrayList<DeviceBuilder> getListOfPurchasedDevices(){
        return listOfPurchasedDevices;
    }

    public BigDecimal getPurchasesTotalPrice() {
        return purchasesTotalPrice;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public String toString()
    {
        return this.purchasesId + " " + this.firstName + " " + this.secondName + " " + this.listOfPurchasedDevices +
                " " + this.purchasesTotalPrice + " " + this.dateOfPurchase;
    }

}
