package model.device;

import entities.builders.DeviceBuilder;

import java.util.ArrayList;
import java.util.ListIterator;

public class ModelDevice {

    private static ArrayList<DeviceBuilder> list = new ArrayList<>();

//    public void addNext(DeviceBuilder device) {
//        this.list.add(device);
//    }

    public static ArrayList<DeviceBuilder> getDevices() {
        return list;
    }

    public void deleteDevice(int idToDelete) {
        ArrayList<DeviceBuilder> entity = getDevices();
        ListIterator<DeviceBuilder> listIter = entity.listIterator();
        int initialSize = entity.size();
        while (listIter.hasNext()) {
            DeviceBuilder next = listIter.next();
            if (idToDelete == next.getId()) {
                listIter.remove();
                System.out.println("Device has been successfully removed");
            }
        }
        if (initialSize == entity.size()) {
            System.out.println("There is no device with such id(" + idToDelete + ")");
        }
    }

}
