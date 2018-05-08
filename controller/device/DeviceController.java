package controller.device;

import comparators.*;
import entities.*;
import entities.DeviceBuilder;
import model.device.ModelDevice;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class DeviceController {

    private ModelDevice modelDevice = new ModelDevice();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void create(DeviceType selectedType, String manufacturer, String model, Colours selectedColour,
                       BigDecimal price, String dateOfManufacture) {
        try {
            LocalDate localDate = LocalDate.parse(dateOfManufacture, formatter);
            DeviceBuilder newDevice = new DeviceBuilder(selectedType, manufacturer, model, selectedColour, price, localDate);
            modelDevice.addNext(newDevice);
            System.out.println("Device has been successfully added");
        } catch (DateTimeParseException e) {
            System.out.println("Incorrect date of manufacture");
        }
    }

    public void showList() {
        ArrayList<DeviceBuilder> entity = modelDevice.getClients();
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (DeviceBuilder device : entity) {
                System.out.println("Id:" + device.getId());
                System.out.println("Type:" + device.getSelectedType());
                System.out.println("Manufacturer:" + device.getManufacturer());
                System.out.println("Model:" + device.getModel());
                System.out.println("Colour:" + device.getSelectedColour());
                System.out.println("Price:" + device.getPrice());
                System.out.println("Date of manufacture:" + device.getDateOfManufacture());

            }
        }
    }

    public void delete(int idToDelete) {
        ArrayList<DeviceBuilder> entity = modelDevice.getClients();
        modelDevice.deleteDevice(idToDelete);
        System.out.println("User has been successfully removed");
    }

    public void sortByType(){
        ArrayList<DeviceBuilder> entity = modelDevice.getClients();
        Collections.sort(entity, new TypeComparator());
        System.out.println("\nSorted by type");
        for (int i=0; i<entity.size(); i++)
            System.out.println(entity.get(i));
    }
    public void sortByManufacturer(){
        ArrayList<DeviceBuilder> entity = modelDevice.getClients();
        Collections.sort(entity, new ManufacturerComparator());
        System.out.println("\nSorted by manufacturer");
        for (int i=0; i<entity.size(); i++)
            System.out.println(entity.get(i));
    }
    public void sortByModel(){
        ArrayList<DeviceBuilder> entity = modelDevice.getClients();
        Collections.sort(entity, new ModelComparator());
        System.out.println("\nSorted by model");
        for (int i=0; i<entity.size(); i++)
            System.out.println(entity.get(i));
    }
    public void sortByColour(){
        ArrayList<DeviceBuilder> entity = modelDevice.getClients();
        Collections.sort(entity, Collections.reverseOrder(new ColourComparator()));
        System.out.println("\nSorted by colour");
        for (int i=0; i<entity.size(); i++)
            System.out.println(entity.get(i));
    }
    public void sortByPrice(){
        ArrayList<DeviceBuilder> entity = modelDevice.getClients();
        Collections.sort(entity, new PriceComparator());
        System.out.println("\nSorted by price");
        for (int i=0; i<entity.size(); i++)
            System.out.println(entity.get(i));
    }
    public void sortByDateOfManufacture(){
        ArrayList<DeviceBuilder> entity = modelDevice.getClients();
        Collections.sort(entity, new DateOfManufactureComparator());
        System.out.println("\nSorted by birthday");
        for (int i=0; i<entity.size(); i++)
            System.out.println(entity.get(i));
    }
    private int i = 0;

    public void findDeviceByType(DeviceType checkingType) {
        ArrayList<DeviceBuilder> entity = modelDevice.getClients();
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (DeviceBuilder device : entity) {
                if (checkingType.equals(device.getSelectedType())) {
                    System.out.println("Id:" + device.getId());
                    System.out.println("Type:" + device.getSelectedType());
                    System.out.println("Manufacturer:" + device.getManufacturer());
                    System.out.println("Model:" + device.getModel());
                    System.out.println("Colour:" + device.getSelectedColour());
                    System.out.println("Price:" + device.getPrice());
                    System.out.println("Date of manufacture:" + device.getDateOfManufacture());
                } else {
                    i = i + 1;
                }
            }
            if (i > 0) {
                System.out.println("There is no device of such type (" + checkingType + ")");
            }
        }
    }
    public void findDeviceByManufacturer(String checkingManufacturer) {
        ArrayList<DeviceBuilder> entity = modelDevice.getClients();
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (DeviceBuilder device : entity) {
                if (checkingManufacturer.equals(device.getManufacturer())) {
                    System.out.println("Id:" + device.getId());
                    System.out.println("Type:" + device.getSelectedType());
                    System.out.println("Manufacturer:" + device.getManufacturer());
                    System.out.println("Model:" + device.getModel());
                    System.out.println("Colour:" + device.getSelectedColour());
                    System.out.println("Price:" + device.getPrice());
                    System.out.println("Date of manufacture:" + device.getDateOfManufacture());
                } else {
                    i = i + 1;
                }
            }
            if (i > 0) {
                System.out.println("There is no device of such manufacturer (" + checkingManufacturer + ")");
            }
        }
    }
    public void findDeviceByModel(String checkingModel) {
        ArrayList<DeviceBuilder> entity = modelDevice.getClients();
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (DeviceBuilder device : entity) {
                if (checkingModel.equals(device.getModel())) {
                    System.out.println("Id:" + device.getId());
                    System.out.println("Type:" + device.getSelectedType());
                    System.out.println("Manufacturer:" + device.getManufacturer());
                    System.out.println("Model:" + device.getModel());
                    System.out.println("Colour:" + device.getSelectedColour());
                    System.out.println("Price:" + device.getPrice());
                    System.out.println("Date of manufacture:" + device.getDateOfManufacture());
                } else {
                    i = i + 1;
                }
            }
            if (i > 0) {
                System.out.println("There is no device of such model (" + checkingModel + ")");
            }
        }
    }
    public void findDeviceByColour(Colours checkingColour) {
        ArrayList<DeviceBuilder> entity = modelDevice.getClients();
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (DeviceBuilder device : entity) {
                if (checkingColour.equals(device.getSelectedColour())) {
                    System.out.println("Id:" + device.getId());
                    System.out.println("Type:" + device.getSelectedType());
                    System.out.println("Manufacturer:" + device.getManufacturer());
                    System.out.println("Model:" + device.getModel());
                    System.out.println("Colour:" + device.getSelectedColour());
                    System.out.println("Price:" + device.getPrice());
                    System.out.println("Date of manufacture:" + device.getDateOfManufacture());
                } else {
                    i = i + 1;
                }
            }
            if (i > 0) {
                System.out.println("There is no device of such colour (" + checkingColour + ")");
            }
        }
    }
    public void findDeviceByPrice(BigDecimal checkingPrice) {
        ArrayList<DeviceBuilder> entity = modelDevice.getClients();
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (DeviceBuilder device : entity) {
                if (checkingPrice.equals(device.getPrice())) {
                    System.out.println("Id:" + device.getId());
                    System.out.println("Type:" + device.getSelectedType());
                    System.out.println("Manufacturer:" + device.getManufacturer());
                    System.out.println("Model:" + device.getModel());
                    System.out.println("Colour:" + device.getSelectedColour());
                    System.out.println("Price:" + device.getPrice());
                    System.out.println("Date of manufacture:" + device.getDateOfManufacture());
                } else {
                    i = i + 1;
                }
            }
            if (i > 0) {
                System.out.println("There is no device of such price (" + checkingPrice + ")");
            }
        }
    }
    public void findDeviceByDateOfManufacture(String checkingDateOfManufacture) {
        ArrayList<DeviceBuilder> entity = modelDevice.getClients();
        LocalDate localDate = LocalDate.parse(checkingDateOfManufacture, formatter);
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (DeviceBuilder device : entity) {
                if (localDate.equals(device.getDateOfManufacture())) {
                    System.out.println("Id:" + device.getId());
                    System.out.println("Type:" + device.getSelectedType());
                    System.out.println("Manufacturer:" + device.getManufacturer());
                    System.out.println("Model:" + device.getModel());
                    System.out.println("Colour:" + device.getSelectedColour());
                    System.out.println("Price:" + device.getPrice());
                    System.out.println("Date of manufacture:" + device.getDateOfManufacture());
                } else {
                    i = i + 1;
                }
            }
            if (i > 0) {
                System.out.println("There is no device manufactured at:" + checkingDateOfManufacture);
            }
        }
    }
}