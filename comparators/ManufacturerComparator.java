package comparators;

import entities.builders.DeviceBuilder;

import java.util.Comparator;

public class ManufacturerComparator implements Comparator<DeviceBuilder> {

    public int compare(DeviceBuilder a, DeviceBuilder b) {
        return a.getManufacturer().compareTo(b.getManufacturer());
    }
}
