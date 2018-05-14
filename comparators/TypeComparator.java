package comparators;

import entities.builders.DeviceBuilder;

import java.util.Comparator;

public class TypeComparator implements Comparator<DeviceBuilder> {

    public int compare(DeviceBuilder a, DeviceBuilder b) {
        return a.getSelectedType().compareTo(b.getSelectedType());
    }
}
