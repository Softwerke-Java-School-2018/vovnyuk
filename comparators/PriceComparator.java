package comparators;

import entities.builders.DeviceBuilder;

import java.util.Comparator;

public class PriceComparator implements Comparator<DeviceBuilder> {
    public int compare(DeviceBuilder a, DeviceBuilder b) {
        return a.getPrice().compareTo(b.getPrice());
    }
}