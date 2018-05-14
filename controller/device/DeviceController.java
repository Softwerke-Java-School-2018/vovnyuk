package controller.device;

import entities.builders.DeviceBuilder;
import entities.enums.Colours;
import entities.enums.DeviceType;
import model.device.ModelDevice;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DeviceController {

    private static ArrayList<DeviceBuilder> devicesList = ModelDevice.getDevices();
    private DeviceSearchControllerOutput deviceSearchControllerOutput = new DeviceSearchControllerOutput();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void create(DeviceType selectedType, String manufacturer, String model, Colours selectedColour,
                       BigDecimal price, String dateOfManufacture) {
        try {
            LocalDate localDate = LocalDate.parse(dateOfManufacture, formatter);
            DeviceBuilder newDevice = new DeviceBuilder(selectedType, manufacturer, model, selectedColour, price,
                    localDate);
            devicesList.add(newDevice);
        } catch (DateTimeParseException e) {
            System.out.println("Incorrect date of manufacture");
        }
    }

    public void showList() {
        ArrayList<DeviceBuilder> entity = ModelDevice.getDevices();
        if (entity.size() == 0) {
            System.out.println("This list is empty");
        } else {
            for (DeviceBuilder device : entity) {
                deviceSearchControllerOutput.deviceSearchControllerOutput(device);
            }
        }
    }

    public void delete(int idToDelete) {
        ModelDevice modelDevice = new ModelDevice();
        modelDevice.deleteDevice(idToDelete);
    }

}