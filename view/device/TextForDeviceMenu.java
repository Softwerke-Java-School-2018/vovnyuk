package view.device;

class TextForDeviceMenu {

    private final static String stringDeviceType = "Select type of the device:  " + "\n" +
            "1. Phone" + "\n" + "2. Tablet" + "\n" + "3. Laptop" + "\n" + "4. Player";

    private final static String stringDeviceColour = "Select colour of the device:" + "\n" + "1. Red" + "\n" +
            "2.Green" + "\n" + "3. Blue" + "\n" + "4. White" + "\n" + "5. Black" + "\n" + "6. Gold" + "\n"
            + "7. Silver";

    private final static String stringDeviceMenu = "Device menu. Choose what you want to do:" + "\n" +
            "1. Add device" + "\n" +
            "2. Find device" + "\n" +
            "3. Show list of devices" + "\n" +
            "4. Delete device" + "\n" +
            "5. Sort list of devices" + "\n" +
            "6. Exit";

    private final static String stringDeviceSortMenu = "User sort menu. Select the attribute by which you want to sort:" + "\n" +
            "1. By purchase's Id" + "\n" +
            "2. By client's first name" + "\n" +
            "3. By client's second name" + "\n" +
            "4. By manufacturer" + "\n" +
            "5. By model" + "\n" +
            "6. By total price of the purchase" + "\n" +
            "7. By date of purchase" + "\n" +
            "8. Exit";

    private final static String stringDeviceSearchMenu = "Device searching menu. Select the attribute by which you want to search:" + "\n" +
            "1. By type" + "\n" +
            "2. By manufacturer" + "\n" +
            "3. By model" + "\n" +
            "4. By colour" + "\n" +
            "5. By price" + "\n" +
            "6. By date of manufacture" + "\n" +
            "7. By id" + "\n" +
            "8. Exit";

    void deviceMenu(){
        System.out.println(stringDeviceMenu);
    }
    void deviceTypeMenu(){
        System.out.println(stringDeviceType);
    }
    void deviceColourMenu(){
        System.out.println(stringDeviceColour);
    }
    void deviceSortMenu(){
        System.out.println(stringDeviceSortMenu);
    }
    void deviceSearchMenu(){
        System.out.println(stringDeviceSearchMenu);
    }

}
