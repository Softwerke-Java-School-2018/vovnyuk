package controller.device;

import comparators.*;
import entities.builders.DeviceBuilder;
import model.device.ModelDevice;

import java.util.ArrayList;
import java.util.Collections;

public class DeviceSortController {

    public void sortByType(){
        ArrayList<DeviceBuilder> entity = ModelDevice.getDevices();
        Collections.sort(entity, new TypeComparator());
        System.out.println("\nSorted by type");
        for (DeviceBuilder device:entity)
            System.out.println(device);
    }
    public void sortByManufacturer(){
        ArrayList<DeviceBuilder> entity = ModelDevice.getDevices();
        Collections.sort(entity, new ManufacturerComparator());
        System.out.println("\nSorted by manufacturer");
        for (DeviceBuilder device:entity)
            System.out.println(device);
    }
    public void sortByModel(){
        ArrayList<DeviceBuilder> entity = ModelDevice.getDevices();
        Collections.sort(entity, new ModelComparator());
        System.out.println("\nSorted by model");
        for (DeviceBuilder device:entity)
            System.out.println(device);
    }
    public void sortByColour(){
        ArrayList<DeviceBuilder> entity = ModelDevice.getDevices();
        Collections.sort(entity, Collections.reverseOrder(new ColourComparator()));
        System.out.println("\nSorted by colour");
        for (DeviceBuilder device:entity)
            System.out.println(device);
    }
    public void sortByPrice(){
        ArrayList<DeviceBuilder> entity = ModelDevice.getDevices();
        Collections.sort(entity, new PriceComparator());
        System.out.println("\nSorted by price");
        for (DeviceBuilder device:entity)
            System.out.println(device);
    }
    public void sortByDateOfManufacture(){
        ArrayList<DeviceBuilder> entity = ModelDevice.getDevices();
        Collections.sort(entity, new DateOfManufactureComparator());
        System.out.println("\nSorted by birthday");
        for (DeviceBuilder device:entity)
            System.out.println(device);
    }
}
