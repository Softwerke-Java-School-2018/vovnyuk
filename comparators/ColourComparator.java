package comparators;

import entities.DeviceBuilder;

import java.util.Comparator;

public class ColourComparator implements Comparator<DeviceBuilder> {

    public int compare(DeviceBuilder a, DeviceBuilder b) {
        return a.getSelectedColour().compareTo(b.getSelectedColour());
    }
}
