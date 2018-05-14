package entities.dbOfClientsDevicesAndPurchases;

import controller.device.DeviceController;
import entities.enums.Colours;
import entities.enums.DeviceType;

import java.math.BigDecimal;

public class AddDbOfDevices {

    private DeviceController deviceController = new DeviceController();

    public void addDevices(){

        DeviceType phone = DeviceType.Phone;
        DeviceType tablet = DeviceType.Tablet;
        DeviceType laptop = DeviceType.Laptop;
        DeviceType player = DeviceType.Player;

        Colours blue = Colours.Blue;
        Colours red = Colours.Red;
        Colours black = Colours.Black;
        Colours gold = Colours.Gold;
        Colours silver = Colours.Silver;

        BigDecimal price1 = BigDecimal.valueOf(80000);
        BigDecimal price2 = BigDecimal.valueOf(45000);
        BigDecimal price3 = BigDecimal.valueOf(25000);
        BigDecimal price4 = BigDecimal.valueOf(70000);
        BigDecimal price5 = BigDecimal.valueOf(120000);
        BigDecimal price6 = BigDecimal.valueOf(24000);
        BigDecimal price7 = BigDecimal.valueOf(8000);
        BigDecimal price8 = BigDecimal.valueOf(3000);

        deviceController.create(phone, "Apple",
                "iPhone X", blue, price1, "01/09/2017");
        deviceController.create(phone, "Samsung",
                "Galaxy", red, price2, "17/08/2017");
        deviceController.create(phone, "Huawei",
                "Honor lite", red, price3, "01/09/2016");
        deviceController.create(laptop, "Apple",
                "Mac", blue, price4, "01/09/2017");
        deviceController.create(laptop, "Apple",
                "Mac Pro", black, price5, "01/01/2018");
        deviceController.create(tablet, "Apple",
                "iPad", silver, price6, "24/04/2017");
        deviceController.create(tablet, "ZTE",
                "Blade", gold, price7, "20/06/2017");
        deviceController.create(player, "Sony",
                "NWZ-B1183F", red, price8, "08/03/2015");
    }
}
