package entities;

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

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public DeviceType getSelectedType() {
        return selectedType;
    }

    public void setSelectedType(DeviceType selectedType) {
        this.selectedType = selectedType;
    }

    public Colours getSelectedColour() {
        return selectedColour;
    }

    public void setSelectedColour(Colours selectedColour) {
        this.selectedColour = selectedColour;
    }

    public long getId() {
        return Id;
    }

    public void setId() {
        Id = i++;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String toString()
    {
        return this.Id + " " + this.selectedType + " " + this.manufacturer + " " + this.model + " " +
                this.selectedColour + " " + this.price + " " + this.dateOfManufacture;
    }
}
