package controller.device;

import entities.enums.*;
import entities.builders.DeviceBuilder;
import model.device.ModelDevice;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DeviceSearchController {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private DeviceSearchControllerOutput deviceSearchControllerOutput = new DeviceSearchControllerOutput();

    public void findDeviceById(int checkingId) {
        ArrayList<DeviceBuilder> entity = ModelDevice.getDevices();
        int i = 0;
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (DeviceBuilder device : entity) {
                if (checkingId == device.getId()) {
                    deviceSearchControllerOutput.deviceSearchControllerOutput(device);
                } else {
                    i = i + 1;
                }
            }
            if (i == entity.size()) {
                System.out.println("There is no device with such Id(" + checkingId + ")");
            }
        }
    }

    public void findDeviceByType(DeviceType checkingType) {
        ArrayList<DeviceBuilder> entity = ModelDevice.getDevices();
        int i = 0;
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (DeviceBuilder device : entity) {
                if (checkingType.equals(device.getSelectedType())) {
                    deviceSearchControllerOutput.deviceSearchControllerOutput(device);
                } else {
                    i = i + 1;
                }
            }
            if (i == entity.size()) {
                System.out.println("There is no device of such type (" + checkingType + ")");
            }
        }
    }
    public void findDeviceByManufacturer(String checkingManufacturer) {
        ArrayList<DeviceBuilder> entity = ModelDevice.getDevices();
        int i = 0;
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (DeviceBuilder device : entity) {
                if (checkingManufacturer.equals(device.getManufacturer())) {
                    deviceSearchControllerOutput.deviceSearchControllerOutput(device);
                } else {
                    i = i + 1;
                }
            }
            if (i == entity.size()) {
                System.out.println("There is no device of such manufacturer (" + checkingManufacturer + ")");
            }
        }
    }
    public void findDeviceByModel(String checkingModel) {
        ArrayList<DeviceBuilder> entity = ModelDevice.getDevices();
        int i = 0;
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (DeviceBuilder device : entity) {
                if (checkingModel.equals(device.getModel())) {
                    deviceSearchControllerOutput.deviceSearchControllerOutput(device);
                } else {
                    i = i + 1;
                }
            }
            if (i == entity.size()) {
                System.out.println("There is no device of such model (" + checkingModel + ")");
            }
        }
    }
    public void findDeviceByColour(Colours checkingColour) {
        ArrayList<DeviceBuilder> entity = ModelDevice.getDevices();
        int i = 0;
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (DeviceBuilder device : entity) {
                if (checkingColour.equals(device.getSelectedColour())) {
                    deviceSearchControllerOutput.deviceSearchControllerOutput(device);
                } else {
                    i = i + 1;
                }
            }
            if (i == entity.size()) {
                System.out.println("There is no device of such colour (" + checkingColour + ")");
            }
        }
    }
    public void findDeviceByPrice(BigDecimal checkingPrice) {
        ArrayList<DeviceBuilder> entity = ModelDevice.getDevices();
        int i = 0;
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (DeviceBuilder device : entity) {
                if (checkingPrice.equals(device.getPrice())) {
                    deviceSearchControllerOutput.deviceSearchControllerOutput(device);
                } else {
                    i = i + 1;
                }
            }
            if (i == entity.size()) {
                System.out.println("There is no device of such price (" + checkingPrice + ")");
            }
        }
    }
    public void findDeviceByDateOfManufacture(String checkingDateOfManufacture) {
        ArrayList<DeviceBuilder> entity = ModelDevice.getDevices();
        int i = 0;
        LocalDate localDate = LocalDate.parse(checkingDateOfManufacture, formatter);
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (DeviceBuilder device : entity) {
                if (localDate.equals(device.getDateOfManufacture())) {
                    deviceSearchControllerOutput.deviceSearchControllerOutput(device);
                } else {
                    i = i + 1;
                }
            }
            if (i == entity.size()) {
                System.out.println("There is no device manufactured at:" + checkingDateOfManufacture);
            }
        }
    }
}