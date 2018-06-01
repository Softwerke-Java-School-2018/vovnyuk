package main.java.entities.builders;

import main.java.entities.enums.Colours;
import main.java.entities.enums.DeviceType;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DeviceBuilder {

    private DeviceType selectedType;
    private String manufacturer;
    private String model;
    private Colours selectedColour;
    private BigDecimal price;
    private LocalDate dateOfManufacture;
    private static int i = 1;
    private int Id;

    public DeviceBuilder(DeviceType selectedType, String manufacturer, String model, Colours selectedColour,
                         BigDecimal price,LocalDate dateOfManufacture) {
        this.selectedType = selectedType;
        this.manufacturer = manufacturer;
        this.model = model;
        this.selectedColour = selectedColour;
        this.price = price;
        this.dateOfManufacture = dateOfManufacture;
        this.Id = i++;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public String getModel(){
        return model;
    }

    public DeviceType getSelectedType() {
        return selectedType;
    }

    public Colours getSelectedColour() {
        return selectedColour;
    }

    public long getId() {
        return Id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String toString()
    {
        return this.Id + " " + this.selectedType + " " + this.manufacturer + " " + this.model + " " +
                this.selectedColour + " " + this.price + " " + this.dateOfManufacture;
    }
}
