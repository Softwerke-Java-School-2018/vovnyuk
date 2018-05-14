package comparators;

import entities.builders.DeviceBuilder;

import java.util.Comparator;

public class DateOfManufactureComparator implements Comparator<DeviceBuilder> {

    public int compare(DeviceBuilder a, DeviceBuilder b) {
        return a.getDateOfManufacture().compareTo(b.getDateOfManufacture());
    }
}
