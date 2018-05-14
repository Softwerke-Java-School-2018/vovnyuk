package controller.device;

import entities.builders.DeviceBuilder;

class DeviceSearchControllerOutput {

    void deviceSearchControllerOutput(DeviceBuilder device){
        System.out.println("Id:" + device.getId());
        System.out.println("Type:" + device.getSelectedType());
        System.out.println("Manufacturer:" + device.getManufacturer());
        System.out.println("Model:" + device.getModel());
        System.out.println("Colour:" + device.getSelectedColour());
        System.out.println("Price:" + device.getPrice());
        System.out.println("Date of manufacture:" + device.getDateOfManufacture());
    }
}