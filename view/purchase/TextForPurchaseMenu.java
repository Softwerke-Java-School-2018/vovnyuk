package view.purchase;

class TextForPurchaseMenu {

    private final static String stringPurchaseMenu = "Purchase menu. Choose what do you want to do: " + "\n" +
            "1. Make a new purchase." + "\n" +"2. Find purchase" + "\n" + "3. Show list of purchases" + "\n"
            + "4. Delete purchase" + "\n" + "5. Sort list of purchases" + "\n" + "6. Exit";

    private final static String stringNewPurchaseMenu = "New purchase menu. " +
            "If you are already our client, select 1, if you are the first time here, select 2:";

    private final static String stringFindClientById = "Please enter your client's id: ";

    private final static String stringDoYouWantToRepeat = "Please enter 1 if you want to purchase one more device" +
            " or 2 if you want to finish purchase process:";

    private final static String stringDevicesIdToPurchase = "Please enter the id of" +
            " the device that you want to purchase: ";

    private final static String stringPurchaseSearchMenu = "Purchase searching menu. Select the attribute by which you want to search:" + "\n" +
            "1. By client's first name" + "\n" +
            "2. By client's second name" + "\n" +
            "3. By purchased device's manufacturer" + "\n" +
            "4. By purchased device's model" + "\n" +
            "5. By price of the purchase" + "\n" +
            "6. By date of the purchase" + "\n" +
            "7. By purchase's id" + "\n" +
            "8. Exit";

    private final static String stringPurchaseSortMenu = "Purchase sort menu. Select the attribute by which you want to sort:" + "\n" +
            "1. By client's first name" + "\n" +
            "2. By client's second name" + "\n" +
            "3. By total price of purchase" + "\n" +
            "4. By date of the purchase" + "\n" +
            "5. Exit";

    private final static String stringDateOfPurchase = "Please enter today's date of purchase:";

    void purchaseMenu(){
        System.out.println(stringPurchaseMenu);
    }

    void newPurchaseMenu(){
        System.out.println(stringNewPurchaseMenu);
    }

    void findClientById(){
        System.out.println(stringFindClientById);
    }

    void doYouWantToRepeat(){
        System.out.println(stringDoYouWantToRepeat);
    }

    void devicesIdToPurchase(){
        System.out.println(stringDevicesIdToPurchase);
    }

    void dateOfPurchase(){
        System.out.println(stringDateOfPurchase);
    }

    void purchaseSearchMenu(){
        System.out.println(stringPurchaseSearchMenu);
    }

    void purchaseSortMenu(){
        System.out.println(stringPurchaseSortMenu);
    }
}