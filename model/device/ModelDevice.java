package model.device;

import entities.DeviceBuilder;

import java.util.ArrayList;
import java.util.ListIterator;

public class ModelDevice {

    private ArrayList<DeviceBuilder> list = new ArrayList<>();

    public void addNext(DeviceBuilder device) {
        this.list.add(device);
    }

    public ArrayList<DeviceBuilder> getClients(){
        return list;
    }

    public void deleteDevice(int idToDelete){
        ArrayList<DeviceBuilder> entity = getClients();
        ListIterator<DeviceBuilder> listIter = entity.listIterator();
        while (listIter.hasNext()){
            DeviceBuilder next = listIter.next();
            if (idToDelete == next.getId()){
                listIter.remove();
            }
        }

    }

}
