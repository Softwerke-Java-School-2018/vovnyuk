package view.device;

public class TextForMenu {

    private final static String stringDeviceType = "Select type of the device:  " + "\n" +
            "1. Phone" + "\n" + "2. Tablet" + "\n" + "3. Laptop" + "\n" + "4. Player";

    private final static String stringDeviceColour = "Select colour of the device:" + "\n" + "1. Red" + "\n" +
            "2.Green" + "\n" + "3. Blue";

    private final static String stringDeviceMenu = "Device menu. Choose what you want to do:" + "\n" +
            "1. Add device" + "\n" +
            "2. Find device" + "\n" +
            "3. Show list of devices" + "\n" +
            "4. Delete device" + "\n" +
            "5. Sort list of devices" + "\n" +
            "6. Exit";

    private final static String stringDeviceSortMenu = "User sort menu. Select the attribute by which you want to sort:" + "\n" +
            "1. By type" + "\n" +
            "2. By manufacturer" + "\n" +
            "3. By model" + "\n" +
            "4. By colour" + "\n" +
            "5. By price" + "\n" +
            "6. By date of manufacture" + "\n" +
            "7. Exit";

    private final static String stringDeviceSearchMenu = "Device searching menu. Select the attribute by which you want to search:" + "\n" +
            "1. By type" + "\n" +
            "2. By manufacturer" + "\n" +
            "3. By model" + "\n" +
            "4. By colour" + "\n" +
            "5. By price" + "\n" +
            "6. By date of manufacture" + "\n" +
            "7. Exit";

    public void deviceMenu(){
        System.out.println(stringDeviceMenu);
    }
    public void deviceTypeMenu(){
        System.out.println(stringDeviceType);
    }
    public void deviceColourMenu(){
        System.out.println(stringDeviceColour);
    }
    public void deviceSortMenu(){
        System.out.println(stringDeviceSortMenu);
    }
    public void deviceSearchMenu(){
        System.out.println(stringDeviceSearchMenu);
    }

}
